import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int [] a = {2,1,1,1,2};
        boolean b = false;

        for (int i = 0; i < a.length - 2; i++){
                if((a[i] % 2 == 0 && a[i+1] % 2 == 0 && a[i+2] % 2 == 0) ||
                        (a[i] % 2 == 1 && a[i+1] % 2 == 1 && a[i+2] % 2 == 1)) {
                    b = true;

                }
        }
        System.out.println(b);




    }
}