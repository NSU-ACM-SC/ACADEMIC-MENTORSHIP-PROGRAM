package JavaOOP;
import java.util.*;
public class MulitDimentionalArray {
    public static void main(String[] args) {
        int row,col;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter row : " );
        row = s.nextInt();
        System.out.print("Enter col : " );
        col = s.nextInt();
        int[][] tda = new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                tda[i][j]=s.nextInt();
            }
        }
        for(int[] ar : tda){
            for(int c : ar){
                System.err.print(c+" ");
            }
            System.err.println();
        }
       
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.err.print(tda[i][j]+" ");
            }
            System.err.println();
        }
    }
}
