package Arrays.unidimensional;

import java.util.Scanner;

public class LeituraUsuario {
    public static void main(String[] args) {
        double[] notas = new double[4];
        double media = 0;
        Scanner input = new Scanner(System.in);
        double sum = 0;
        for (int i = 0; i < notas.length; i++) {
            System.out.print("Digite a nota " + (i+1) + " : ");
            notas[i] = input.nextDouble();
            sum = notas[i] + sum;
        }

        for (int i = 0; i < notas.length; i++) {
            System.out.println("Nota " + (i+1) + " é: "+  notas[i]);
        }
    media = sum/notas.length;
        System.out.println("A média da sua nota é: "+media);
    }
}