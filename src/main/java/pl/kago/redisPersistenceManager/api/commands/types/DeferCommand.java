package pl.kago.redisPersistenceManager.api.commands.types;

import pl.kago.redisPersistenceManager.api.commands.CommandType;

public class DeferCommand extends Command {

    private static final long serialVersionUID = 6497336313620993299L;

    @Override
    public CommandType getCommandType() {
        return CommandType.DEFER;
    }


}
