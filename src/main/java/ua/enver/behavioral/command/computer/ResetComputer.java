package ua.enver.behavioral.command.computer;

/**
 * @author Enver on 19.05.2019 20:02.
 * @project patterns
 */
public class ResetComputer implements Command {
    Computer computer;

    public ResetComputer(Computer computer) {
        this.computer = computer;
    }

    @Override
    public void execute() {
        computer.reset();
    }
}
