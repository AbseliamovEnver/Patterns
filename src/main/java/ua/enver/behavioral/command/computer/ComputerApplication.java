package ua.enver.behavioral.command.computer;

/**
 * @author Enver on 19.05.2019 20:09.
 * @project patterns
 */
public class ComputerApplication {
    public static void main(String[] args) {

        Computer computer = new Computer();
        User user = new User(new StartCommand(computer),
                new ResetComputer(computer),
                new StopComputer(computer));
        user.startComputer();
        user.resetComputer();
        user.stopComputer();
    }
}
