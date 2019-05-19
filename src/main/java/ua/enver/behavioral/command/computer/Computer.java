package ua.enver.behavioral.command.computer;

/**
 * @author Enver on 19.05.2019 19:52.
 * @project patterns
 */
public class Computer {
    void start(){
        System.out.println("Computer is started...");
    }

    void reset(){
        System.out.println("Computer is reboot...");
    }

    void stop(){
        System.out.println("Computer is stopped...");
    }
}
