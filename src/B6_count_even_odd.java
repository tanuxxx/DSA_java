import java.util.Scanner;
public class B6_count_even_odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter number: ");
        int num = sc.nextInt();

        int evencount = 0;
        int oddcount = 0;
        int digit = 0;

        while(num != 0){
             digit = num % 10;       //identify last digit

            if(digit % 2 == 0){
                evencount++;
            }
            else{
                oddcount++;
            }
            num /= 10;       //removes last digit and check the even odd
        }

        System.out.println(evencount);
        System.out.println(oddcount);

    }
}
