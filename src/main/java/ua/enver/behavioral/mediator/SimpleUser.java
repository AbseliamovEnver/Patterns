package ua.enver.behavioral.mediator;

/**
 * @author Enver on 21.05.2019 23:33.
 * @project patterns
 */
public class SimpleUser implements User {
    String name;
    Chat chat;

    public SimpleUser(String name, Chat chat) {
        this.name = name;
        this.chat = chat;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void sendMessage(String message) {
        chat.sendMessage(message, this);
    }

    @Override
    public void getMessage(String message) {
        System.out.println(this.name + " receiving message: " + message + "...");
    }
}
