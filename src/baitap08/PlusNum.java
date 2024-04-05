package baitap08;

import static baitap08.Baitap08.shareNumber;

public class PlusNum implements Runnable {
    @Override
    public void run() {
        while (true) {
            shareNumber++;
            System.out.println(shareNumber);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
