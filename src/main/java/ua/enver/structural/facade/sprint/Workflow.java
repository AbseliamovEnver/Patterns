package ua.enver.structural.facade.sprint;

/**
 * @author Enver on 17.05.2019 17:20.
 * @project patterns
 */
public class Workflow {
    Developer developer = new Developer();
    Job job = new Job();
    BugTracker bugTracker = new BugTracker();

    public void solveProblems() {
        job.doJob();
        bugTracker.startSprint();
        developer.doJobBeforeDeadLine(bugTracker);
    }
}
