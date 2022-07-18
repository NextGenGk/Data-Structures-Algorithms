public class Sort_012 {
    // Swap Function
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Sort 012 Function
    public static void sort012(int a[], int n)
    {
        // Initialize low
        int low = 0;
        // Initialize mid
        int mid = 0;
        // Initialize high
        int high = n-1;

        // while mid is less than equal to high
        while(mid <= high) {
            // Check if mid is equal to equal to 0
            if(a[mid] == 0) {
                // If 0, swap arr[low] and arr[mid], low++, mid++
                swap(a, low, mid);
                low++;
                mid++;
            }
            // Check if mid is equal to equal to 1
            else if(a[mid] == 1) {
                // If 1, mid++
                mid++;
            }
            // Else
            else {
                // If 2, swap arr[mid] and arr[high], high--
                swap(a, mid, high);
                high--;
            }
        }
    }
}

// Output -
/*
Input:
N = 5
arr[]= {0 2 1 2 0}
Output:
0 0 1 2 2
Explanation:
0s 1s and 2s are segregated
into ascending order.
 */

// Algorithm -
/*
1. Initialize low, mid & high
2. If 0, swap arr[low] and arr[mid], low++, mid++
3. If 1, mid++
4. If 2, swap arr[mid] and arr[high], high--
 */

// Time & Space Complexity -
/*
Time - O(n)
Space - O(1)
 */
