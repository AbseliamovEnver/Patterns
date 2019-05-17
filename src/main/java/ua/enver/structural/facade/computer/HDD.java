package ua.enver.structural.facade.computer;

/**
 * @author Enver on 17.05.2019 18:12.
 * @project patterns
 */
public class HDD {
    public void copyFromDVD(DVDRom dvd){
        if (dvd.hasData()){
            System.out.println("Copy from DVD...");
        }else {
            System.out.println("Not DVD disk...");
        }
    }
}
