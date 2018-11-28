package pl.kago.redisPersistenceManager.impl;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.joda.JodaModule;
import com.fasterxml.jackson.module.afterburner.AfterburnerModule;
import org.redisson.api.BatchOptions;
import org.redisson.api.RBatch;
import org.redisson.api.RMapAsync;
import org.redisson.api.RedissonClient;
import org.redisson.client.RedisException;
import pl.kago.redisPersistenceManager.api.IPersistenceManager;
import pl.kago.redisPersistenceManager.api.RecordType;
import pl.kago.redisPersistenceManager.model.Customer;

import javax.annotation.PostConstruct;
import javax.ejb.Stateless;
import javax.inject.Inject;
import java.util.concurrent.TimeUnit;

@Stateless
public class PersistenceManager implements IPersistenceManager {

    @Inject
    RedisPoolRepository repository;

    private final ObjectMapper mapper = new ObjectMapper();

    @PostConstruct
    private void init() {
        mapper.registerModule(new AfterburnerModule());
        mapper.registerModule(new JodaModule());
    }

    private String constructJson(Long id) throws JsonProcessingException {
        Customer customer = new Customer();
        customer.ID = id;
        customer.DATA_PACKAGE_ID = 1234;
        customer.REC_TYPE = 1;
        customer.TICKET_GRP = 1111l;
        customer.TICKET_SEQ_NO = 2222l;
        customer.REC_FMT_VER = 111;
        customer.TRANS_TYPE = "C";
        customer.LEDGER_REGION = "FIN";
        customer.LOCAL_CUST_ID = "ABC";
        customer.CUST_GRP_VAL_TYPE = "DEF";
        customer.GL_CUST_GRP = "GHI";
        customer.PERF_VAL_TYPE = "JKL";
        customer.PERF_STATUS = "MNO";
        customer.C_COMP_VAL_TYPE = "XYZ";
        customer.C_COMP_CODE = "ZXY";
        customer.C_AU_VAL_TYPE = "AAA";
        customer.C_ACC_UNIT = "BBB";
        customer.COUNTRY = "FINLAND";
        customer.EXTRA1_VAL_TYPE = "FFF";
        customer.EXTRA1 = "HHH";
        customer.EXTRA2_VAL_TYPE = "HHH";
        customer.EXTRA2 = "GGG";
        customer.STATUS_IND = "TTT";
        customer.BOOKING_GROUP = 12;
        customer.BOOKING_TYPE = 33L;
        customer.COMPANY_CODE = "RRR";
        customer.EXTRA_GLACC_DET1 = "AAA";
        customer.RULE_NAME = "AddingCUF";
        customer.PROC_INSTANCE_EXEC_ID = "312341234123412342-1234123423412341";
        customer.CRU_VAL_TYPE = "JJJ";
        customer.CRU = "WER";
        customer.SECTOR_VAL_TYPE = "VVV";
        customer.SECTOR = "GGG";
        customer.STATUS = "A";

        return mapper.writeValueAsString(customer);
    }

    private void insertBatch(RedissonClient client, int iterations) throws JsonProcessingException, RedisException {
        BatchOptions batchOptions = BatchOptions.defaults()
                .executionMode(BatchOptions.ExecutionMode.REDIS_WRITE_ATOMIC);
        RBatch batch = client.createBatch(batchOptions);
        RMapAsync<String, String> map = batch.getMap(RecordType.CUSTOMER.value());
        for (long i = 1; i < iterations; i++) {
            String json = constructJson(i);
            map.fastPutAsync(String.valueOf(i), json);
        }
        batch.execute();
    }

    @Override
    public void updateRowBatch(int iterations) {
        RedissonClient client = repository.getClient();
        try {
            Long start = System.currentTimeMillis();
            for (int i = 0; i < 10; i++) {
                insertBatch(client, iterations);
            }
            Long total = System.currentTimeMillis() - start;
            System.out.println("Execution time (" + iterations + " batched inserts) = " + (total / 1000) + "s");
        } catch (RedisException | JsonProcessingException e) {
            e.printStackTrace();
        } finally {
            //client.shutdown();
        }
    }

}
