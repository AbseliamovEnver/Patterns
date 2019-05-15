package ua.enver.structural.decorator.filereader;

/**
 * @author Enver on 14.05.2019 15:09.
 * @project patterns
 */
public class FileReader {
    public static void main(String[] args) {
        FileStream fileStream = new FileBufferedReader(new FileStreamReader());
        fileStream.read();
    }
}
