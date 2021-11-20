/*
* Finding the shortest element in every iteration then swap between them.
*/

public class SelectionSort {
    public static void main(String[] args) {
        int[] array = {4,1,9,4,2,3,6};
        int length = array.length;

        for (int i=0; i<length-1; i++) {
            int min = i;
            for (int j=i+1; j<length; j++) {
                if(array[min] > array[j]) {
                    min = j;
                }
            }
            if(min != i) {
                swap(array, min, i);
            }
        }

        for(int a: array) {
            System.out.print(a);
        }
    }


    public static void swap(int[] array, int min, int i) {
        int temp = array[i];
        array[i] = array[min];
        array[min] = temp;
    }
}
