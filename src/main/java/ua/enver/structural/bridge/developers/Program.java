package ua.enver.structural.bridge.developers;

/**
 * @author Enver on 17.05.2019 1:22.
 * @project patterns
 */
public abstract class Program {
    protected Developer developer;

    protected Program(Developer developer) {
        this.developer = developer;
    }

    public abstract void developProgram();
}
