package ua.enver.behavioral.chain.atm;

/**
 * @author Enver on 18.05.2019 21:49.
 * @project patterns
 */
public class ATMRunner {
    public static void main(String[] args) {
        NoteModule note500 = new NoteModule500();
        NoteModule note200 = new NoteModule200();
        NoteModule note100 = new NoteModule100();
        NoteModule note50 = new NoteModule50();

        note500.setNextMoneyModule(note200);
        note200.setNextMoneyModule(note100);
        note100.setNextMoneyModule(note50);

        note500.takeMoney(new Money(2_250));
    }
}
