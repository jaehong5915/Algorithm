package Func;

import java.util.Scanner;
class Test{
    long sum(int[] a){
        long sum = 0;

        for(int i=0; i<a.length;i++){
            sum += a[i];
        }
        return sum;
    }
}
public class S15596 {
    public static void main(String[] args) {
        Test t = new Test();
    }
}
