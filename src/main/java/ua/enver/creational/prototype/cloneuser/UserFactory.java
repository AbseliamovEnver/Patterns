package ua.enver.creational.prototype.cloneuser;

/**
 * @author Enver on 16.05.2019 17:52.
 * @project patterns
 */
public class UserFactory {
    User user;

    public UserFactory(User user) {
        setUser(user);
    }

    public void setUser(User user) {
        this.user = user;
    }

    User userCopy() {
        return (User) user.copy();
    }
}
