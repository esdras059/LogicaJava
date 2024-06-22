package LaçosDeRepetição.whiles;

import java.util.Scanner;

public class NumerosImpares {
    public static void main(String[] args) {
        int i = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o número que deseja: ");
        int numero = input.nextInt();
        while (i < numero) {
            if (i % 2 != 0) {
                System.out.println("Número = " + i);
            }
            i = i + 1;
        }
    }
}
