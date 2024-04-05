package baitap11;

public class SoNguyenTo implements Runnable {
    @Override
    public void run() {
        System.out.println(2 + " la so nguyen to");
        System.out.println(3 + " la so nguyen to");
        int n = 4;
        do {
            n++;
            boolean isExist = true;
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    isExist = false;
                }
            }
            if (isExist) {
                System.out.println(n + " la so nguyen to");
            }
        } while (n <= 10000);
    }
}

