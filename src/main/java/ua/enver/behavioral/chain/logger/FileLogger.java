package ua.enver.behavioral.chain.logger;

/**
 * @author Enver on 18.05.2019 20:40.
 * @project patterns
 */
public class FileLogger extends Logger {

    public FileLogger(int priority) {
        super(priority);
    }

    @Override
    void write(String message) {
        System.out.println("File logger " + message + "...");
    }
}
