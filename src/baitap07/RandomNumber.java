package baitap07;

import java.util.Random;

public class RandomNumber extends Thread{
    @Override
    public void run() {
        Random random =  new Random();
        System.out.println(random.nextInt(1000));
    }
}
