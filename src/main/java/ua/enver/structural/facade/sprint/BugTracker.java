package ua.enver.structural.facade.sprint;

/**
 * @author Enver on 17.05.2019 17:08.
 * @project patterns
 */
public class BugTracker {
    private boolean activeSprint;

    public boolean isActiveSprint(){
        return activeSprint;
    }

    public void startSprint(){
        System.out.println("Sprint is active...");
        activeSprint = true;
    }

    public void finishSprint(){
        System.out.println("Sprint is not active...");
        activeSprint = false;
    }
}
