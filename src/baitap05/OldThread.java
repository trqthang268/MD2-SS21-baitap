package baitap05;

public class OldThread extends Thread{
    public static final String GREEN = "\033[0;32m";   // GREEN
    @Override
    public void run() {
        for (int i = 1; i <=10 ; i++) {
            if (i%2!=0){
                System.out.println(GREEN+i);
            }
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
