package pl.kago.redisPersistenceManager.api.commands.types;

import org.apache.commons.lang3.builder.ToStringBuilder;
import pl.kago.redisPersistenceManager.api.FieldKey;
import pl.kago.redisPersistenceManager.api.ICommand;
import pl.kago.redisPersistenceManager.api.IData;

public abstract class Command implements ICommand {

    private IData<FieldKey> data;

    @Override
    public IData<FieldKey> getData() {
        return this.data;
    }

    @Override
    public void setData(IData<FieldKey> data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("data", data)
                .append("command type", getCommandType())
                .toString();
    }
}
