package ua.enver.behavioral.interpreter;

/**
 * @author Enver on 19.05.2019 22:10.
 * @project patterns
 */
public class OrExpression implements Expression{
    Expression expression1;
    Expression expression2;

    public OrExpression(Expression expression1, Expression expression2) {
        this.expression1 = expression1;
        this.expression2 = expression2;
    }

    @Override
    public boolean interpret(String context) {
        return expression1.interpret(context) || expression2.interpret(context);
    }
}
