public class LinearSearch {

    public static void main(String[] args) {
        int[] a = {1,8,3,4,5,7};
        int target = 5;

        for (int it : a) {
            if (it == target) {
                System.out.println(it);
            }
        }
    }
}
