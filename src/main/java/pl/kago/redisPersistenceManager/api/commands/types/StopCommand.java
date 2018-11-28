package pl.kago.redisPersistenceManager.api.commands.types;

import pl.kago.redisPersistenceManager.api.commands.CommandType;

public class StopCommand extends Command {

    private static final long serialVersionUID = -3790545500479667776L;

    @Override
    public CommandType getCommandType() {
        return CommandType.STOP;
    }
}
