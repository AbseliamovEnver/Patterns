package ua.enver.behavioral.memento.game;

import java.util.Date;

/**
 * @author Enver on 22.05.2019 1:42.
 * @project patterns
 */
public class Game {
    private String level;
    private Date date;

    public void set(String level) {
        this.level = level;
        this.date = new Date();
    }

    public void load(Save save) {
        level = save.getLevel();
        date = save.getDate();
    }

    public Save save() {
        return new Save(level);
    }

    @Override
    public String toString() {
        return "Game:\n" +
                "Level: " + level +
                "\nDate:\t" + date;
    }
}
