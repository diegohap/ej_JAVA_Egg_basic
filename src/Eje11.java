import java.util.Scanner;

public class Eje11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa un número entero: ");
        int numero = scanner.nextInt();

        System.out.println("La cantidad de dígitos es: " + calcularCantidadDigitos(numero));
    }

    public static int calcularCantidadDigitos(int numero) {
        if (numero == 0) {
            return 1;
        }

        int cantidadDigitos = 0;

        while (numero != 0) {
            numero /= 10;
            cantidadDigitos++;
        }

        return cantidadDigitos;
    }
}
