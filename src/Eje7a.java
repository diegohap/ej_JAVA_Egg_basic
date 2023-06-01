import java.util.Scanner;

public class Eje7a {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de números: ");
        int n = teclado.nextInt();

        int contador = 1;
        int numero;
        int suma = 0;
        int maximo = Integer.MIN_VALUE;
        int minimo = Integer.MAX_VALUE;

        while (contador <= n) {
            System.out.print("Ingrese el número #" + contador + ": ");
            numero = teclado.nextInt();

            suma += numero;
            maximo = Math.max(maximo, numero);
            minimo = Math.min(minimo, numero);

            contador++;
        }

        double promedio = (double) suma / n;

        System.out.println("Valor máximo: " + maximo);
        System.out.println("Valor mínimo: " + minimo);
        System.out.println("Promedio: " + promedio);

        teclado.close();
    }
}
