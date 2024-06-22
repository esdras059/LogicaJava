package EstruturasCondicionais.ifelse;

import java.util.Scanner;
public class DiasSemana {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um número de 1 à 7: ");
        int dia = input.nextInt();
        if (dia == 1){
            System.out.println("Segunda-feira");
        }else if(dia ==2){
            System.out.println("Terça-feira");
        }else if(dia ==3){
            System.out.println("Quarta-feira");
        }else if(dia==4){
            System.out.println("Quinta-feira");
        }else if(dia == 5){
            System.out.println("Sexta-feira");
        }else if(dia == 6){
            System.out.println("Sabádo");
        }else if(dia == 7){
            System.out.println("Domingo");
        }else{
            System.out.println("Apenas números de 1 à 7.");
        }

    }
}
