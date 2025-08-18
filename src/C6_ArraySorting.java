import java.util.Scanner;

public class C6_ArraySorting {
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

        boolean ascendingSort = true;
        boolean descendingSort = true;

        for(int i = 0; i< n - 1 ; i++) {
            if (arr[i] > arr[i + 1]) {
                ascendingSort = false;
            } else if (arr[i] < arr[i + 1]) {
                descendingSort = false;
            }
        }

        if(ascendingSort){
            System.out.println("sorted");
        } else if (descendingSort) {
            System.out.println("sorted");
        }else {
            System.out.println("NOT sorted");
        }

        System.out.println("enter 1 to continue");
        choice = sc.nextInt();
    }
}
}

/*
 {1,3,5,2,4}
 {1,2,3,4,5}
 {5,4,3,2,1}
 */
/*
i=0;
arr[i]<arr[i+1]
arr[i]>arr[i+1]
 */

