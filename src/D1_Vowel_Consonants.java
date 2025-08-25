import java.util.Scanner;

public class D1_Vowel_Consonants {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("String: ");
        String str = sc.nextLine();


        int vowel = 0 , consonant = 0;      //to get numbers

        StringBuilder vowelChars = new StringBuilder();     //to get characters of vowels
        StringBuilder consonantChars = new StringBuilder();  //to get characters of consonant

        str = str.toLowerCase();

        for(int i = 0; i<str.length();i++){
            char ch = str.charAt(i);        //check every character of string

            if(ch >= 'a' && ch <= 'z'){
                if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                    vowel++;                   //vowels add one by one
                    vowelChars.append(ch).append(" ");  //save the vowel for printing
                }else {
                    consonant++;               //consonant add one by one
                    consonantChars.append(ch).append(" ");   //save the consonant for printing
                }

            }
        }
        System.out.println("Vowels: " +vowel);
        System.out.println("Vowels: " + vowelChars.toString());   //print vowel
        System.out.println("Consonant: " +consonant);
        System.out.println("Consonant: " + consonantChars.toString());   //print consonant
    }
}
