package ua.enver.behavioral.command;

/**
 * @author Enver on 18.05.2019 22:43.
 * @project patterns
 */
public class DeleteCommand implements Command {
    Database database;

    public DeleteCommand(Database database) {
        this.database = database;
    }

    @Override
    public void execute() {
        database.delete();
    }
}
