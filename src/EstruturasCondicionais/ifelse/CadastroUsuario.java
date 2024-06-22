package EstruturasCondicionais.ifelse;

import java.util.Scanner;
public class CadastroUsuario {
    public static void main(String[] args) {
        System.out.print("Digite o seu login: ");
        Scanner leitura = new Scanner(System.in);
        String usuario = leitura.next();
        if(usuario.equals("") || usuario.equalsIgnoreCase("admin")|| usuario.equals("administrador")){
            System.out.println("Usuário inválido");
        }else{
            System.out.println(usuario + " cadastrado com sucesso.");
        }

        }
    }

