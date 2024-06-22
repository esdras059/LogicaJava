package EstruturasCondicionais.switchcase;

import java.util.Scanner;

public class DiasDaSemana {
    public static void main(String[] args) {
        System.out.println("Dias da semana 1: Segunda até 7: Domingo");
        Scanner input = new Scanner(System.in);
        int dia = input.nextInt();
        switch (dia) {
            case 1:
                System.out.println("Segunda-Feira");
                break;
            case 2:
                System.out.println("Terça-Feira");
                break;
            case 3:
                System.out.println("Quarta-Feira");
                break;
            case 4:
                System.out.println("Quinta-Feira");
                break;
            case 5:
                System.out.println("Sexta-Feira");
                break;
            case 6:
                System.out.println("Sabádo");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Dia inválido");

        }
    }
}
