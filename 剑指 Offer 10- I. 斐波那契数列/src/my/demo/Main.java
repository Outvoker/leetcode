package my.demo;

public class Main {

    public static int fib(int n) {
        int f0 = 0, f1 = 1, fn = 0;
        for(int i = 0; i < n; i++) {
            fn = Math.floorMod(f0 + f1, 1000000007);
            f0 = f1;
            f1 = fn;
        }
        return f0;
    }

    public static void main(String[] args) {
        System.out.println(fib(48));
    }
}
