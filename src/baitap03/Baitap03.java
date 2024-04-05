package baitap03;

public class Baitap03 {
    public static void main(String[] args) {
        EvenNum evenNum = new EvenNum();
        OldNum oldNum = new OldNum();
        Thread th1= new Thread(evenNum);
        Thread th2= new Thread(oldNum);
        th1.start();
        th2.start();
    }
}
