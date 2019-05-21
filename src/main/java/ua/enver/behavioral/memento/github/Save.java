package ua.enver.behavioral.memento.github;

import java.util.Date;

/**
 * @author Enver on 22.05.2019 0:50.
 * @project patterns
 */
public class Save {
    private final String version;
    private final Date date;

    public Save(String version) {
        this.version = version;
        this.date = new Date();
    }

    public String getVersion() {
        return version;
    }

    public Date getDate() {
        return date;
    }
}
