public class LinearSearchExample {
    public static boolean linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return true;
            }
        }
        return false; 
    }

    public static void main(String[] args) {
        int [] arr = {5, 8, 2, 9, 4, 7};
        int target = 9;
        boolean result = linearSearch(arr, target);
        if (result) {
            System.out.println("Element found in the array.");
        } else {
            System.out.println("Element not found in the array.");
        }
    }
}