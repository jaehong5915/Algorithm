package Array;

import java.util.Scanner;

public class S8958 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        String [] arr = new String[N];
        for(int i=0; i<N; i++){
            arr[i] = scan.next();
        }
        for(int i=0; i<arr.length;i++){
            int cnt = 0;
            int sum = 0;
            for(int j=0; j<arr[i].length();j++){
                if(arr[i].charAt(j) == 'o'){
                    cnt +=1 ;
                }
                else{
                    cnt = 0;
                }
                sum += cnt;
            }
            System.out.println(sum);
        }
    }
}
