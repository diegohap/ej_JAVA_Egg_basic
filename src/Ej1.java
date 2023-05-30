import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("ingrese dos valores");
        int a = teclado.nextInt();
        int b = teclado.nextInt();
        System.out.println("suma= " + (a+b) );
    }
}
