import java.util.Scanner;
public class C3_Occurrence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("size of array: ");
        int n = sc.nextInt();

        int [] arr = new int  [n];

        for(int i = 0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Occurrence of number: ");
        int c = sc.nextInt();

        //check how many times c appears
        int count= 0;
        for(int num : arr){
            if(num == c){  //check every element in array
                count++;
            }
        }
        System.out.println(count);

    }
}
