/**
 * Created by nana1 on 7/21/2017.
 */
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] array = new int[n];
        for(int i = 0; i< array.length; i++) {
            array[i] = input.nextInt();
        }
        int[] sorted = insertionSort(array);
        System.out.println(median(sorted));
    }

    public static int[] insertionSort(int[] a) {
        for(int i=1;i<a.length; i++) {
            int element = a[i];
            int j = i-1;
            while(j >=0 && a[j] > element) {
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = element;
        }
        return a;
    }

    public static int median(int[] array) {
        int mid = array.length/2;
        if(array.length %2 ==1) {
            return array[mid];
        } else {
            return (array[mid-1] + array[mid]) / 2;
        }
    }
}