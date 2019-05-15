package ua.enver.structural.decorator.printer;

/**
 * @author Enver on 14.05.2019 14:28.
 * @project patterns
 */
public class HyphenDecorator extends DecoratorAbstract{

    public HyphenDecorator(PrinterInterface component) {
        super(component);
    }

    @Override
    public void print() {
        System.out.print("- ");
        component.print();
    }
}
