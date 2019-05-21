package ua.enver.behavioral.memento.game;

/**
 * @author Enver on 22.05.2019 2:06.
 * @project patterns
 */
public class MementoGame {
    public static void main(String[] args) throws InterruptedException {
        Game game = new Game();
        File file = new File();

        game.set("Level 1");
        file.setSave(game.save());
        System.out.println(game);

        Thread.sleep(5000);
        game.set("Level 2");
        System.out.println(game);

        Thread.sleep(3000);
        game.load(file.getSave());
        System.out.println(game);
    }
}
