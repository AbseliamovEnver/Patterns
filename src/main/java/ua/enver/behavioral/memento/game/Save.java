package ua.enver.behavioral.memento.game;

import java.util.Date;

/**
 * @author Enver on 22.05.2019 1:52.
 * @project patterns
 */
public class Save {
    private final String level;
    private final Date date;

    public Save(String level) {
        this.level = level;
        this.date = new Date();
    }

    public String getLevel() {
        return level;
    }

    public Date getDate() {
        return date;
    }
}
