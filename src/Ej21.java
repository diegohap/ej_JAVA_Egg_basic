import java.util.Arrays;
import java.util.stream.IntStream;

public class Ej21 {
    public static void main(String[] args) {
        int[][] mat = {
                {1, 2, 3, 4, 5, 6, 7, 8, 9, 0},
                {4, 5, 6, 7, 8, 9, 0, 1, 2, 3},
                {7, 8, 9, 0, 1, 2, 3, 4, 5, 6},
                {0, 1, 2, 3, 4, 5, 6, 7, 8, 9},
                {3, 4, 5, 6, 7, 8, 9, 0, 1, 2},
                {6, 7, 8, 9, 0, 1, 2, 3, 4, 5},
                {9, 0, 1, 2, 3, 4, 5, 6, 7, 8},
                {2, 3, 4, 5, 6, 7, 8, 9, 0, 1},
                {5, 6, 7, 8, 9, 0, 1, 2, 3, 4},
                {8, 9, 0, 1, 2, 3, 4, 5, 6, 7}
        };
        int[][] pat = {
                {5, 6, 7},
                {8, 9, 0},
                {1, 2, 3}
        };
        boolean containPatron = containMat(mat, pat);
        System.out.println("La matriz contiene el patrón: " + containPatron);
    }

    public static boolean containMat(int[][] mat, int[][] pat) {
        int patRows = pat.length;
        int patCols = pat[0].length;

        return IntStream.range(0, mat.length - patRows + 1)
                .boxed()
                .flatMap(row -> IntStream.range(0, mat[0].length - patCols + 1)
                        .mapToObj(col -> Arrays.stream(mat, row, row + patRows)
                                .map(rowArray -> Arrays.copyOfRange(rowArray, col, col + patCols))
                                .toArray(int[][]::new))
                )
                .anyMatch(submatriz -> Arrays.deepEquals(submatriz, pat));
    }
}
