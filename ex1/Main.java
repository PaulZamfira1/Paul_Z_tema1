import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = n % 10;
        int x = 0;
        int m = n;

        if (n > 9) {
            if (n < 99999) {
                while (n != 0) {
                    x = x * 10 + a;
                    n = n / 10;
                    a = n % 10;
                }
            }
                if(m == x) {
                    System.out.println(x + " este palindrom");
                }
                    else
                       System.out.println("nu este palindrom");
        }

    }
}