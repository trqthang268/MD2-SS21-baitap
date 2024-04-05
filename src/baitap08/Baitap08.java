package baitap08;

public class Baitap08 {
    public static int shareNumber = 10;

    public static void main(String[] args) {
        MinusNum minusNum = new MinusNum();
        PlusNum plusNum = new PlusNum();
        Thread th1 = new Thread(minusNum);
        Thread th2 = new Thread(plusNum);
        th1.start();
        th2.start();
    }
}
