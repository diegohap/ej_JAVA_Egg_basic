import java.util.Arrays;
import java.util.Random;

public class Ej17 {
    public static void main(String[] args) {
        int[] vec = new Random().ints(10000, 0, 999999).toArray();
        int[] conteo = new int[6];

        Arrays.stream(vec)
                .mapToObj(v -> Integer.toString(v))
                .map(l -> l.length())
                .filter(digitos -> digitos <= 5)
                .forEach(digitos -> conteo[digitos]++);

        for (int i=1; i<conteo.length; i++) {
            System.out.println("Cantidad de números con " + i + " dígito(s): " + conteo[i]);
        }
    }
}
