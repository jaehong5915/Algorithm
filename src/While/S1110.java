package While;

import java.util.Scanner;

public class S1110 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int D= (A%10*10)+((A%10+A/10)%10);
        if(A<10){
             D = (A%10)*10+(A%10);
        }
        int cnt = 1;
        while(A!=0){
            cnt = cnt +1;
            D = (D%10*10)+((D%10+D/10)%10);
            if(D==A){
                break;
            }
        }
        System.out.println(cnt);
    }
}
