package ua.enver.creational.factory.watch;

/**
 * @author Enver on 14.05.2019 22:10.
 * @project patterns
 */
public class RomeWatchMaker implements WatchMaker {
    @Override
    public Watch createWatch() {
        return new RomeWatch();
    }
}
