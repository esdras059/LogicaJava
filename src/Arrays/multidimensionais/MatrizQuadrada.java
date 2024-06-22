package Arrays.multidimensionais;

public class MatrizQuadrada {
    public static void main(String[] args) {
        int[][] arrayMulti = new int[3][3];
        arrayMulti[0][0] = 22;
        arrayMulti[0][1] = 11;
        arrayMulti[1][0] = 44;
        arrayMulti[1][1] = 55;
        arrayMulti[1][2] = 43;
        arrayMulti[2][0] = 44;
        arrayMulti[2][1] = 55;
        arrayMulti[2][2] = 43;
        int resultado = 1;
        for(int i = 0; i<arrayMulti.length;i++){
            for(int j = 0; j < arrayMulti[i].length;j++){
                if(i == j){
                    resultado = arrayMulti[i][j] * resultado;
                }
            }
        }
        System.out.println(resultado);
    }
}
