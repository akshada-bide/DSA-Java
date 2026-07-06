package If_Else;

public class Condition {
    public static void main(String[] args) {
        int[][] grid = {
                {1, 2, 3},
                {1, 0, 3},
        };
        System.out.println(satisfiesConditions(grid));
    }

    static boolean satisfiesConditions(int[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid.length - 1; j++) {
                if (grid[i][j] == grid[i + 1][j]) {
                    return true;
                }
                if (grid[i][j] != grid[i][j + 1]) {
                    return false;
                }
            }
        }
        return false;
    }
}
