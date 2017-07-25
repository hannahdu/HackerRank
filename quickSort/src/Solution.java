/**
 * Created by nana1 on 7/19/2017.
 */
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] ar = new int[n];
        for(int i=0; i< n; i++) {
            ar[i]= input.nextInt();
        }
        quickSort(ar, 0, n-1);
    }

    public static void quickSort(int[] array, int start, int end) {
        if (start < end) {
            int pivot = partition(array, start, end);
            printArray(array);
            quickSort(array, start, pivot-1);
            quickSort(array, pivot+1, end);
        }
    }

    public static int partition(int[] array, int start, int end) {
        int pivot  = array[end];
        int i = start -1;
        for(int j= start; j<= end-1; j++) {
            if(array[j] <= pivot) {
                i++;
                int temp = array[j];
                array[j] = array[i];
                array[i] = temp;
            }
        }
        int temp = array[end];
        array[end] = array[i+1];
        array[i+1] = temp;

        return i+1;
    }

    private static void printArray(int[] ar) {
        for(int n: ar){
            System.out.print(n+" ");
        }
        System.out.println("");
    }
}