import java.util.Scanner;
public class B5_Fibonacci_series {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter terms: ");

        int n = sc.nextInt();

        int a = 0 , b = 1 ;


        for(int i = 1; i<=n; i++){
            System.out.print(a + " ");
            int c = a + b;                 //changing the values of a,b,c;
            a = b;
            b = c;

        }
    }
}