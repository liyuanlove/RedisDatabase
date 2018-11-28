package pl.kago.redisPersistenceManager.api.commands;

import org.apache.commons.lang3.builder.ToStringBuilder;
import pl.kago.redisPersistenceManager.api.ICommand;
import pl.kago.redisPersistenceManager.api.ICommandQueue;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Class representing queue of commands from rule/block/pipline.
 *
 * @author Karol_Golunski
 */
public class CommandQueue implements ICommandQueue {

    private static final long serialVersionUID = 8465020642539008243L;
    private LinkedList<ICommand> iCommands;

    public CommandQueue() {
        this.iCommands = new LinkedList<>();
    }

    /**
     * Add command to queue.
     *
     * @param command command to be added to queue
     */
    @Override
    public void addCommand(ICommand command) {
        this.iCommands.add(command);
    }

    /**
     * Get all commands from queue.
     *
     * @return queue of commands
     */
    @Override
    public Queue<ICommand> getCommands() {
        return this.iCommands;
    }

    @Override
    public void addCommands(ICommandQueue commandQueue) {
        this.iCommands.addAll(commandQueue.getCommands());

    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("commands", iCommands)
                .toString();
    }
}
