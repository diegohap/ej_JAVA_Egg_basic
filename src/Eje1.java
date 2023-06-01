import java.util.Scanner;

public class Eje1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese el tiempo en minutos: ");
        int minutos = teclado.nextInt();

        int dias = minutos / (24 * 60); // Calcula la cantidad de días
        int horas = (minutos % (24 * 60)) / 60; // Calcula la cantidad de horas

        System.out.println("Equivalente: " + dias + " día(s), " + horas + " hora(s)");

        teclado.close();
    }
}
