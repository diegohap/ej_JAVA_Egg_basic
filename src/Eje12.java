public class Eje12 {
    public static void main(String[] args) {
        for (int i = 0; i <= 9; i++) {
            for (int j = 0; j <= 9; j++) {
                for (int k = 0; k <= 9; k++) {
                    String contador = i + "-" + j + "-" + k;
                    contador = contador.contains("3") ? contador = contador.replace("3", "E") : contador;
                    System.out.println(contador);
                }
            }
        }
    }
}
