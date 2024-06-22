package LaçosDeRepetição.whiles;
import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("CADASTRO DO USUÁRIO");
        System.out.print("Cadastro do seu login: ");
        final String cadastroLogin = input.next();
        System.out.print("Cadastro da sua senha: ");
        final String cadastroSenha = input.next();

        boolean exibirTelaLogin= true;

        while (exibirTelaLogin) {
            System.out.println("ACESSO DO SEU LOGIN");
            System.out.print("Digite o seu login: ");
            String login = input.next();
            System.out.print("Digite a sua senha: ");
            String senha = input.next();
            if (login.equals(cadastroLogin) && senha.equals(cadastroSenha)){
                System.out.println("Acesso concebido");
                //exibirTelaLogin = false;
                break;
            }else{
                System.out.println("Usuário inválido");
            }
        }
        System.out.println("PROGRAMA TERMINADO");
    }
}

