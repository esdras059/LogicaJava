package EstruturasCondicionais.ifelse;

import java.util.Scanner;
public class AlistamentoMilitar {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite seu sexo: ");
        char sexo = teclado.next().charAt(0);
        System.out.println("sua idade: ");
        int idade = teclado.nextInt();
        if((sexo =='M' || sexo =='m') && idade > 17){
            System.out.println("Alistamento obrigatório.");
        }else if((sexo == 'F' || sexo =='M') && sexo <18){
            System.out.println("Alistamento não permitido.");
        }else if((sexo == 'f' || sexo =='F') && idade > 17){
            System.out.println("Alistamento opcional.");
        }else{
            System.out.println("Alistamento não permitido.");
        }
    }
}
