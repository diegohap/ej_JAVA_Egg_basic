import java.util.Scanner;

public class Ej11 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int op = 0, a = 1, b = 1;
        while(op != 6){
            showMenuText();
            op = teclado.nextInt();
            switch (op) {
                case 1 -> System.out.println("suma= " + (a + b));
                case 2 -> System.out.println("resta= " + (a - b));
                case 3 -> System.out.println("mult= " + (a * b));
                case 4 -> {
                    if (b != 0)
                        System.out.println("div= " + (a / b));
                    else
                        System.out.println("no se puede dividir por 0(zero)");
                }
                case 5 -> {
                    System.out.println("ingrese dos numeros");
                    a = teclado.nextInt();
                    b = teclado.nextInt();
                }
                case 6 -> {
                    
                    System.out.println("Fin de programa...");
                }
                default -> System.out.println("opcion incorrecta");
            }
        }
        teclado.close();
    }
    public static void showMenuText(){
        System.out.println("Ingrese una opcion");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Ingresar datos");
        System.out.println("6. Salir");
    }
}
