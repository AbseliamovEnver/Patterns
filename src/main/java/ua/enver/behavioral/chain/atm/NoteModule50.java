package ua.enver.behavioral.chain.atm;

/**
 * @author Enver on 18.05.2019 21:47.
 * @project patterns
 */
public class NoteModule50 extends NoteModule {
    @Override
    void takeMoney(Money money) {
        int countNote = money.getAtm() / Note.H50;
        int remind = money.getAtm() % Note.H50;

        if (countNote > 0) {
            System.out.println("Issued " + countNote + " banknotes in " + Note.H50 + " hryvnia...");
        }
        if (remind > 0 && next != null) {
            next.takeMoney(new Money(remind));
        }
    }
}
