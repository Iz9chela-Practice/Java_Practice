package sort_algorithms;

import java.util.Arrays;

public class all_Sorting_Algorithms {

    public static void main(String[] args) {
        int[] array = new int[]{1,4,5,8,7,6,3,2,9,0};
//        bubbleSort(array);
        quickSort(array,4,9);
        System.out.println(Arrays.toString(array));
    }

    public static void bubbleSort(int[] array){  //O(n^2)
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 1; i < array.length; i++) {
                if (array[i - 1] > array[i]) {
                    int temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;
                    isSorted = false;
                }
            }
        }
//        System.out.println(Arrays.toString(array));
    }

    public static void quickSort(int[] array, int from, int to){        //O(nlog(n))
        if(from < to){
            int divideIndex = partition(array,from,to);

            quickSort(array,from,divideIndex-1);

            quickSort(array,divideIndex,to);
        }
    }

    private static int partition(int[] array, int from, int to){
        int rightIndex = to;
        int leftIndex = from;

        int pivot = array[from + (to-from) / 2];

        while (leftIndex<=rightIndex){
            while (array[leftIndex] < pivot){
                leftIndex++;
            }
            while (array[rightIndex] > pivot){
                rightIndex--;
            }
            if(leftIndex <= rightIndex){
                swap(array,rightIndex,leftIndex);
                leftIndex++;
                rightIndex--;
            }
        }
        return leftIndex;
    }

    public static void swap(int[] array, int firstElem, int secondElem){
        int temp = firstElem;
        firstElem = secondElem;
        secondElem = temp;
    }

    public static String arrayToString(int[] array){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append('[');
        for (int i = 0;i < array.length;i++){
            if(i> 0){
                stringBuilder.append(", ");
            }
            stringBuilder.append(array[i]);
        }
        return stringBuilder.toString();
    }
}
