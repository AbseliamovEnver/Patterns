package ua.enver.structural.facade.computer;

/**
 * @author Enver on 17.05.2019 18:16.
 * @project patterns
 */
public class Computer {
    Power power = new Power();
    DVDRom dvdRom = new DVDRom();
    HDD hdd = new HDD();

    void copy(){
        power.on();
        dvdRom.load();
        dvdRom.unload();
        hdd.copyFromDVD(dvdRom);
    }
}
