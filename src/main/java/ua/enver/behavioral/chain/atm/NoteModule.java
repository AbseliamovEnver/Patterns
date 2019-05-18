package ua.enver.behavioral.chain.atm;

/**
 * @author Enver on 18.05.2019 21:25.
 * @project patterns
 */
public abstract class NoteModule {
    protected NoteModule next;

    abstract void takeMoney(Money money);

    void setNextMoneyModule(NoteModule module) {
        next = module;
    }
}
