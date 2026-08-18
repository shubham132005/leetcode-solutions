public class SquaresSortedArray {
    public int[] sortedSquares(int[] nums){
        int n = nums.length;
        int left = 0;
        int right = n-1;
        int idx = n-1;
        int[] ans = new int[n];
        while(left <= right){
            int leftsquare = nums[left]*nums[left];
            int rightsquare = nums[right]*nums[right];
            if(leftsquare>rightsquare){
                ans[idx--] = leftsquare;
                left++;
            }else{
                ans[idx--] = rightsquare;
                right--;
            }
        }
        return ans;
    }
    
}
