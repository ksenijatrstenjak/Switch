package Arrays;

public class Recursion {
    public static void main(String[] args) {
        int n = 100;
        doCountDown(n);
    }
    public static void doCountDown (int n) {
        if (n != 0) {
            System.out.println(n);
            n--;
       doCountDown(n);
        } else {
            System.out.println("Finnished!");

        }
    }
}
