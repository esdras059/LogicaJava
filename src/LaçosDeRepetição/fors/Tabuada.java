package LaçosDeRepetição.fors;
import java.util.Scanner;
public class Tabuada {
    public static void main(String[] args) {
        System.out.print("Digite o número: ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        System.out.println("A tabuada de "+  num + " é:");
        for(int i = 0;i <=10;i++){
            System.out.println(num + " X "+i + " = "+ (num*i));
        }
    }
}
