import java.util.Scanner;
public class B9_sum_of_first_n_odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum1 = 0;
        int sum2 = 0;
        int odd = 1;
        int even = 0;
        System.out.println("enter terms: ");
        int num = sc.nextInt();

        for(int i = 1; i <= num; i++){
            sum1 += odd;
            odd += 2;              //take alternate odd numbers
        }
        System.out.println(sum1);

        for(int j = 0; j <= num; j++){
            sum2 += even;
            even += 2;
        }
        System.out.println(sum2);

    }
}
