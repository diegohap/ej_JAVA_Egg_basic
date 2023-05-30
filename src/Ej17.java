import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

public class Ej17 {
    public static void main(String[] args) {
        int[] vec = new Random().ints(10000, 0, 999999).toArray();
        int[] conteo = new int[6];

        Arrays.stream(vec)
                .mapToObj(v -> Integer.toString(v))
                .map(l -> l.length())
                .filter(digitos -> digitos <= 5)
                .forEach(digitos -> conteo[digitos]++);

        IntStream.range(1, conteo.length)
                 .forEach(i -> System.out.println("hay " + conteo[i] + " numeros con " + i + " digito/s"));
    }
}
