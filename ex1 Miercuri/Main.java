import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n = 0;
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        int b = sc.nextInt();

        System.out.println(a);
        System.out.println(b);

        String s = a.substring(a.length() - b, a.length());
        for ( int i = 0; i < b; i++) {
            System.out.print(s);
        }




    }
}