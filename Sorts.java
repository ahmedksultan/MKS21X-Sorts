import java.io.*;
import java.util.*;

public class Sorts {
     public static void main(String[] args) {
          //testing

          int[] testary1 = {51, 3, 6, -4, 8, 99, 10, 1, 7, 66, 44, 33, 22, 1, 88, 9, 7, 5, -43, 6, 7, 9};
          selectionSort(testary1);
          System.out.println(Arrays.toString(testary1));

          int[] testary2 = {51, 3, 6, -4, 8, 99, 10, 1, 7, 66, 44, 33, 22, 1, 88, 9, 7, 5, -43, 6, 7, 9};
          bubbleSort(testary2);
          System.out.println(Arrays.toString(testary2));

          int[] testary3 = {51, 3, 6, -4, 8, 99, 10, 1, 7, 66, 44, 33, 22, 1, 88, 9, 7, 5, -43, 6, 7, 9};
          insertionSort(testary3);
          System.out.println(Arrays.toString(testary3));

          //testing empties
          int[] testary0s = {};
          int[] testary0b = {};
          int[] testary0i = {};

          selectionSort(testary0s);
          System.out.println(Arrays.toString(testary0s));

          bubbleSort(testary0b);
          System.out.println(Arrays.toString(testary0b));

          insertionSort(testary0i);
          System.out.println(Arrays.toString(testary0i));

     }

     //selectionSort
     public static void selectionSort(int[] input) {
          int minval;
          int tempval;
          int index2;
          //looping through whole array
          for (int i = 0; i < input.length; i++) {
               minval = input[i];
               index2 = i;
               //looping to find where to switch
               for (int q = i; q < input.length; q++) {
                    tempval = input[q];
                    if (tempval < minval) {
                         minval = tempval;
                         index2 = q;
                    }
               }
               int holdval = input[i];
               input[i] = minval;
               input[index2] = holdval;
          }
     }

     //bubbleSort
     public static void bubbleSort(int[] input) {
          for (int i = input.length; i > 0; i--) {
               for (int q = 0; q < i - 1; q++) {
                    if (input[q] > input[q+1]) {
                         int tempval = input[q];
                         input[q] = input[q+1];
                         input[q+1] = tempval;
                    }
               }
          }
     }


     //insertionSort
     public static void insertionSort(int[] input) {
          //Alma helped me with this
          for (int i = 1; i < input.length; i++) {
               int idx = i - 1;
               int temp = input[i];
               while (idx >= 0 && input[idx] > temp) {
                    input[idx+1] = input[idx];
                    idx--;
               }
               if (idx < 0) {
                    input[0] = temp;
               }
               else {
                    input[idx+1] = temp;
               }
          }
     }
}
