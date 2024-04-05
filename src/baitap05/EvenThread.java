package baitap05;

public class EvenThread extends Thread{
    public static final String WHITE = "\033[0;37m";   // WHITE
    @Override
    public void run() {
        for (int i = 1; i <=10 ; i++) {
            if (i%2==0){
                System.out.println(WHITE+i);
            }
            try {
                Thread.sleep(15);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
