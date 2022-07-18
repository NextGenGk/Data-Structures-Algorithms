public class Binary_Search {
    // Binary Search Function
    int binarySearch(int[] arr, int n, int k) {
        // Starting index
        int low = 0;
        // Ending Index
        int high = n-1;

        // While low is less than equal high
        while(low <= high) {
            // Find mid element
            int mid = low + (high - low)/2;

            // Check if value is present at mid
            if(arr[mid] == k) {
                return mid;
            }
            // If value is greater than mid (ignore left half)
            else if(arr[mid] < k) {
                low = mid + 1;
            }
            // If value is smaller than mid (ignore right half)
            else {
                high = mid - 1;
            }
        }
        // if we reach here, then element was
        // not present
        return -1;
    }
}

// Output -
/*
Input:
N = 5
arr[] = {1 2 3 4 5}
K = 4
Output: 3
Explanation: 4 appears at index 3.
 */

// Algorithm -
/*
Step-by-step Binary Search Algorithm: We basically ignore half of the elements just after one comparison.
1. Compare x with the middle element.
2. If x matches with the middle element, we return the mid index.
3. Else If x is greater than the mid element, then x can only lie in the right half subarray after the mid element.
   So we recur for the right half.
4. Else (x is smaller) recur for the left half.
 */


// Time & Space Complexity -
/* Worst complexity: O(log n)
   Average complexity: O(log n)
   Best complexity: O(1)
   Space complexity: O(1)
 */
