import java.util.Scanner;

public class C2_max_in_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //input the size of array
        System.out.println("enter size of array: ");
        int n = sc.nextInt();

        int [] num = new int [n];  //create size of array

        //input array elements one by one
        for(int i=0 ; i < n ; i++){
            num[i] = sc.nextInt();
        }
        //assuming first element is maximum
        int max = num[0];

        // to check other elements
        for(int i = 0; i<n ; i++){
            if(num[i] > max){   //if next elements is greater than maximum
                max = num[i];   //then apply the value of greater element to max
            }
        }
        System.out.println(max);  //print max element
    }
}
