import java.util.*;
class Solution {
    public int largestRectangleArea(int[] heights) {
        int maxarea = 0;
        Stack<Integer> stack = new Stack<>();
        for(int i = 0 ; i<=heights.length ; i++){
            int curr = (i==heights.length)? 0 : heights[i];
            while(!stack.isEmpty() && heights[stack.peek()] >= curr){
                int mid = stack.pop();
                int height = heights[mid];
                int width;
                if(stack.isEmpty()){
                    width = i;
                }else{
                    width = i - stack.peek() - 1;
                }
                int area = height * width;
                maxarea = Math.max(area,maxarea);
            }
            if(i < heights.length){
                stack.push(i);
            }
        }
        return maxarea;
    }
}