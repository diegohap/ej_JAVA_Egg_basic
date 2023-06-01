import java.util.Scanner;

public class Eje4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese un número entre 1 y 10: ");
        int numero = teclado.nextInt();

        String romano = convertirARomano(numero);

        System.out.println("El número " + numero + " en números romanos es: " + romano);
        teclado.close();
    }

    public static String convertirARomano(int numero) {
        String[] romanos = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
        if (numero >= 1 && numero <= 10) {
            return romanos[numero];
        } else {
            return "Número inválido";
        }
    }
}
