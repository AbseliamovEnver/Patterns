package ua.enver.structural.facade.computer;

/**
 * @author Enver on 17.05.2019 18:08.
 * @project patterns
 */
public class DVDRom {
    private boolean data = false;

    public boolean hasData() {
        return data;
    }

    public void load() {
        data = true;
    }

    public void unload() {
        data = false;
    }
}
