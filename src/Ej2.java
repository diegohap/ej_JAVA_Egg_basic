import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("ingrese su nombre");
        String nombre = teclado.next();
        System.out.println("hola " + nombre);
    }
}
