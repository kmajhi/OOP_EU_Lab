public class Problem2 {
    static int fib(int n) {
        if(n==0){
            return 0;
        }
        else if (n == 1 || n == 2) {
            return n-1;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }
    public static void main (String[]args){
        int c = fib(7);
        System.out.println(c);
    }
}
