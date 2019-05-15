package ua.enver.creational.factory.watch;

/**
 * @author Enver on 14.05.2019 22:01.
 * @project patterns
 */
public class WatchFactory {
    public static void main(String[] args) {
        WatchMaker maker = getMakerByName("Rome");
        Watch watch = maker.createWatch();

        watch.showTime();
    }

    public static WatchMaker getMakerByName(String maker){
        if (maker.equalsIgnoreCase("Digital")){
            return new DigitalWatchMaker();
        }else if (maker.equalsIgnoreCase("Rome")){
            return new RomeWatchMaker();
        }else
            throw new RuntimeException(maker + " is unknown watch");
    }
}
