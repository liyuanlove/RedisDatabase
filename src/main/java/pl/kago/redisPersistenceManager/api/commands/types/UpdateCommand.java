package pl.kago.redisPersistenceManager.api.commands.types;

import pl.kago.redisPersistenceManager.api.commands.CommandType;

public class UpdateCommand extends Command {

    private static final long serialVersionUID = -5249877798248975967L;

    @Override
    public CommandType getCommandType() {
        return CommandType.UPDATE;
    }

}
