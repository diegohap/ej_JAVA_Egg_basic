import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
        //F = 32 + (9 * C / 5).
        Scanner teclado = new Scanner(System.in);
        System.out.println("ingrese una temperatura en °C");
        double tempC = teclado.nextDouble();
        System.out.println("equivale a " + (32+(9*tempC/5)) + "°F");
    }
}
