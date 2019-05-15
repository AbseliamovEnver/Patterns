package ua.enver.structural.decorator.developer;

/**
 * @author Enver on 13.05.2019 17:09.
 * @project patterns
 */
public class JavaDeveloper implements Developer{
    @Override
    public String makeJob() {
        return "Write Java code.";
    }
}
