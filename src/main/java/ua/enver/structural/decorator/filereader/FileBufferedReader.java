package ua.enver.structural.decorator.filereader;

/**
 * @author Enver on 14.05.2019 15:20.
 * @project patterns
 */
public class FileBufferedReader extends FileDecorator{

    public FileBufferedReader(FileStream fileStream) {
        super(fileStream);
    }

    @Override
    public void read() {
        fileStream.read();
        System.out.println("File buffered read.");
    }
}
