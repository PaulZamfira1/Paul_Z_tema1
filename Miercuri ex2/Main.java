import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        int [] a = {2,1,1,1,2};
        boolean b = false;
        Scanner sc = new Scanner(System.in);
        System.out.println("Cate numere folositi?");
        int n = sc.nextInt();
        int[] array = new int[n];
        System.out.println("Introduceti numerele folosite: ");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        for (int i = 0; i < array.length - 2; i++){
            if((array[i] % 2 == 0 && array[i+1] % 2 == 0 && array[i+2] % 2 == 0) ||
                    (array[i] % 2 == 1 && array[i+1] % 2 == 1 && array[i+2] % 2 == 1)) {
                b = true;

            }
        }
        System.out.println(b);




    }
}