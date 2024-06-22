package LaçosDeRepetição;
import java.sql.SQLOutput;
import java.util.Scanner;
public class DoWhile {
    public static void main(String[] args) {
        int desejaContinuar = 1;
        do{
            Scanner input = new Scanner(System.in);
            System.out.println("PLAYER 1: DIGITE UM NÚMERO DE 1 A 10:");
            int player1 = input.nextInt();
            System.out.println("PLAYER 2: DIGITE UM NÚMERO DE 1 A 10");
            int player2 = input.nextInt();
            System.out.println("Acertou " + (player1 == player2));
            System.out.println("_---------------------------------");
            System.out.println("Deseja continuar? ");
            System.out.println("1 - SIM; 2 - NÃO");
            desejaContinuar = input.nextInt();
        }while(desejaContinuar == 1);
        System.out.println("PROGRAMA ENCERRADO");
    }
}
