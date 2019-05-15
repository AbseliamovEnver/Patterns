package ua.enver.structural.decorator.printer;

/**
 * @author Enver on 13.05.2019 19:18.
 * @project patterns
 */
public class QuotesDecorator extends DecoratorAbstract {

    public QuotesDecorator(PrinterInterface component) {
        super(component);
    }

    @Override
    public void print() {
        System.out.print("\"");
        component.print();
        System.out.print("\"");
    }
}
