package ua.enver.creational.prototype.cloneuser;

/**
 * @author Enver on 16.05.2019 18:02.
 * @project patterns
 */
public class UserClone {
    public static void main(String[] args) {
        User original = new User("Enver", 30);

        System.out.println(original);

        UserFactory factory = new UserFactory(original);
        User copyOriginal = factory.userCopy();

        System.out.println(copyOriginal);
    }
}
