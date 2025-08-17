import java.util.Scanner;

public class C2_max_in_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int choice = 1;
        while(choice == 1) {
            //input the size of array
            System.out.println("enter size of array: ");
            int n = sc.nextInt();

            int[] num = new int[n];  //create size of array

            //input array elements one by one
            for (int i = 0; i < n; i++) {
                num[i] = sc.nextInt();
            }
            //assuming first element is maximum
            int max = num[0];
            int max2 = -1;

            // to check other elements
            for (int i = 0; i < n; i++) {
                if (num[i] > max) {        //if next elements is greater than maximum
                    max2 = max;
                    max = num[i];        //then apply the value of greater element to max
                } else if (num[i] > max2) {
                    max2 = num[i];
                }
            }
            int min = Integer.MAX_VALUE;
            int min2 = Integer.MAX_VALUE;
            int min3 = Integer.MAX_VALUE;

            for (int i = 0; i < n; i++) {
                if (num[i] < min) {
                    min3 = min2;
                    min2 = min;
                    min = num[i];

                } else if (num[i] < min2) {
                    min3 = min2;
                    min2 = num[i];
                } else if (num[i] < min3) {
                    min3 = num[i];
                }
            }

            System.out.println("max: " + max);  //print max element
            System.out.println("second max: " + max2);  //print max2 element

            System.out.println("minimum: " + min);  //print min1 element
            System.out.println("minimum 2: " + min2);  //print min2 element
            System.out.println("minimum 3: " + min3);  //print min3 element

            System.out.println("enter 1 to continue");

            choice = sc.nextInt();

        }

    }

}
