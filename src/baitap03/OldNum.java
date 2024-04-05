package baitap03;

public class OldNum implements Runnable{
    public static final String GREEN = "\033[0;32m";   // GREEN
    @Override
    public void run() {
        for (int i = 1; i <=100 ; i++) {
            if (i%2!=0){
                System.out.println(GREEN+i);
            }
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
