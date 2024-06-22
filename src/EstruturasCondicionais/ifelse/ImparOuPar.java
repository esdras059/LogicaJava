package EstruturasCondicionais.ifelse;

public class ImparOuPar {
    public static void main(String[] args) {
        int numero = 147;
        System.out.println("Algoritmo para verificar se o número é impar ou par");
        if (numero % 2 == 0){
            System.out.println("O número " + numero + " é par");
        }else{
            System.out.println("O número " + numero + " é ímpar");
        }
    }
}
