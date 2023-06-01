import java.util.Scanner;

public class Eje6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de personas: ");
        int cantidadPersonas = teclado.nextInt();

        double sumaEstaturas = 0;
        int contadorEstaturasDebajo160 = 0;

        for (int i = 1; i <= cantidadPersonas; i++) {
            System.out.print("Ingrese la estatura de la persona " + i + " (en metros): ");
            double estatura = teclado.nextDouble();

            sumaEstaturas += estatura;

            if (estatura < 1.60) {
                contadorEstaturasDebajo160++;
            }
        }

        double promedioEstaturas = sumaEstaturas / cantidadPersonas;
        double promedioEstaturasDebajo160 = 0;

        if (contadorEstaturasDebajo160 > 0) {
            promedioEstaturasDebajo160 = sumaEstaturas / contadorEstaturasDebajo160;
        }

        System.out.println("Promedio de estaturas en general: " + promedioEstaturas);
        System.out.println("Promedio de estaturas por debajo de 1.60 mts: " + promedioEstaturasDebajo160);
        teclado.close();
    }
}
