package ua.enver.structural.decorator.filereader;

/**
 * @author Enver on 14.05.2019 15:13.
 * @project patterns
 */
abstract class FileDecorator implements FileStream{
    FileStream fileStream;

    public FileDecorator(FileStream fileStream){
        this.fileStream = fileStream;
    }

    public abstract void read();
}