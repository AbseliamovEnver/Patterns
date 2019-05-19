package ua.enver.behavioral.interpreter;

/**
 * @author Enver on 19.05.2019 22:15.
 * @project patterns
 */
public class TerminalExpression implements Expression{
    String data;

    public TerminalExpression(String data) {
        this.data = data;
    }

    @Override
    public boolean interpret(String context) {
        if (context.contains(data)){
            return true;
        }
        return false;
    }
}
