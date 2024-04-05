package baitap06;

public class LazyPrimeFactorization implements Runnable{
    public static final String PURPLE = "\033[0;35m";  // PURPLE
    @Override
    public void run() {
        System.out.println(PURPLE+2 + " la so nguyen to");
        System.out.println(PURPLE+3 + " la so nguyen to");
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
                System.out.println(PURPLE+n + " la so nguyen to");
            }
        } while (n <= 1000);
    }
}
