package Array;

import java.util.Arrays;
import java.util.Scanner;

public class S2577 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int D = (scan.nextInt() * scan.nextInt() * scan.nextInt());
        String str = Integer.toString(D);
        scan.close();

        for(int i=0; i<10; i++){
            int cnt = 0;
            for(int j=0; j<str.length();j++){
                if(i==(str.charAt(j) -'0')){
                    cnt+=1;
                }
            }
            System.out.println(cnt);
        }
    }
}
