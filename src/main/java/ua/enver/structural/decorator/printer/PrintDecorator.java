package ua.enver.structural.decorator.printer;

/**
 * @author Enver on 13.05.2019 19:06.
 * @project patterns
 */
public class PrintDecorator {
    public static void main(String[] args) {
        PrinterInterface printer =
                new QuotesDecorator(new HyphenDecorator(new Printer("Hello world")));
        printer.print();
    }
}
