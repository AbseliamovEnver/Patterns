package ua.enver.behavioral.command;

/**
 * @author Enver on 18.05.2019 22:42.
 * @project patterns
 */
public class SelectCommand implements Command {
    Database database;

    public SelectCommand(Database database) {
        this.database = database;
    }

    @Override
    public void execute() {
        database.select();
    }
}
