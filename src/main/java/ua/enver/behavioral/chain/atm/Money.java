package ua.enver.behavioral.chain.atm;

import static ua.enver.behavioral.chain.atm.Note.H50;

/**
 * @author Enver on 18.05.2019 21:13.
 * @project patterns
 */
public class Money {
    private int atm;

    public Money(int atm) {
        setAtm(atm);
    }

    public void setAtm(int atm) {
        if (atm > 0 && atm <= 20_000 && atm % H50 == 0) {
            this.atm = atm;
        } else {
            throw new RuntimeException("The amount must be less than 20,000 and a multiple of 50...");
        }
    }

    public int getAtm() {
        return atm;
    }
}
