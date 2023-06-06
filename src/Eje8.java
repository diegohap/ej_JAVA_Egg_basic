import java.util.Scanner;

public class Eje8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int countPares = 0;
        int countImpares = 0;

        while (true) {
            System.out.print("Ingrese un número entero (0 para salir): ");
            int numero = scanner.nextInt();

            if (numero == 0) {
                break;
            }

            if (numero < 0) {
                continue;
            }

            count++;

            if (numero % 5 == 0) {
                break;
            }

            if (numero % 2 == 0) {
                countPares++;
            } else {
                countImpares++;
            }
        }

        System.out.println("Cantidad de números leídos: " + count);
        System.out.println("Cantidad de números pares: " + countPares);
        System.out.println("Cantidad de números impares: " + countImpares);
    }
}
