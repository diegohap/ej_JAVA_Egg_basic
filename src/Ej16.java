import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Ej16 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int[] vec = new Random()
                .ints(0,10)
                .limit(100)
                .toArray();

        System.out.println("ingrese un numero a buscar del 0 al 9");
        int num = teclado.nextInt();

        System.out.println(num + " se repite " + Arrays.stream(vec)
                                                       .filter(v -> v == num)
                                                       .count()
                           + " veces");

        System.out.println(num + " esta en las posiciones:");
        IntStream.range(0, vec.length)
                 .filter(i -> vec[i] == num)
                 .forEach(System.out::println);
    }
}
