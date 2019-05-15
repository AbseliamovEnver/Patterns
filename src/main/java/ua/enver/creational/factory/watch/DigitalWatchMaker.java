package ua.enver.creational.factory.watch;

/**
 * @author Enver on 14.05.2019 22:08.
 * @project patterns
 */
public class DigitalWatchMaker implements WatchMaker {
    @Override
    public Watch createWatch() {
        return new DigitalWatch();
    }
}
