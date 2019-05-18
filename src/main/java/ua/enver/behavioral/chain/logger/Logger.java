package ua.enver.behavioral.chain.logger;

/**
 * @author Enver on 18.05.2019 20:29.
 * @project patterns
 */
public abstract class Logger {
    int priority;
    Logger next;

    public Logger(int priority) {
        this.priority = priority;
    }

    public void setNext(Logger next) {
        this.next = next;
    }

    public void writeMessage(String message, int level) {
        if (level <= priority) {
            write(message);
        }
        if (next != null) {
            next.writeMessage(message, level);
        }
    }

    abstract void write(String message);
}
