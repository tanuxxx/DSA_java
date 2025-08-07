import java.util.Scanner;
public class A9_sum_of_digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;

        System.out.print("Enter number: ");
        int num = sc.nextInt();



        while(num != 0){
            int digit = num % 10;
            System.out.print(digit+" + ");
            sum += digit;
            num /= 10;

        }
        System.out.println(sum);


    }
}
