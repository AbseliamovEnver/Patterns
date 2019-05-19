package ua.enver.behavioral.command.database;

/**
 * @author Enver on 18.05.2019 22:41.
 * @project patterns
 */
public class UpdateCommand implements Command {
    Database database;

    public UpdateCommand(Database database) {
        this.database = database;
    }

    @Override
    public void execute() {
        database.update();
    }
}
