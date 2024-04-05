package baitap05;

public class TestThread {
    public static void main(String[] args) {
        OldThread oldThread = new OldThread();
        EvenThread evenThread = new EvenThread();
        oldThread.start();
        try {
            oldThread.join(150);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        evenThread.start();
    }
}
