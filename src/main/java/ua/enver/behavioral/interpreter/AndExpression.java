package ua.enver.behavioral.interpreter;

/**
 * @author Enver on 19.05.2019 21:55.
 * @project patterns
 */
public class AndExpression implements Expression {
    private Expression expression1;
    private Expression expression2;

    public AndExpression(Expression expression1, Expression expression2) {
        this.expression1 = expression1;
        this.expression2 = expression2;
    }

    @Override
    public boolean interpret(String context) {
        return expression1.interpret(context) && expression2.interpret(context);
    }
}
