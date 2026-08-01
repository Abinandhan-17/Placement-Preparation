import java.util.Scanner;

public class ExcelSheetColumnTitle {

    public static String convertToTitle(int columnNumber) {

        StringBuilder result = new StringBuilder();

        while (columnNumber > 0) {
            columnNumber--;

            result.append((char) ('A' + (columnNumber % 26)));

            columnNumber /= 26;
        }

        return result.reverse().toString();
    }

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter column number: ");
            int columnNumber = sc.nextInt();

            System.out.println("Column Title: " + convertToTitle(columnNumber));
        }
    }
}