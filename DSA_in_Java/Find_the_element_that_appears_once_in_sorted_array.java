class Solution 
{
    int findOnce(int arr[], int n)
    {
        // Initialize two pointers, 'l' and 'r', representing the left and right boundaries of the search range.
        int l = 0;
        int r = n - 1;

        // Start a binary search loop until 'l' is less than 'r'.
        while (l < r) {
            // Calculate the midpoint 'm'.
            int m = (l + r) / 2;

            // Check if 'm' is odd (has an odd index).
            if (m % 2 == 1)
                --m; // If 'm' is odd, make it even by decrementing it.

            // Compare the element at index 'm' with the element at index 'm + 1'.
            if (arr[m] == arr[m + 1])
                l = m + 2; // If they are equal, the single occurrence is to the right. Update 'l' accordingly.
            else
                r = m; // If they are not equal, the single occurrence is to the left. Update 'r' accordingly.
        }

        // When the loop exits, 'l' will point to the single occurrence element.
        return arr[l];
    }
}
