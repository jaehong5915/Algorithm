package BasicMath;

import java.util.Scanner;

public class S1712 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int A = scan.nextInt();
        int B = scan.nextInt();
        int C = scan.nextInt();
            if(B<C){
                int i= 1;
                while(i>0){
                    if((C-B)*i > A){
                        System.out.println(i);
                        break;
                    }
                    i++;
                }
            }else{
                System.out.println(-1);
            }
    }
}
