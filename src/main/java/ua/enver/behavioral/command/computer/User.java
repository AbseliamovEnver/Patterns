package ua.enver.behavioral.command.computer;

/**
 * @author Enver on 19.05.2019 20:21.
 * @project patterns
 */
public class User {
    Command start;
    Command reset;
    Command stop;

    public User(Command start, Command reset, Command stop) {
        this.start = start;
        this.reset = reset;
        this.stop = stop;
    }

    void startComputer(){
        start.execute();
    }

    void resetComputer(){
        reset.execute();
    }

    void stopComputer(){
        stop.execute();
    }
}
