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
}
