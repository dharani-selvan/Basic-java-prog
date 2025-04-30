public class zpat {
    public static void main(String[] args) {
        int n = 5; // Number of rows and columns
        int[][] pattern = new int[n][n];
        int num = 1;

        // Fill the pattern array
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                pattern[ j][i-j] = num++;
            }
        }

        for (int i = 1; i < n; i++) {
            for (int j = i; j < n; j++) {
                pattern[ j][n - 1 + i -j] = num++;
            }
        }

        // Print the pattern
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(pattern[i][j] + " ");
            }
            System.out.println();
        }
    }
}