import java.util.Scanner;

public class Ej14 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int op = 0;
        double valor = 1;
        while(op != 5){
            showMenuText();
            op = teclado.nextInt();
            switch (op) {
                case 1 -> exchangeCalculator(valor, 1);
                case 2 -> exchangeCalculator(valor, 2);
                case 3 -> exchangeCalculator(valor, 3);
                case 4 -> valor = teclado.nextDouble();
                case 5 -> System.out.println("Fin de programa...");
                default -> System.out.println("opcion incorrecta");
            }
        }
    }
    public static void showMenuText(){
        System.out.println("Ingrese una opcion");
        System.out.println("1. Dolares");
        System.out.println("2. Libras");
        System.out.println("3. Yenes");
        System.out.println("4. Ingresar/Cambiar valor en EUROS(€) a convertir");
        System.out.println("5. Salir");
    }

    public static void exchangeCalculator(Double amount, Integer exchangeType){
        switch (exchangeType) {
            case 1 -> System.out.println(amount + "€ = " + amount * 1.28611 + " U$S");
            case 2 -> System.out.println(amount + "€ = " + amount * 0.86 + " libras");
            case 3 -> System.out.println(amount + "€ = " + amount * 129.852 + " ¥");
        }
    }
}
