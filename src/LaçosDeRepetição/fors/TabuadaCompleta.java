package LaçosDeRepetição.fors;

public class TabuadaCompleta {
    public static void main(String[] args) {
        for(int i = 1;i <= 10;i++){
            if(i>1){
                System.out.println("--------------------------");
            }
            System.out.println("Tabuada de " + i);
            for(int cont=1; cont<=10;cont++){
                System.out.println(i + " * "+cont + " = "+(cont*i));
            }
        }
    }
}
