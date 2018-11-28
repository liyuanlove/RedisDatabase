package pl.kago.redisPersistenceManager.api;

import pl.kago.redisPersistenceManager.api.commands.CommandType;

public interface ICommand {

    IData<FieldKey> getData();

    void setData(IData<FieldKey> data);

    CommandType getCommandType();
}