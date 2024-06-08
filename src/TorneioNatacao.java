import java.util.Scanner;

public class TorneioNatacao {
    public static void main(String[] args) {
        /*Torneio de natação que classifica a idade por categoria:
          menor que 10: <nome> participará da categoria infantil
          entre 11 e 15: <nome> participará da categoria juvenil
          entre 16 e 19 anos: <nome> participará da categoria pré-adulto
          acima de 20 anos: <nome> participará da categoria adulto
         */
        Scanner teclado = new Scanner(System.in);
        System.out.println("Qual o seu nome: ");
        String nome = teclado.next();
        System.out.println("Digite a sua idade: ");
        int idade = teclado.nextInt();
        if(idade <= 10){
            System.out.println(nome + " participára da categoria infantil");
        }else if(idade >10 && idade <= 15){
            System.out.println(nome + " participará da categoria juvenil");
        }else if(idade >= 16 && idade <20){
            System.out.println(nome + " participará da categoria pré-adulto");
        }else{
            System.out.println(nome + " participará da categoria adulto.");
        }
    }
}
