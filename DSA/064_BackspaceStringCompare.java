public class BackspaceStringCompare {

    public static boolean backspaceCompare(String s, String t) {

        return build(s).equals(build(t));
    }

    private static String build(String str) {

        StringBuilder sb = new StringBuilder();

        for (char ch : str.toCharArray()) {

            if (ch != '#') {
                sb.append(ch);
            } else if (sb.length() > 0) {
                sb.deleteCharAt(sb.length() - 1);
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {

        String s = "ab#c";
        String t = "ad#c";

        System.out.println(backspaceCompare(s, t));
    }
}
