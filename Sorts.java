import java.io.*;
import java.util.*;

public class Sorts {
     public static void selectionSort(int[] input) {
          for (int i = 0; i < input.length; i++) {
               //loops thru input array, and finds value with minimum index, sorts based on that
               int minidx = i;
               for (int q = i + 1; q < input.length; q++) {
                    if (input[q] < input[minidx]) {
                         minidx = q;
                    }
                    //holds value and switches
                    int hold = input[minidx];
                    input[minidx] = input[q];
                    input[q] = hold;
               }
          }
     }
     public static void main(String[] args) {
          int[] testary1 = {51, 3, 6, -4, 8, 99, 10, 1, 7};
          selectionSort(testary1);
          System.out.println(Arrays.toString(testary1));
     }
}
