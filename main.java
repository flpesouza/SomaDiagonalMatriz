import java.util.*;

public class ex5 {
    public static void main(String[] args){
        int x=50;
        int somaP=0;
        int somaS =0;
        int mat[][] = new int[x][x];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<x;i++){
            for(int j=0;j<x;j++){
                System.out.print("Digite o valor da posição ["+i+","+j+"]: ");
                mat[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<x;i++){
            for(int j=0;j<x;j++){
                if(i==j){
                    somaP += mat[i][j];
                }
            }
        }
        System.out.println("A soma da diagonal principal é: "+somaP);
        for(int i=0,j=mat[0].length-1;i<x && j>=0;i++, j--){
            somaS += mat[i][j];
        }
        System.out.println("A soma da diagnal secundaria é: "+somaS);
        sc.close();
    }
}
