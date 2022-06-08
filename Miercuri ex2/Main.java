import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int [] a = {2,2,2,4,5};
        boolean b = false;

        for (int i = 0; i < a.length - 2; i++){
                if(a[i] % 2 == 0 && a[i+1] % 2 == 0 && a[i+2] % 2 == 0) {
                    b = true;

                }else if(a[i] % 2 == 1 && a[i+1] % 2 == 1 && a[i+2] % 2 == 1){
                    b = true;
                }else b = false;
        }
        System.out.println(b);




    }
}