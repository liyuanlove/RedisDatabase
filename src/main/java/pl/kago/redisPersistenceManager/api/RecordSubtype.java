package pl.kago.redisPersistenceManager.api;

public enum RecordSubtype {

    /* Transactions */
    CT("CT", RecordType.TRANSACTION_RECORD),
    CR("CR", RecordType.TRANSACTION_RECORD),
    TLC("TLC", RecordType.TRANSACTION_RECORD),
    TL("TL", RecordType.TRANSACTION_RECORD),
    TLP("TLP", RecordType.TRANSACTION_RECORD),
    TR("TR", RecordType.TRANSACTION_RECORD),
    GL("GL", RecordType.TRANSACTION_RECORD),
    RGT("RGT", RecordType.TRANSACTION_RECORD),
    XTC("XTC", RecordType.TRANSACTION_RECORD),
    XRC("XRC", RecordType.TRANSACTION_RECORD),
    XTG("XTG", RecordType.TRANSACTION_RECORD),
    XRG("XRG", RecordType.TRANSACTION_RECORD),
    TRANSACTION_RECORD("TRANSACTION_RECORD", RecordType.ABSTRACT_RECORD),

    /* Customer  */
    CUF("CUF", RecordType.CUSTOMER),

    /* Contract   */
    COF("COF", RecordType.CONTRACT),

    /* Balances */
    BBS("BBS", RecordType.BALANCE),
    BOB("BOB", RecordType.BALANCE),
    BPL("BPL", RecordType.BALANCE),
    RR("RR", RecordType.BALANCE),
    RTR("RTR", RecordType.BALANCE),
    BALANCE("BALANCE", RecordType.ABSTRACT_RECORD),

    /* InfoRecord */
    INF("INF", RecordType.INFO_RECORD),
    INFO_RECORD("INFO_RECORD", RecordType.ABSTRACT_RECORD),

    /* GLReconRecord  */
    RGL("RGL", RecordType.GL_RECON_RECORD),
    GL_RECON_RECORD("GL_RECON_RECORD", RecordType.ABSTRACT_RECORD),

    /* Output records */
    COMREC("COMREC", RecordType.ABSTRACT_RECORD),
    Adjustment1("Adjustment1", RecordType.ABSTRACT_RECORD),
    GAP2("GAP2", RecordType.ABSTRACT_RECORD),
    ZRGAP2TR("ZRGAP2TR", RecordType.ABSTRACT_RECORD);

    private final String value;
    private final RecordType recordType;

    RecordSubtype(String v, RecordType RecordType) {
        this.value = v;
        this.recordType = RecordType;
    }

    public static RecordSubtype fromValue(String v) {
        for (RecordSubtype c : RecordSubtype.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }

        throw new IllegalArgumentException(v);
    }

    public String value() {
        return value;
    }

    public RecordType getRecordType() {
        return recordType;
    }
}
