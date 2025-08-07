import java.util.Scanner;
public class B8_Armstrong{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number: ");
        int num = sc.nextInt();

        int result=0;
        int n = 0;
        int temp = num;

        //for armstrong number
        while(temp != 0){
            temp /= 10;      //for counting the digits in number
            n++;
        }

        //for non armstrong number
        temp = num;
        while(temp != 0){
           int digit = temp % 10;
            result += Math.pow(digit , n);
            temp /= 10;
        }
        if(result == num){
            System.out.println("armstrong");
        }
        else{
            System.out.println("not armstrong");
        }
    }

}
