package baitap10;

import java.util.Scanner;

public class Baitap10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số giây bạn muốn thread ngủ");
        int seconds = Integer.parseInt(scanner.nextLine());;

        Sleep sleep = new Sleep();
        try {
            sleep.join((seconds* 1000L));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        sleep.start();
        System.out.println("Thread kết thúc");
    }
}
