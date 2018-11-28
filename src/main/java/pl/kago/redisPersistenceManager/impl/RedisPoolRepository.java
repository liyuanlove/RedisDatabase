package pl.kago.redisPersistenceManager.impl;

import org.redisson.Redisson;
import org.redisson.api.RedissonClient;
import org.redisson.codec.KryoCodec;
import org.redisson.config.Config;

import javax.enterprise.inject.Produces;

public class RedisPoolRepository {

    public static final String ADDRESS = "redis://localhost:6379";
    public static final int RESPONSE_TIMEOUT = 120000;

    private RedissonClient client;

    private RedisPoolRepository() {

        if (client == null) {
            Config config = new Config();
//            config.useClusterServers()
//                    .addNodeAddress("redis://localhost:9001")
//                    .addNodeAddress("redis://localhost:9002")
//                    .addNodeAddress("redis://localhost:9003")
//                    .addNodeAddress("redis://localhost:9004")
//                    .addNodeAddress("redis://localhost:9005")
//                    .addNodeAddress("redis://localhost:9006")
//                    .setRetryAttempts(15)
//                    .setRetryInterval(5000)
//                    .setTimeout(RESPONSE_TIMEOUT);

            config.useSingleServer()
                    .setRetryAttempts(15)
                    .setRetryInterval(5000)
                    .setTimeout(RESPONSE_TIMEOUT)
                    .setAddress(ADDRESS);
            config.setCodec(new KryoCodec());
            client = Redisson.create(config);
        }

    }

    @Produces
    public final RedissonClient getClient() {
        return client;
    }

}
