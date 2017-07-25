/**
 * Created by nana1 on 7/18/2017.
 */
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] array = new int[6][6];

        for(int row =0; row < 6; row++) {
            for(int col = 0; col < 6; col++) {
                array[row][col] = scanner.nextInt();
            }
        }
        scanner.close();
        System.out.println(maxHourglassSum(array));
    }

    public static int maxHourglassSum(int[][] array) {
        int max = Integer.MIN_VALUE;
        for(int row=0; row<4; row++) {
            for(int col=0; col<4; col++) {
                int sum = findSum(array, row, col);
                max = Math.max(max, sum);
            }
        }
        return max;
    }

    public static int findSum(int[][] a, int r, int c) {
        int sum = a[r+0][c+0] + a[r+0][c+1] + a[r+0][c+2]
                + a[r+1][c+1]
                + a[r+2][c+0] + a[r+2][c+1] + a[r+2][c+2];
        return sum;
    }
}