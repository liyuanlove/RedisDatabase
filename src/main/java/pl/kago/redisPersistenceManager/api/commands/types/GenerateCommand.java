package pl.kago.redisPersistenceManager.api.commands.types;

import pl.kago.redisPersistenceManager.api.commands.CommandType;

public class GenerateCommand extends Command {

    @Override
    public CommandType getCommandType() {
        return CommandType.GENERATE;
    }
}
