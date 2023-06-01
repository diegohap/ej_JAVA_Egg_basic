import java.util.Scanner;

public class Eje5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese la clase del socio (A, B o C): ");
        char clase = teclado.nextLine().charAt(0);

        System.out.print("Ingrese el costo del tratamiento: ");
        double costoTratamiento = teclado.nextDouble();

        double importeAPagar = calcularImporte(clase, costoTratamiento);

        System.out.println("El importe a pagar por el socio es: " + importeAPagar);
        teclado.close();
    }

    public static double calcularImporte(char clase, double costoTratamiento) {
        double descuento;

        switch (clase) {
            case 'A':
                descuento = 0.5;
                break;
            case 'B':
                descuento = 0.65;
                break;
            case 'C':
                descuento = 1.0; // Sin descuento
                break;
            default:
                System.out.println("Clase de socio inválida.");
                return 0.0;
        }

        return costoTratamiento * descuento;
    }
}
