package ua.enver.behavioral.command;

/**
 * @author Enver on 18.05.2019 22:35.
 * @project patterns
 */
public class Database {

    public void insert(){
        System.out.println("Inserting record...");
    }

    public void update(){
        System.out.println("Updating record...");
    }

    public void select(){
        System.out.println("Reading record...");
    }

    public void delete(){
        System.out.println("Deleting record...");
    }
}
