package baitap06;

public class OptimizedPrimeFactorization implements Runnable{
    public static final String WHITE = "\033[0;37m";   // WHITE

    @Override
    public void run() {
        System.out.println(WHITE+2 + " la so nguyen to");
        System.out.println(WHITE+3 + " la so nguyen to");
        int n = 4;
        do {
            n++;
            boolean isExist = true;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    isExist = false;
                }
            }
            if (isExist) {
                System.out.println(WHITE+n + " la so nguyen to");
            }
        } while (n <= 1000);
    }
}
