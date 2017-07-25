/**
 * Created by nana1 on 7/21/2017.
 */

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = input.nextInt();
        }
        int m = input.nextInt();
        int[] b = new int[m];
        for (int i = 0; i < b.length; i++) {
            b[i] = input.nextInt();
        }
        input.close();

        int[] result = new int[201];
        int pivot = a[0];

        for (int i = 0; i < a.length; i++) {
            int diff = a[i] - pivot;
            result[100 + diff]--;
        }

        for (int i = 0; i < b.length; i++) {
            int diff = b[i] - pivot;
            result[100 + diff]++;
        }

        for (int i = 0; i < result.length; i++) {
            if (result[i] > 0) {
                int value = i - 100 + pivot;
                System.out.print(value + " ");
            }
        }
    }
}