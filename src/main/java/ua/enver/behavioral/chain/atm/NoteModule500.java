package ua.enver.behavioral.chain.atm;

/**
 * @author Enver on 18.05.2019 21:31.
 * @project patterns
 */
public class NoteModule500 extends NoteModule {
    @Override
    void takeMoney(Money money) {
        int countNote = money.getAtm() / Note.H500;
        int remind = money.getAtm() % Note.H500;

        if (countNote > 0) {
            System.out.println("Issued " + countNote + " banknotes in " + Note.H500 + " hryvnia...");
        }
        if (remind > 0 && next != null) {
            next.takeMoney(new Money(remind));
        }
    }
}
