package ua.enver.creational.prototype.cloneuser;

/**
 * @author Enver on 16.05.2019 17:48.
 * @project patterns
 */
public class User {
    String userName;
    int age;

    public User(String userName, int age) {
        this.userName = userName;
        this.age = age;
    }

    public Object copy() {
        User copy = new User(userName, age);
        return copy;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", age=" + age +
                '}';
    }
}
