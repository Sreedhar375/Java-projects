
// Binary Search is a searching algorithm which is used to search for an element in a sorted array
// It works by repeatedly dividing the search interval in half
// The idea of binary search is to use the information that the array is sorted and reduce the time complexity to O(Log n)
public class BinarySearchExample {
    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 5;
        int result = binarySearch(arr, target);
        if (result != -1) {
            System.out.println("Element found at index " + result);
        } else {
            System.out.println("Element not found in the array.");
        }
    }
    public static int binarySearch(int[] arr, int target){
        int left = 0;
        int right = arr.length - 1;
        int result = -1;
        while(left <= right){
            int mid = left + (right - left) / 2;
            if(arr[mid] == target){
                result = mid;
                right = mid - 1;
            }else if(arr[mid] < target){
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }
        return result;
    }
}
