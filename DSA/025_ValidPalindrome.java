import java.util.Scanner;

public class ValidPalindrome {

    public static boolean isPalindrome(String s) {
        s = s.toLowerCase();

        StringBuilder str = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (Character.isLetterOrDigit(ch)) {
                str.append(ch);
            }
        }

        String cleaned = str.toString();

        int left = 0;
        int right = cleaned.length() - 1;

        while (left < right) {
            if (cleaned.charAt(left) != cleaned.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {
       try(Scanner sc = new Scanner(System.in)) {

        System.out.println("Enter String:");
        String s = sc.nextLine();

        System.out.println(isPalindrome(s));

        sc.close();
    }
    }
}
