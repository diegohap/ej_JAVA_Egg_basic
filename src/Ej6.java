import java.util.Scanner;

public class Ej6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("ingrese un numero");
        int var = teclado.nextInt();
        if(var % 2 == 0)
            System.out.println("PAR");
        else
            System.out.println("IMPAR");
        teclado.close();
    }
}
