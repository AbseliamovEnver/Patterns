package ua.enver.creational.singleton.logger;

/**
 * @author Enver on 15.05.2019 14:36.
 * @project patterns
 */
public class ProgramRunner {
    public static void main(String[] args) {
        ProgramLogger.getProgramLogger().addLogInfo("First log...");
        ProgramLogger.getProgramLogger().addLogInfo("Second log...");
        ProgramLogger.getProgramLogger().addLogInfo("Third log...");

        ProgramLogger.getProgramLogger().showLogFile();
    }
}
