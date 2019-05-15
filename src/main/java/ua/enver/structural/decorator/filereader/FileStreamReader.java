package ua.enver.structural.decorator.filereader;

/**
 * @author Enver on 14.05.2019 15:12.
 * @project patterns
 */
public class FileStreamReader implements FileStream{
    @Override
    public void read() {
        System.out.println("Read file.");
    }
}
