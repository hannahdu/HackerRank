/**
 * Created by nana1 on 7/25/2017.
 */
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        System.out.println(diff(s));
    }

    public static int diff(String s) {
        int count = 0;
        String sos = "SOS";
        for (int i=0; i<s.length(); i++) {
            if(s.charAt(i) != sos.charAt(i % 3)) {
                count++;
            }
        }
        return count;
    }
}