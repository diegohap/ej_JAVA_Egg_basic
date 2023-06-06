import java.util.Scanner;

public class Eje9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el dividendo: ");
        int dividendo = scanner.nextInt();

        System.out.print("Ingrese el divisor: ");
        int divisor = scanner.nextInt();

        int cociente = 0;
        int residuo = dividendo;

        while (residuo >= divisor) {
            residuo -= divisor;
            cociente++;
        }

        System.out.println("El cociente es: " + cociente);
        System.out.println("El residuo es: " + residuo);
    }
}
