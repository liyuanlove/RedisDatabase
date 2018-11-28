package pl.kago.redisPersistenceManager.model;

import lombok.Data;

@Data
public class Customer {
    
    public Long ID;
    public Integer DATA_PACKAGE_ID;
    public Integer REC_TYPE;
    public Long TICKET_GRP;
    public Long TICKET_SEQ_NO;
    public Integer REC_FMT_VER;
    public String TRANS_TYPE;
    public String LEDGER_REGION;
    public String LOCAL_CUST_ID;
    public String CUST_GRP_VAL_TYPE;
    public String GL_CUST_GRP;
    public String PERF_VAL_TYPE;
    public String PERF_STATUS;
    public String C_COMP_VAL_TYPE;
    public String C_COMP_CODE;
    public String C_AU_VAL_TYPE;
    public String C_ACC_UNIT;
    public String COUNTRY;
    public String EXTRA1_VAL_TYPE;
    public String EXTRA1;
    public String EXTRA2_VAL_TYPE;
    public String EXTRA2;
    public String STATUS_IND;
    public Integer BOOKING_GROUP;
    public Long BOOKING_TYPE;
    public String COMPANY_CODE;
    public String EXTRA_GLACC_DET1;
    public String RULE_NAME;
    public String PROC_INSTANCE_EXEC_ID;
    public String CRU_VAL_TYPE;
    public String CRU;
    public String SECTOR_VAL_TYPE;
    public String SECTOR;
    public String STATUS;

}
