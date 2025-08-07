public class B2_factorial_of_n{
    public static void main(String[] args) {
        int n = 4;
        int fact =1;
        int i = 1;
        while (i<=n){
            fact *= i;
            i++;
            System.out.print(i+" ");
        }
        System.out.println(fact);
    }
}
