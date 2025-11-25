class Solution {
    static int ans;
    public void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public int partition(int[] arr, int low, int high) {

        int pivot = arr[low];
        int pivotIndex = low;
        int smallerCount = 0;

        // Count elements <= pivot
        for (int i = low + 1; i <= high; i++) {
            if (arr[i] <= pivot)
                smallerCount++;
        }

        // Move pivot to correct position
        int correctIndex = pivotIndex + smallerCount;
        swap(arr, pivotIndex, correctIndex);

        int i = low;
        int j = high;

        // Rearrange elements
        while (i < correctIndex && j > correctIndex) {
            if (arr[i] <= pivot)
                i++;
            else if (arr[j] > pivot)
                j--;
            else {
                swap(arr, i, j);
                i++;
                j--;
            }
        }
        return correctIndex;
    }
        public  void quickSelect(int[] arr, int low, int high, int k) {

        if (low > high)
            return;

        if (low == high) { 
            ans = arr[low];
            return;
        }

        int index = partition(arr, low, high);

        if (index == k - 1) {
            ans = arr[index];
            return;
        }

        if (k - 1 < index)
            quickSelect(arr, low, index - 1, k);
        else
            quickSelect(arr, index + 1, high, k);
    }

    public int findKthLargest(int[] arr, int k) {
        ans =-1;
        int n = arr.length;
        quickSelect(arr,0,n-1,n-k+1);
        return ans;

        
    }
}