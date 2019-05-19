package ua.enver.behavioral.command.database;

/**
 * @author Enver on 18.05.2019 22:34.
 * @project patterns
 */
public class InsertCommand implements Command {
    Database database;

    public InsertCommand(Database database) {
        this.database = database;
    }

    @Override
    public void execute() {
        database.insert();
    }
}
