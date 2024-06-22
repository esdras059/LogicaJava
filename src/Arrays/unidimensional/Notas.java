package Arrays.unidimensional;
import java.util.Scanner;
public class Notas {
    public static void main(String[] args) {
        double[] notas = new double[4];
        notas[0] = 7.5;
        notas[1] = 10;
        notas[2] = 5.3;
        notas[3] = 8.7;
        Scanner input = new Scanner(System.in);
        System.out.println("Tamanho do array: " + notas.length);
        for (int i = 0;i<notas.length;i++){
            System.out.println(notas[i]);
        }
    }
}