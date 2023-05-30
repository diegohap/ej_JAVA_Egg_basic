import java.util.Arrays;
import java.util.stream.IntStream;

public class Ej19 {
    public static void main(String[] args) {
        int[][] mat = {
                {0, 1, -2},
                {-1, 0, 3},
                {2, -3, 0}
        };

        boolean esAntisimetrica = esAntisimetrica(mat);
        System.out.println("La matriz es antisimétrica: " + esAntisimetrica);
    }

    public static boolean esAntisimetrica(int[][] mat) {
        int[][] transpuesta = obtenerTranspuesta(mat);

        return IntStream.range(0, mat.length)
                        .allMatch(i -> IntStream.range(0, mat.length)
                                .allMatch(j -> mat[i][j] == -transpuesta[j][i]));
    }

    public static int[][] obtenerTranspuesta(int[][] input) {
        return IntStream.range(0, input.length)
                .mapToObj(i -> IntStream.range(0, input[i].length)
                        .map(j -> input[j][i])
                        .toArray())
                .toArray(int[][]::new);
    }
}
