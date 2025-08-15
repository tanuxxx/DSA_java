public class B11_Prime_Number {
    public static boolean checkprime(int n){
        for(int i = 2; i<n ;i++){
            if(n % i == 0){
                return false;
            }
        }return true;
    }

    public static void main(String[] args) {
        int n = 50;
        for(int i = 2; i<=n ; i++){
            boolean ans = checkprime(i);
            if(ans == true){
                System.out.print(i+" ");
            }
        }
    }
}
