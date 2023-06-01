import java.util.Scanner;

public class Ej9 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("ingrese una frase");
        String var = teclado.nextLine();
        if(var.charAt(0) == 'A')
            System.out.println("CORRECTO");
        else
            System.out.println("INCORRECTO");
        teclado.close();
    }
}
