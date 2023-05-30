import java.util.Arrays;
import java.util.stream.IntStream;

public class Ej18 {
    public static void main(String[] args) {
        int[][] inputMat = Arrays.stream(new int[4][4])
                                 .map(row -> Arrays.stream(row)
                                                        .map(num -> (int) (Math.random() * 10))
                                                        .toArray())
                                 .toArray(int[][]::new);
        System.out.println("---> ORIGINAL <---");
        showMat(inputMat);

        int[][] transpMat = matrizTranspose(inputMat);
        System.out.println("---> TRANSPUESTA <---");
        showMat(transpMat);
    }
    public static void showMat(int[][] inputMat){
        Arrays.stream(inputMat)
                .forEach(row -> {
                    Arrays.stream(row)
                            .forEach(num -> System.out.print(num + " "));
                    System.out.println("");
                });
    }

    public static int[][] matrizTranspose(int[][] input){
        return IntStream.range(0, input.length)
                .mapToObj(i -> IntStream.range(0, input[i].length)
                        .map(j -> input[j][i])
                        .toArray())
                .toArray(int[][]::new);
    }
}
