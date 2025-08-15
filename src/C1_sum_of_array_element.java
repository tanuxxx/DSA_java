import java.util.Scanner;
public class C1_sum_of_array_element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("number of elements: ");
        int n = sc.nextInt();  //get input of size of array

        // to create n size of array
        int [] arr = new int[n];
        int sum= 0;

        //take input for each element of array and add one by one upto size n
        for(int i = 0; i<n ; i++){
            arr[i] = sc.nextInt();
            sum += arr[i];   //add inputed elements one by one
        }
        System.out.print(sum);   //print overall sum
        
    }
}