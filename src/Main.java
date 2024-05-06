import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] list = {15, 12, 788, 30, -1, -778, 500, 0};

        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen bir sayı girin: ");
        int targetNumber = scanner.nextInt();
        scanner.close();

        int min = Integer.MIN_VALUE; //max value for the start
        int max = Integer.MAX_VALUE; //min value for the start

//formula for the take the min and max numbers.
        for (int i : list) {
            if (i < targetNumber && i > min) {
                min = i;
            }
            if (i > targetNumber && i < max) {
                max = i;
            }
        }
//outputs for user.
        System.out.println("Dizi: " + Arrays.toString(list));
        System.out.println("Girilen Sayı: " + targetNumber);
        if (min == Integer.MIN_VALUE) {
            System.out.println("Girilen sayıdan küçük en yakın sayı bulunamadı.");
        } else {
            System.out.println("Girilen sayıdan küçük en yakın sayı: " + min);
        }
        if (max == Integer.MAX_VALUE) {
            System.out.println("Girilen sayıdan büyük en yakın sayı bulunamadı.");
        } else {
            System.out.println("Girilen sayıdan büyük en yakın sayı: " + max);
        }
    }
}
