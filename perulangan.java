import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan Kata : ");
        String str = sc.nextLine();
        String reverseStr = "";
        int strLength = str.length();
        for (int i = (strLength - 1); i >=0; --i) {
            reverseStr = reverseStr + str.charAt(i);
        }
        if (str.toLowerCase().equals(reverseStr.toLowerCase())) {
            System.out.println(str + " Palindrome");
        } else {
            System.out.println(str + " Bukan Palindrome");
        }
    }
}
