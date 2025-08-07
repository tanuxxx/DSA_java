public class B4_count {
    public static void main(String[] args) {
        int count = 0;
        long number = 2028;

        while(number != 0){
            number /= 10;        //divide the number by 10 upto the number becomes 0.2028
            count++;
        }
        System.out.println(count);
    }
}
