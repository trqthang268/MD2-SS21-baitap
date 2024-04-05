package baitap11;

public class Main {
    public static void main(String[] args) {
        SoNguyenTo soNguyenTo = new SoNguyenTo();
        Thread thread = new Thread(soNguyenTo);
        thread.start();
    }
}
