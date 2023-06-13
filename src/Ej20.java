import java.util.Arrays;
import java.util.stream.IntStream;

public class Ej20 {
    public static void main(String[] args) {
        int[][] mat = {
                {2, 7, 6},
                {9, 5, 1},
                {4, 3, 8}
            };

        System.out.println("matriz magica = " + isMagicMat(mat));
    }

    public static boolean isMagicMat(int[][] mat){
        int suma = Arrays.stream(mat[0]).sum();
        boolean valid = true;

        // valida filas
        valid &=Arrays.stream(mat)
                      .allMatch(row -> Arrays.stream(row).sum() == suma);

        // valida columnas
        valid &= IntStream.range(0, mat.length)
                         .allMatch(j -> Arrays.stream(mat)
                                              .mapToInt(row -> row[j]).sum() == suma);

        // valida diagonal principal
        valid &= Arrays.stream(mat)
                       .mapToInt(row -> row[Arrays.asList(mat).indexOf(row)])
                       .sum() == suma;

        // valida diagonal inversa
        valid &= Arrays.stream(mat)
                .mapToInt(row -> row[mat.length - 1 - Arrays.asList(mat).indexOf(row)])
                .sum() == suma;

        return valid;
    }

}
