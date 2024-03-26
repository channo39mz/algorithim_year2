import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
public class QuickSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int size = 0;
        while (true) {
            System.out.print("Enter a number or press Enter to finish ");
            String input = sc.nextLine();

            // Check if the input is empty -> Enter
            if (input.trim().isEmpty()) {
                break;
            }

            try {
                int num = Integer.parseInt(input);
                arr[size] = num;
                size++;
            } catch (NumberFormatException e) {
                System.out.println("Enter only number");
            }
        }
        
        sc.close();
        myQuickSort(arr, 0 , arr.length - 1);
        System.out.println("ans = " +  Arrays.toString(arr));
    }

    private static void myQuickSort(int[] arr , int start, int end){
        if(end <= start) return;

        int pivot = partition(arr, start, end);
        /*for(int i : arr){
            System.out.print(i + " ");
        }
        System.out.println();*/
        myQuickSort(arr, start, pivot - 1);
        myQuickSort(arr, pivot + 1, end);

    }

    private static int partition(int[] arr, int start, int end){
        int pivot = arr[end];
        int i = start - 1;
        //System.out.println(pivot);
        for (int j = start; j <= end - 1; j++){
            if (arr[j] < pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = arr[end];
        arr[end] = temp;
        return i;
    }
}
