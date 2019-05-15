package ua.enver.structural.decorator.printer;

/**
 * @author Enver on 13.05.2019 19:14.
 * @project patterns
 */
abstract class DecoratorAbstract implements PrinterInterface{
    PrinterInterface component;

    public DecoratorAbstract(PrinterInterface component) {
        this.component = component;
    }
}
