package Variáveis;

import java.util.Scanner;

public class RecebendoDados {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o seu nome:");
        String nome = teclado.next();
        int idade = teclado.nextInt();
        System.out.println("Nome digitado foi " +nome);
        System.out.println("Idade digitado foi " + idade);
    }
}
