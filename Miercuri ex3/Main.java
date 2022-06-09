import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        int [] a = {1,2,3,999,4};


        int dif = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Cate numere folositi?");
        int n = sc.nextInt();
        int[] array = new int[n];
        System.out.println("Introduceti numerele folosite: ");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        int max = array[0];
        int min = array[0];
        if(array.length >= 2) {
            for (int i = 0; i <= array.length - 1; i++) {
                    if(max < array[i]){
                    max = array[i];
                }
                    if(min > array[i]){
                        min = array[i];
                    }
            } System.out.println(max - min);
        }
    }
}