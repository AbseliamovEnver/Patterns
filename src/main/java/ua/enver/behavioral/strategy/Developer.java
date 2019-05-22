package ua.enver.behavioral.strategy;

/**
 * @author Enver on 22.05.2019 23:25.
 * @project patterns
 */
public class Developer {
    Activity activity;

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public void executeActivity(){
        activity.justDoIt();
    }
}
