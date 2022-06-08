import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int [] a = {1,2,3,999,4};
        int max = a[0];
        int min = a[0];
        int dif = 0;

        if(a.length > 1) {
            for (int i = 0; i < a.length; i++) {
                    if(a[i] > max){
                    max = a[i];
                }
                    if(a[i] < min){
                        min = a[i];
                    }

            }

        } else System.out.println(a[0]);

        dif = max - min;
        System.out.println(dif);
    }
}