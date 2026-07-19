class Solution {
    public void merge(int[]arr,int left,int mid,int right){
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] L = new int[n1];
        int[] R = new int[n2];

        // Copy left half
        for (int i = 0; i < n1; i++)
            L[i] = arr[left + i];

        // Copy right half
        for (int j = 0; j < n2; j++)
            R[j] = arr[mid + 1 + j];

        int i = 0, j = 0, k = left;

        // Merge the two sorted arrays
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k++] = L[i++];
            } else {
                arr[k++] = R[j++];
            }
        }

        // Copy remaining elements
        while (i < n1) {
            arr[k++] = L[i++];
        }

        while (j < n2) {
            arr[k++] = R[j++];
        }
    }
    public void mergeSort(int[] nums,int l,int h){
        if(l==h)return;
        int mid=(l+h)/2;
        mergeSort(nums,l,mid);
        mergeSort(nums,mid+1,h);
        merge(nums,l,mid,h);

        
    }
    public int[] sortArray(int[] nums) {
        int low=0;
        int high=nums.length-1;
        
        mergeSort(nums,low,high);
        return nums;
    }
}