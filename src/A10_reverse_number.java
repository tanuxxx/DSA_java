
import java.util.Scanner;
public class A10_reverse_number
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the digit: ");
        int num = sc.nextInt();

        int rev = 0;
        int i = 1;
        while( num != 0){
            int digit = num % 10;         //get last digit
            rev = rev * 10 + digit;       //add digit to reversed number
            num = num / 10;               //removes last digit

        }
        System.out.println(rev);
    }


}
