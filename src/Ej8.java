import java.util.Scanner;

public class Ej8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("ingrese una frase");
        String var = teclado.nextLine();
        if(var.length() == 8)
            System.out.println("CORRECTO");
        else
            System.out.println("INCORRECTO");
    }
}
