import java.util.Scanner;
public class Even_odd_2_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter number");
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
    }
}