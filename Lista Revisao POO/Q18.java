/* 
18) Dizemos que uma matriz inteira A (n x n) é uma matriz de permutação se em cada linha e em
cada coluna houver n-1 elementos nulos e um único elemento igual a 1. Dada uma matriz inteira A (n
x n) verificar se A é de permutação.
*/

public class Q18 {
    public static void main(String[] args) {
        int[][] matriz = {  {0,0,0,1},
                            {1,0,0,0},
                            {0,0,1,0},
                            {0,1,0,0}};

        boolean check=true , permutacao=true;

        for (int i = 0; i < matriz.length; i++) {
            permutacao=true;
            check= false;

            for (int j = 0; j < matriz.length; j++) {
                if (matriz[i][j]==0) {
                    continue;                
                } else if (matriz[i][j]==1) {
                    if (!check) {
                        check=true;
                    } else {
                        permutacao=false;
                    }
                } else {
                    permutacao=false;
                    break;
            }
            }
            if (!permutacao || !check) {
                break;
            }
        }

        if (permutacao && check) {
            System.out.println("A matriz eh de permutacao");
        } else {
            System.out.println("A matriz nao eh de permutacao");
        }

    }
}
