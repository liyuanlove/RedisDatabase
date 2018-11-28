package pl.kago.redisPersistenceManager.api;

public enum RecordType {
    
    TRANSACTION_RECORD("TRANSACTION_RECORD", FieldKey.POSTING_DATE),
    BALANCE("BALANCE", FieldKey.RECORD_DATE),
    CONTRACT("CONTRACT", FieldKey.RECORD_DATE),
    CUSTOMER("CUSTOMER", null),
    INFO_RECORD("INFO_RECORD", FieldKey.RECORD_DATE),
    GL_RECON_RECORD("GL_RECON_RECORD", FieldKey.POSTING_DATE),
    ABSTRACT_RECORD("ABSTRACT_RECORD", null);

    private final String value;
    private final FieldKey defaultDateFilterField;

    RecordType(String v, FieldKey defaultDateFilterField) {
        this.value = v;
        this.defaultDateFilterField = defaultDateFilterField;
    }

    public String value() {
        return value;
    }
    
    public FieldKey getDefaultDateFilterField() {
        return defaultDateFilterField;
    }

    public static RecordType fromValue(String v) {
        for (RecordType c : RecordType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}
