/**
 * Created by nana1 on 7/18/2017.
 */
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[][] matrix = new int[n][n];
        for(int row=0; row < n; row++) {
            for(int col=0; col <n; col++) {
                matrix[row][col]= input.nextInt();
                System.out.println(absoluteDiagonalDifference(matrix, row, col, n));
            }
        }

    }

    public static int absoluteDiagonalDifference(int[][] a, int r, int c, int n) {
        int primarySum =0, secondarySum =0;
        for(int i=0; i <n; i++) {
            primarySum += a[r+i][c+i];
        }
        for (int i=n-1; i>=0; i--) {
            secondarySum += a[r+i][c+i];
        }
        int absDifference = Math.abs(primarySum - secondarySum);
        return absDifference;
    }
}
