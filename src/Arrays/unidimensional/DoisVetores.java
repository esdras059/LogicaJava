package Arrays.unidimensional;

import java.util.Scanner;

public class DoisVetores {
    public static void main(String[] args) {
        double[] vetorUm = new double[8];
        double[] vetorDois = new double[8];
        double[] vetorTres = new double[8];
        Scanner input = new Scanner(System.in);
        System.out.println("Primeiro vetor");
        for (int i = 0; i <  vetorUm.length; i++) {
            System.out.print(i  + "º vetor: ");
            vetorUm[i] = input.nextDouble();
        }
        System.out.println("Segundo vetor");
        for (int i = 0; i < vetorDois.length; i++) {
            System.out.print((i + 1) + "º vetor: ");
            vetorDois[i] = input.nextDouble();
        }
        for (int i = 0; i < vetorDois.length; i++) {
            vetorTres[i] = vetorUm[i] * vetorDois[i];
            System.out.print(" Multiplicação V1 e V2 do " + i + 1 + "º termo: ");
            System.out.println(vetorTres[i]);
        }
    }
}
