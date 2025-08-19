import java.util.Scanner;

public class C7_Left_Rotate {
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

            System.out.print("left rotation \t");
            int l = sc.nextInt();

            l = l % n;

            int [] temp = new int[n];
            for(int i = 0; i<n; i++){
//                temp[i] = arr[n-i];
//                temp[i] = arr[(n-i)%l];
                temp[i] = arr[(i + l) % n];

            }
            System.out.println(temp);
            for(int num : temp){      //for each loop
                System.out.print(num+" ");

            }
            System.out.println("\n");

            System.out.println("enter 1 to continue");
            choice = sc.nextInt();
        }

    }
}

/*
{1 2 3 4 5}
{2 3 4 5 1}

int i = 0;
arr[0]=arr[n-1]
arr[1]=arr[0]
arr[2]=arr[1]
 */
