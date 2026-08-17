import java.util.*;
public class NextGreaterElement2 {
    public int[] nextGreaterElements(int[] nums){
        Stack<Integer> stack = new Stack<>();
        int[] ans = new int[nums.length];
        for(int i  =  2*nums.length -1 ; i >=0 ; i--){
            int curr = nums[i%nums.length];

            while(!stack.isEmpty() && stack.peek() <= curr){
                stack.pop();
            }
            if(i<nums.length){
                ans[i] = (stack.isEmpty())? -1 : stack.peek();
            }
            stack.push(curr);

        }
        return ans;
    }
}
