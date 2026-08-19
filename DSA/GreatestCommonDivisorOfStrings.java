public class GreatestCommonDivisorOfStrings {

    public static String gcdOfStrings(String str1, String str2) {

        // If they don't have a common repeating pattern
        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }

        int gcdLength = gcd(str1.length(), str2.length());

        return str1.substring(0, gcdLength);
    }

    // Euclidean Algorithm
    public static int gcd(int a, int b) {

        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }

        return a;
    }

    public static void main(String[] args) {

        String str1 = "ABCABC";
        String str2 = "ABC";

        System.out.println(gcdOfStrings(str1, str2));
    }
}