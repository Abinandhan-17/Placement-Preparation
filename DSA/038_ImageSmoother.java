public class ImageSmoother {

    public static int[][] imageSmoother(int[][] img) {

        int m = img.length;
        int n = img[0].length;

        int[][] result = new int[m][n];

        int[] row = {-1,-1,-1,0,0,1,1,1};
        int[] col = {-1,0,1,-1,1,-1,0,1};

        for (int i = 0; i < m; i++) {

            for (int j = 0; j < n; j++) {

                int sum = img[i][j];
                int count = 1;

                for (int k = 0; k < 8; k++) {

                    int newRow = i + row[k];
                    int newCol = j + col[k];

                    if (newRow >= 0 && newRow < m &&
                        newCol >= 0 && newCol < n) {

                        sum += img[newRow][newCol];
                        count++;
                    }
                }

                result[i][j] = sum / count;
            }
        }

        return result;
    }

    public static void main(String[] args) {

        int[][] img = {
            {100,200,100},
            {200,50,200},
            {100,200,100}
        };

        int[][] ans = imageSmoother(img);

        for (int[] row : ans) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
