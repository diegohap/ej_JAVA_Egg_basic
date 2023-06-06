import java.util.Scanner;

public class Eje10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Generar dos números aleatorios entre 0 y 10
        int numero1 = (int) (Math.random() * 11);
        int numero2 = (int) (Math.random() * 11);

        int resultado = numero1 * numero2;

        System.out.println("Adivina el resultado de la multiplicación:");
        System.out.println(numero1 + " * " + numero2);

        int respuesta;

        do {
            System.out.print("Ingresa tu respuesta: ");
            respuesta = scanner.nextInt();

            if (respuesta == resultado) {
                System.out.println("¡Respuesta correcta!");
            } else {
                System.out.println("Respuesta incorrecta. Intenta nuevamente.");
            }
        } while (respuesta != resultado);
    }
}
