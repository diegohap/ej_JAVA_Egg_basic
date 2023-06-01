import java.util.Scanner;

public class Eje3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese una letra: ");
        String letra = teclado.nextLine().toLowerCase();

        if (letra.matches("[aeiou]")) {
            System.out.println("La letra ingresada es una vocal.");
        } else {
            System.out.println("La letra ingresada no es una vocal.");
        }
        teclado.close();
    }
}
