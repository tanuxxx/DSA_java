public class GCD_of_number_5_A {
    public static void main(String[] args) {
     int a = 12;
     int b = 18;
     int gcd = findGCD(a , b);
        System.out.println(gcd);

    }
    public static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
