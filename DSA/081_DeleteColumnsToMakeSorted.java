public class DeleteColumnsToMakeSorted {

    public static int minDeletionSize(String[] strs) {

        int rows = strs.length;
        int columns = strs[0].length();

        int deleted = 0;

        for (int col = 0; col < columns; col++) {

            for (int row = 1; row < rows; row++) {

                if (strs[row].charAt(col)
                        < strs[row - 1].charAt(col)) {

                    deleted++;
                    break;
                }
            }
        }

        return deleted;
    }

    public static void main(String[] args) {

        String[] strs = {"cba", "daf", "ghi"};

        System.out.println(minDeletionSize(strs));
    }
}
