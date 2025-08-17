import java.util.Scanner;


public class C5_Reverse_Array {
    public static void printArray(int [] arr){

        for(int i = 0; i< arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int choice = 1;
        while(choice == 1) {
            //input the size of array
            System.out.println("enter size of array: ");
            int n = sc.nextInt();

            int[] arr = new int[n];  //create size of array

            //input array elements one by one
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            /*
               {1,4,5,6,7,8}   arr
               {8,7,6,5,4,1}   temp
             */
            int [] temp = new int[n];
            for(int i = 0 ; i < n ; i++){
                //temp (n-1) = arr[0]
                //temp (n-2) = arr[1]
                //temp (n-3) = arr[2]

                temp[n-i-1] = arr[i];
            }
            System.out.println("reversed array is ");
            printArray(temp);


            System.out.println("enter 1 to continue");
            choice = sc.nextInt();

        }
    }
}
