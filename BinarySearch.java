public class BinarySearch {

    public static void main(String[] args) {

        int[] array = {1,3,5,7,8,9,11};
        int target = 3;

        int firstElement = 0;
        int lastElement = array.length-1;

        while(firstElement<=lastElement) {
            int mid = (firstElement + lastElement) / 2;
            if(array[mid] == target) {
                System.out.println(array[mid]);
            }
            if (array[mid] < target) {
                firstElement = mid + 1;
            } else {
                lastElement = mid - 1;
            }
        }
    }
}
