package LaçosDeRepetição;

public class Fatorial {
    public static void main(String[] args) {
        int Fatorial = 7;
        for (int i = Fatorial-1; i>1;i--){
            Fatorial = Fatorial *i;
            System.out.println(Fatorial);
        }
        System.out.println("O fatorial de 7 é "+Fatorial);
    }
}
