package Sorting;
import java.util.*;

public class InsertionSortPart1 {

    public static void printarray(int[] arr){
        for (int j=0; j<arr.length; j++){
            System.out.print(arr[j]);
            if(j==arr.length-1)
                System.out.println();
            else
                System.out.print(" ");
        }
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++){
            arr[i] = input.nextInt();
        }
        int min = arr[arr.length-1];
        for (int i=n-2; i>=0; i--){
            if(min<arr[i]) {
                arr[i + 1] = arr[i];
            }
            else
                arr[i+1] = min;

            printarray(arr);
            if (i==0 && min<arr[i]){
                arr[i] = min;
                printarray(arr);
            }
            if (arr[i]<min)
                break;

        }

    }


}
