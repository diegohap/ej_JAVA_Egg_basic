import java.util.Scanner;

public class Ej12 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Integer ok=0, noOk=0;
        String buffer;
        do {
            buffer = teclado.nextLine();
            if (buffer.length() !=  5)
                noOk++;
            else if ( checkBufferIntegrity(buffer) )
                ok++;
            else
                noOk++;
        } while (!checkFDE(buffer));
        System.out.println("buffer OK = " + ok);
        System.out.println("buffer NO OK = " + noOk);
    }

    public static boolean checkFDE(String bufferIn){
        return bufferIn.equals("&&&&&");
    }

    public static boolean checkBufferIntegrity(String bufferIn){
        return ((bufferIn.charAt(0) == 'X' && bufferIn.charAt(bufferIn.length()-1) == 'O') || checkFDE(bufferIn));
    }
}
