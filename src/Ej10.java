import java.util.Scanner;

public class Ej10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("ingrese un numero limite");
        int limite = teclado.nextInt();
        int var;
        do {
            System.out.println("ingrese un numero");
            var = teclado.nextInt();
        } while (var < limite);
    }
}
