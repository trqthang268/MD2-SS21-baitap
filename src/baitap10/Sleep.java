package baitap10;

public class Sleep extends Thread{
    @Override
    public void run() {
        try {
            Thread.sleep(1000);
            System.out.println("Kết thúc ngủ");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
