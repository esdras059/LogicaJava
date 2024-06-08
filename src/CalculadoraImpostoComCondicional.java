/*Dado um determinado sálario se o salário for maior que 4500 imprima 30% do valor, senão imprima 10%
* Diga na impressão se é 30% ou 10%*/
public class CalculadoraImpostoComCondicional {
    public static void main(String[] args) {
        float salario = 4700;
        float resultado = 0;
        String porcentagem = "";
        if (salario >= 4500){
            resultado = salario*0.3f;
            porcentagem = "30%";
        }
        else{
            resultado = salario * 0.1f;
            porcentagem = "10%";
        }
        System.out.println(porcentagem + " de " + salario + " é igual à: "+ resultado);
    }
}
