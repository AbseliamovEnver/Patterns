package ua.enver.structural.bridge.developers;

/**
 * @author Enver on 17.05.2019 1:32.
 * @project patterns
 */
public class StockExchange extends Program {

    protected StockExchange(Developer developer) {
        super(developer);
    }

    @Override
    public void developProgram() {
        System.out.println("Stock Exchange development in progress...");
        developer.writeCode();
    }
}
