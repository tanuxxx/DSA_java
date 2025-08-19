import java.util.Scanner;

public class C9_Prefix_sum_Array {

    public static void Prefixsum(int [] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("array size : ");
        int n = sc.nextInt();

        int [] arr = new int[n];
        int [] temp = new int [n];

        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }


        temp[0] =arr[0];

        for(int i = 1; i<n ; i++){
            temp[i] = temp[i-1] + arr[i];
        }

        Prefixsum(temp);
    }

}



/*
{1 2 3 4}
1+2=3
3+3=6
6+4=10
 */
