import java.util.Scanner;

public class Ej5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("ingrese un numero entero");
        int num = teclado.nextInt();
        System.out.println("doble= " + num*2);
        System.out.println("triple= " + num*3);
        System.out.println("raiz 2= " + Math.sqrt(num));
    }
}
