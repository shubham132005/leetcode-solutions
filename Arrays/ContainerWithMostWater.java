public class ContainerWithMostWater {
    public int maxArea(int[] height){
        int n = height.length;
        int max = 0;
        int left = 0;
        int right = n-1;
        while(left<right){
            int width = right - left;
            int h = Math.min(height[left] , height[right]);
            int area = width*h;

            max = Math.max(max,area);

            if(height[left] < height[right]){
                left++;
            }else{
                right--;
            }
        }
        return max;
    }
}
