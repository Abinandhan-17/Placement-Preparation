public class ProjectionAreaOf3DShapes {

    public static int projectionArea(int[][] grid) {

        int n = grid.length;
        int area = 0;

        for (int i = 0; i < n; i++) {

            int rowMax = 0;
            int colMax = 0;

            for (int j = 0; j < n; j++) {

                // Top view
                if (grid[i][j] > 0) {
                    area++;
                }

                // Front view
                rowMax = Math.max(rowMax, grid[i][j]);

                // Side view
                colMax = Math.max(colMax, grid[j][i]);
            }

            area += rowMax + colMax;
        }

        return area;
    }

    public static void main(String[] args) {

        int[][] grid = {
            {1, 2},
            {3, 4}
        };

        System.out.println(projectionArea(grid));
    }
}
