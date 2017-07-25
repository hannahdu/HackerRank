/**
 * Created by nana1 on 7/19/2017.
 */
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arI = new int[n];
        int[] arQ = new int[n];
        for(int i=0; i< n; i++) {
            arI[i]= input.nextInt();
            arQ[i] = arI[i];
        }
        int numShiftsInsertion = insertionSortShifts(arI);
        int numShiftsQuick = QSShifts(arQ);
        System.out.println(numShiftsInsertion - numShiftsQuick);
    }

    public static int insertionSortShifts(int[] ar) {
        int count = 0;
        for(int i =1; i < ar.length; i++) {
            int element = ar[i];
            int j = i-1;
            while(j >=0 && ar[j] > element) {
                ar[j+1] = ar[j];
                j--;
                count++;
            }
            ar[j+1] = element;
        }
        return count;
    }

    static int swapCountQS = 0;
    private static int QSShifts(int[] array) {
        quickSort(array,0,array.length-1);
        return swapCountQS;
    }

    public static void quickSort(int[] array, int start, int end) {

        if (start < end) {
            int pivot = partition(array, start, end);

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
                swapCountQS++;
            }
        }
        int temp = array[end];
        array[end] = array[i+1];
        array[i+1] = temp;
        swapCountQS++;

        return i+1;
    }
}