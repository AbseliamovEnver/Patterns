package ua.enver.behavioral.command.computer;

/**
 * @author Enver on 19.05.2019 19:59.
 * @project patterns
 */
public class StartCommand implements Command {
    Computer computer;

    public StartCommand(Computer computer) {
        this.computer = computer;
    }

    @Override
    public void execute() {
        computer.start();
    }
}
