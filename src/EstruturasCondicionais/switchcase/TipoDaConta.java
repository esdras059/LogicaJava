package EstruturasCondicionais.switchcase;
import java.util.Scanner;
public class TipoDaConta {
    public static void main(String[] args) {
        System.out.print("Qual o tipo da conta: 1 - POUPANÇA | 2 - CORRENTE | 3 - INVESTIMENTO: ");
        Scanner input = new Scanner(System.in);
        int tipo = input.nextInt();
        switch(tipo){
            case 1:
                System.out.println("Conta Poupança 0.05%.");
                break;
            case 2:
                System.out.println("Conta corrente 0.02%.");
                break;
            case 3:
                System.out.println("Conta investimento 0.1%.");
            default:
                System.out.println("Conta inexistente");
        }


    }
}
