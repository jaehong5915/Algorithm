package Array;

import java.util.Scanner;

public class S4344 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int C = scan.nextInt();
        int []arr;
        for(int i=0; i<C; i++){
            int num = scan.nextInt();
            arr = new int[num];
            double sum = 0;

            for(int j=0; j<num; j++){
                arr[j] = scan.nextInt();
                sum += arr[j];
            }

            double cnt = 0;
            double avg = sum/num;

            for(int j=0; j<num; j++){
                if(arr[j] > avg){
                    cnt ++;
                }
            }
            System.out.println("cnt::"+cnt);
            System.out.println("avg:::"+avg);
            System.out.printf("%.3f%%\n",(cnt/num)*100);
        }
        scan.close();
    }
}
