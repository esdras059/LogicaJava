package EstruturasCondicionais.ifelse;

public class CalcularImpostoRenda {
    public static void main(String[] args) {
        double salario = 3950;
        if (salario <= 2259.20) {
            System.out.println("Você está isento do imposto de renda.");
        } else if (salario > 2259.20 && salario <= 2826.65) {
            System.out.println("A porcentagem da alíquota é 7,5%, ou seja, 169,44");
        } else if (salario >= 2826.66 && salario <= 3751.05) {
            System.out.println("A porcentagem da alíquota é 15%. Pagará 381,44");
        } else {
            System.out.println("A porcentagem da alíquota é 22,5%. Você pagará 662,77");
        }
    }
}
