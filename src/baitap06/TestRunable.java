package baitap06;

public class TestRunable {
    public static void main(String[] args) {
        LazyPrimeFactorization lazy = new LazyPrimeFactorization();
        OptimizedPrimeFactorization opti = new OptimizedPrimeFactorization();
        Thread threadLazy = new Thread(lazy);
        Thread threadOpti = new Thread(opti);
        threadLazy.start();
        threadOpti.start();

    }
}
