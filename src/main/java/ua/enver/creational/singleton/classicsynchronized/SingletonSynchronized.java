package ua.enver.creational.singleton.classicsynchronized;

/**
 * @author Enver on 15.05.2019 15:37.
 * @project patterns
 */
public class SingletonSynchronized {
    public static void main(String[] args) throws InterruptedException {
        final int sizeThread = 100;

        Thread thread[] = new Thread[sizeThread];

        for (int i = 0; i < sizeThread; i++) {
            thread[i] = new Thread(new Run());
            thread[i].start();
        }
        for (int i = 0; i < sizeThread; i++) {
            thread[i].join();
        }

        System.out.println(Singleton.counter);
    }

    private static class Run implements Runnable {
        @Override
        public void run() {
            Singleton.getInstance();
        }
    }
}
