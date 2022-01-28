package BasicMath;

import java.util.Scanner;

public class S2292 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int cnt = 1;
        int range = 1;

        if(n == 1){
            System.out.println(1);
        } else{
            while(range < n ) {
                cnt ++;
                range += (cnt-1) * 6;
            }
            System.out.println(cnt);
        }
    }
}
