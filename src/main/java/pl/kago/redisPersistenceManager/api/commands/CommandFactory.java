package pl.kago.redisPersistenceManager.api.commands;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import pl.kago.redisPersistenceManager.api.ICommand;
import pl.kago.redisPersistenceManager.api.commands.types.*;

public abstract class CommandFactory {

    private static final Logger LOGGER = LogManager.getLogger(CommandFactory.class);

    /**
     * Create new instance of command.
     *
     * @param commandType {@link CommandType} command type
     * @return {@link ICommand} new instance of command
     */
    public static ICommand getCommand(CommandType commandType) {
        LOGGER.debug("Command type: {}", () -> commandType);

        switch (commandType) {
            case UPDATE:
                return new UpdateCommand();
            case GENERATE:
                return new GenerateCommand();
            case REJECT:
                return new RejectCommand();
            case STOP:
                return new StopCommand();
            case DEFER:
                return new DeferCommand();
            default:
                // TODO operation not supported exception
                return null;
        }
    }

}
