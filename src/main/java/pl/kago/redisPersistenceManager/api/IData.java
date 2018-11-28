package pl.kago.redisPersistenceManager.api;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public interface IData<K> extends Iterable<K> {

    void setAsString(K fieldKey, String value);

    void setAsInteger(K fieldKey, Integer value);

    void setAsBigDecimal(K fieldKey, BigDecimal value);

    void setAsDouble(K fieldKey, Double value);

    void setAsLong(K fieldKey, Long value);

    void setAsLocalDate(K fieldKey, LocalDate localDate);

    void setAsLocalDateTime(K fieldKey, LocalDateTime localDateTime);

    void setAsObject(K fieldKey, Object value);

    void setAsNull(K fieldKey);

    Object getAsObject(K fieldKey);

    String getAsString(K fieldKey);

    Integer getAsInteger(K fieldKey);

    BigDecimal getAsBigDecimal(K fieldKey);

    Double getAsDouble(K fieldKey);

    Long getAsLong(K fieldKey);

    LocalDate getAsLocalDate(K fieldKey);

    LocalDateTime getAsLocalDateTime(K fieldKey);

    IData<K> getLookupRecord();

    void setLookupRecord(IData<K> record);

    void addLookupRecord(IData<K> record);

    List<IData<K>> getLookupRecords();

    void setLookupRecords(List<IData<K>> records);

    Set<K> getKeys();

    Iterator<K> iterator();

    Iterator<Map.Entry<K, Object>> entryIterator();
}
