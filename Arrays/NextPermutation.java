public class NextPermutation {
    public void nextPermutation(int[] nums){
        int n = nums.length;
        int i = n-2;
        while(i>=0 && nums[i] >= nums[i+1]){
            i--;
        }
        int pivot = i;
        if(pivot>=0){
            int swapindex = n-1;
            while(nums[swapindex] <= nums[pivot]){
                swapindex--;
            }

            int temp = nums[swapindex];
            nums[swapindex] = nums[pivot];
            nums[pivot] = temp;
        }

        int start = i+1;
        int end = n-1;
        while(start < end){
            int temp = nums[start];
            nums[start] =nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
