import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
        swapElements(4, arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
        // метод свапа двух элементов
    public static void swap(int left , int right, int[] arr) {
        while (left < right) {
            int temp;
            temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }

    }   /* Устанавливаем дипазон из элементов k (границами left и right) который мы будем свапать методом swap.
           Просвапав один диапазон проверям следующий на целостность и свапаем его, например при k = 4, шагаем по массиву
           left = 0 right = 3 далее если пройдена проверка, устанавливаем left = 4 right = 7 , далее left = 8 right 11 и тд.
           В конце массива если остаётся кол-во элементов меньше диапазона k, сужаем рамки left и right и свапаем. */

    public static void swapElements(int k, int[] arr) {
        int temp = k;
        int left = 0;
        int right = k - 1;
        while (arr.length - k >= 0) {
            swap(left, right, arr);
            left = k;
            k = k + temp;
            right = k - 1;
        }
        left = k - temp;
        right = arr.length - 1;
        swap(left, right, arr);
    }
}
