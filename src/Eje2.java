public class Eje2 {
    public static void main(String[] args) {
        // Declaración e inicialización de las variables
        int A = 1;
        int B = 2;
        int C = 3;
        int D = 4;

        // Mostrar los valores iniciales
        System.out.println("Valores iniciales:");
        System.out.println("A: " + A);
        System.out.println("B: " + B);
        System.out.println("C: " + C);
        System.out.println("D: " + D);

        // Intercambio de valores utilizando una variable auxiliar
        int auxiliar = B;
        B = C;
        C = A;
        A = D;
        D = auxiliar;

        // Mostrar los valores finales
        System.out.println("\nValores finales:");
        System.out.println("A: " + A);
        System.out.println("B: " + B);
        System.out.println("C: " + C);
        System.out.println("D: " + D);
    }
}
