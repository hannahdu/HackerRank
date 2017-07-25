/**
 * Created by nana1 on 7/25/2017.
 */
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        String msg = input.next();
        int key = input.nextInt()%26;

        StringBuffer sb = new StringBuffer(msg);
        for(int i=0;i<n;i++){
            int num=0;
            char ch = msg.charAt(i);
            if((int)ch >= 65 && (int)ch <= 90) {
                num = (int)ch + key;
                if(num>90) {
                    num=64+num-90;
                }
                sb.setCharAt(i, (char)num);
            }

            if((int)ch >= 97 && (int)ch <= 122) {
                num = (int)ch + key;
                if(num>122){
                    num=96+num-122;
                }
                sb.setCharAt(i, (char)num);
            }
        }
        System.out.println(sb);
        input.close();
    }
}