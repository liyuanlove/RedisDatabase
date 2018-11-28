package pl.kago.redisPersistenceManager.api.commands.types;

import pl.kago.redisPersistenceManager.api.commands.CommandType;

public class RejectCommand extends Command {

    private static final long serialVersionUID = -9048105820271107217L;

    @Override
    public CommandType getCommandType() {
        return CommandType.REJECT;
    }

}
