package ua.enver.structural.facade.sprint;

/**
 * @author Enver on 17.05.2019 17:13.
 * @project patterns
 */
public class Developer {
    public void doJobBeforeDeadLine(BugTracker bugTracker){
        if (bugTracker.isActiveSprint()){
            System.out.println("Developer is solving problems...");
        } else {
            System.out.println("Developer is reading manual...");
        }
    }
}
