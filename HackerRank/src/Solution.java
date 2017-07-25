/**
 * Created by nana1 on 7/25/2017.
 */
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            System.out.println(checkHacker(s));
        }

    }

    public static String checkHacker(String s) {
        String hr = "hackerrank";
        if(s.length() < hr.length()) {
            return "NO";
        }
        int j =0;
        for(int i =0; i <s.length(); i++) {
            if(j< hr.length() && (s.charAt(i) == hr.charAt(j))) {
                j++;
            }
        }
        return (j == hr.length()? "YES" : "NO");
    }
}