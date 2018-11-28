package pl.kago.redisPersistenceManager.api.commands;

public enum CommandType {

    UPDATE,
    // an update of the processed data record
    GENERATE,
    // a creation of new data record
    REJECT,
    // a rejection of the processed data record
    STOP,
    // an exclude of the processed data record from further execution chain
    DEFER,
    // postpone a processing of current data record till specified date
    NOTIFY   // a provision of the message of type info, warning, error

}
