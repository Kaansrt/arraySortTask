import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int number;
        System.out.print("Dizinin boyutu : ");
        number = inp.nextInt();
        int[] arr = new int[number];
        int nmb=0;
        System.out.println("Dizinin elemanlarını giriniz : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(i+1 + ". Eleman : ");
            nmb = inp.nextInt();
            arr[i] = nmb;
        }
        Arrays.sort(arr);
//        System.out.println("Sıralama : "+Arrays.toString(arr));
        System.out.print("Sıralama : ");
        for (int sortion : arr) {
            System.out.print(sortion + " ");
        }
    }
}