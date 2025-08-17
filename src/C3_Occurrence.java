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

        int count[] = new int[101];
        for(int i = 0; i < n; i++){
            count [arr[i]]= count [arr[i]] + 1;
        }
        for(int i =0; i < 101; i++){
            if(count[i] != 0){
                System.out.println(i + " " + count[i]);
            }

        }


        //check how many times c appears
        int coun= 0;
        for(int num : arr){
            if(num == c){  //check every element in array
                coun++;
            }
        }


    }
}
