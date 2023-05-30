import java.util.Scanner;

public class Ej13 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("ingrese un numero");
        int lado = teclado.nextInt();

        for(int i=0; i<lado; i++)
            System.out.print("*");
        System.out.println("");

        for(int i=0; i<lado-2; i++){
            System.out.print("*");
            for(int j=0; j<lado-2; j++)
                System.out.print(" ");
            System.out.println("*");
        }

        for(int i=0; i<lado; i++)
            System.out.print("*");
    }
}
