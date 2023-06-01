import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("ingrese una frase");
        String frase = teclado.nextLine();
        System.out.println(frase.toLowerCase());
        System.out.println(frase.toUpperCase());
        teclado.close();
    }
}
