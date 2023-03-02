package week1.day2;

public class Fibonacci {
    public static void main(String[] args) {

        int n = 8;

        int first = 0, second = 1, next;

        System.out.print("First " + n + " terms: ");


        for (int i = 0; i < n; i++) {
            if (i <= 1) {
                next = i;
            } else {
                next = first + second;
                first = second;
                second = next;
            }
            System.out.print(next + " ");
        }
    }
}