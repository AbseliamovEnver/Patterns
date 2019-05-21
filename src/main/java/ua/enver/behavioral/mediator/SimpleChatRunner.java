package ua.enver.behavioral.mediator;

/**
 * @author Enver on 21.05.2019 23:44.
 * @project patterns
 */
public class SimpleChatRunner {
    public static void main(String[] args) {
        SimpleTextChat chat = new SimpleTextChat();

        User admin = new Admin("Admin", chat);
        User user1 = new SimpleUser("User 1", chat);
        User user2 = new SimpleUser("User 2", chat);

        chat.setAdmin(admin);
        chat.addUserToChat(user1);
        chat.addUserToChat(user2);

        user1.sendMessage("Hello, I'm User 1");
        System.out.println();
        admin.sendMessage("Hello, I'm Admin");
    }
}
