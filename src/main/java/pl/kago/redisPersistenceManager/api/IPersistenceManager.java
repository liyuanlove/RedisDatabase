package pl.kago.redisPersistenceManager.api;

import javax.ejb.Local;

@Local
public interface IPersistenceManager {

    void updateRowBatch(int iterations);

}