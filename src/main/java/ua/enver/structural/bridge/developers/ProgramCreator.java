package ua.enver.structural.bridge.developers;

/**
 * @author Enver on 17.05.2019 1:34.
 * @project patterns
 */
public class ProgramCreator {
    public static void main(String[] args) {
        Program[] programs = {
                new BankSystem(new JavaDeveloper()),
                new StockExchange(new CppDeveloper())
        };

        for (Program program : programs) {
            program.developProgram();
        }
    }
}
