public class BubbleSort {

    public static void main(String[] args) {
        int[] array = {4,1,9,4,2,3,6};

        int length = array.length;
        for (int i=0; i<length-1; i++) {
            for( int j= i+1; j<length; j++) {
                if(array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

        for(int i: array) {
            System.out.print(i);
        }
    }

}
