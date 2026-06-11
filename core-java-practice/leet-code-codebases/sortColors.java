
class sortColors {
    public void sortColors(int[] arr) {
        int n = arr.length;
        int i = 0, j = 0, k = n - 1;

        while (j <= k) {
            if (arr[j] == 0) {
                swap(arr, i, j);
                i++;
                j++;
            } else if (arr[j] == 1) {
                j++;
            } else {
                swap(arr, j, k);
                k--;

            }
        }
    }
    public static void swap(int[] nums, int l , int m){
        int temp = nums[l];
        nums[l]=nums[m];
        nums[m]=temp;
    }
}