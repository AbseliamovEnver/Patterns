package ua.enver.behavioral.command.computer;

/**
 * @author Enver on 19.05.2019 20:05.
 * @project patterns
 */
public class StopComputer implements Command {
    Computer computer;

    public StopComputer(Computer computer) {
        this.computer = computer;
    }

    @Override
    public void execute() {
        computer.stop();
    }
}
