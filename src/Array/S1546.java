package Array;

import java.util.Scanner;

public class S1546 {
    public static void main(String[] args) {
        //먼저 최댓값 구하기.
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int []arr = new int[N];
        double max=0.0;
        for(int i=0; i<arr.length; i++){
            arr[i] = scan.nextInt();
        }
        for(int i=0; i<arr.length; i++){
            if(arr[i] > max ){
                max = arr[i];
            }
        }
        double sum = 0.0;
        for(int i=0; i<arr.length; i++){
            sum = sum + (arr[i]/max)*100;
        }
        System.out.println(sum/N);
    }
}
