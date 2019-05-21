package ua.enver.behavioral.memento.github;

/**
 * @author Enver on 22.05.2019 0:57.
 * @project patterns
 */
public class GithubRepo {
    private Save save;

    public Save getSave() {
        return save;
    }

    public void setSave(Save save) {
        this.save = save;
    }
}
