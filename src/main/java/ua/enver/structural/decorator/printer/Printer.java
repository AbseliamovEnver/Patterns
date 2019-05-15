package ua.enver.structural.decorator.printer;

/**
 * @author Enver on 13.05.2019 19:09.
 * @project patterns
 */
public class Printer implements PrinterInterface{
    String value;

    public Printer(String value) {
        this.value = value;
    }

    @Override
    public void print(){
        System.out.print(value);
    }
}
