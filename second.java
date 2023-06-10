public class second { 
    public static void main(String[] args) {
        // Initialize the array and the target element
        int[] arr = {3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170};
        int target = 10;
        
        // Call the "findElement" function and print the result
        int result = findElement(arr, target);
        System.out.println("The index of " + target + " in the array is: " + result);
    }
    
    static int findElement(int[] arr, int target) {
        // Start with a box of size 2
        int start = 0;
        int end = 1;
        
        // Keep increasing the box size until the target element is within the range
        while (target > arr[end]) {
            int newStart = end + 1; // the new start of the box
            end = end + (end - start + 1) * 2; // double the size of the box
            start = newStart;
        }
        
        // Perform binary search within the range to find the target element
        return binarySearch(arr, target, start, end);
    }
    
    static int binarySearch(int[] arr, int target, int start, int end) {
        // Perform binary search within the given range
        while (start <= end) {
            int mid = start + (end - start) / 2; // find the middle index
            
            if (arr[mid] == target) {
                return mid; // target found, return the index
            } else if (arr[mid] < target) {
                start = mid + 1; // target is in the right half of the range
            } else {
                end = mid - 1; // target is in the left half of the range
            }
        }
        
        return -1; // target not found in the given range
    }
}
