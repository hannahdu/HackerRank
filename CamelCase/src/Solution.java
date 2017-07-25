/**
 * Created by nana1 on 7/21/2017.
 */
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int words = 1;
        for(int i=0; i<s.length(); i++) {
            String letter = Character.toString(s.charAt(i));
            if(letter == letter.toUpperCase()) {
                words++;
            }
        }
        System.out.println(words);
        //String[] strs = s.split("[A-Z]");
        //System.out.println(strs.length);
    }
}