package pl.kago.redisPersistenceManager.api;

import java.util.Queue;

public interface ICommandQueue {

    void addCommand(ICommand command);

    void addCommands(ICommandQueue commandQueue);

    Queue<ICommand> getCommands();
}
