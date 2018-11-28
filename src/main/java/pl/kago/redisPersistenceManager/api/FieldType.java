package pl.kago.redisPersistenceManager.api;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public enum FieldType {

    STRING("String") {
        @Override
        public String toDBFormat(Object value) {
            return value == null ? "null" : "'" + value + "'";
        }
    },

    BIG_DECIMAL("BigDecimal") {
        @Override
        public String toDBFormat(Object value) {
            return value == null ? "null" : value.toString();
        }
    },

    INTEGER("Integer") {
        @Override
        public String toDBFormat(Object value) {
            return value == null ? "null" : value.toString();
        }
    },

    LONG("Long") {
        @Override
        public String toDBFormat(Object value) {
            return value == null ? "null" : value.toString();
        }
    },

    LOCAL_DATE("LocalDate") {
        @Override
        public String toDBFormat(Object value) {
            if (value == null) {
                return "null";
            }
            if(value instanceof Timestamp) {
                Timestamp timestamp = (Timestamp)value;
                LocalDate date = timestamp.toLocalDateTime().toLocalDate();
                value = date;
            }
            LocalDate date = (LocalDate) value;
            return "to_date('" + date.format(DateTimeFormatter.ofPattern("yyyy-MM-dd")) + "', 'YYYY-MM-DD')";
        }
    },

    LOCAL_DATE_TIME("LocalDateTime") {
        @Override
        public String toDBFormat(Object value) {
            if (value == null) {
                return "null";
            }
            return "'" + value.toString() + "'";
        }
    };

    private String value;

    FieldType(String value) {
        this.value = value;
    }

    public String value() {
        return value;
    }

    public abstract String toDBFormat(Object value);

    public static FieldType fromValue(String value) {
        for (FieldType fieldType : FieldType.values()) {
            if (fieldType.value.equals(value)) {
                return fieldType;
            }
        }

        throw new IllegalArgumentException(value);
    }
}
