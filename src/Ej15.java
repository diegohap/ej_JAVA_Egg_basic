import java.util.Arrays;
import java.util.stream.IntStream;

public class Ej15 {
    public static void main(String[] args) {
        int[] vec = new int[100];
        IntStream.range(0,100).forEach(i -> vec[i] = i);
        Arrays.stream(vec).forEach(System.out::println);
    }
}
