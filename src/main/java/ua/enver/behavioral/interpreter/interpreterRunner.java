package ua.enver.behavioral.interpreter;

/**
 * @author Enver on 19.05.2019 22:21.
 * @project patterns
 */
public class interpreterRunner {
    public static void main(String[] args) {
        Expression isJava = getJavaExpression();
        Expression isJavaEEDeveloper = getJavaEEExpression();

        System.out.println("Does developer knows Java Core: " + isJava.interpret("Java Core"));
        System.out.println("Does developer knows Java EE: " + isJavaEEDeveloper.interpret("Java Spring"));
    }

    private static Expression getJavaExpression() {
        Expression java = new TerminalExpression("Java");
        Expression javaCore = new TerminalExpression("Java Core");

        return new OrExpression(java, javaCore);
    }

    private static Expression getJavaEEExpression() {
        Expression java = new TerminalExpression("Java");
        Expression spring = new TerminalExpression("Spring");

        return new AndExpression(java, spring);
    }
}
