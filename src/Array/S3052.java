package Array;

import java.util.Arrays;
import java.util.Scanner;

public class S3052 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int A[] = new int[10];
        boolean bl;
        for(int i=0; i<A.length;i++){
            int num = scan.nextInt();
            A[i] = num%42;
        }
        int cnt=0;
        for(int i=0; i<A.length; i++){
            bl = false;
            for(int j=i+1; j<A.length; j++){
                if(A[i] == A[j]){
                    bl = true;
                }
            }
            if(bl == false){
                cnt +=1;
            }
        }
        System.out.println(cnt);
    }
}
