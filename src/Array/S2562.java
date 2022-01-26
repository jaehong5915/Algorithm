package Array;

import java.util.Scanner;

public class S2562 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int []A = new int[9];
        for(int i=0; i<9;i++){
            int B = scan.nextInt();
            scan.nextLine();
            A[i] = B;
        }
        int max = A[0];
        int maxIndex = 0;
        for(int j=0; j<A.length;j++){
            if(A[j]>=max){
                max = A[j];
                maxIndex = j;
            }
        }
        System.out.println(max);
        System.out.println(maxIndex+1);
    }
}
