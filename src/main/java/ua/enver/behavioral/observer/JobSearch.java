package ua.enver.behavioral.observer;

/**
 * @author Enver on 22.05.2019 13:50.
 * @project patterns
 */
public class JobSearch {
    public static void main(String[] args) {
        JavaDeveloperJobSite jobSite = new JavaDeveloperJobSite();

        jobSite.addVacancy("First Java vacancy");
        jobSite.addVacancy("Second Java vacancy");

        Observer firstSubscriber = new Subscriber("Enver");
        Observer secondSubscriber = new Subscriber("Max");

        jobSite.addObserver(firstSubscriber);
        jobSite.addObserver(secondSubscriber);

        jobSite.addVacancy("Third Java vacancy");

        jobSite.removeVacancy("First Java vacancy");
    }
}
