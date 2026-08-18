import java.util.*;
public class AsteroidCollision {
    public int[] asteroidCollision(int[] asteroids){
        Stack<Integer> stack = new Stack<>();

        for(int curr : asteroids){
            while(!stack.isEmpty() && stack.peek() > 0 && curr <0){
                if(stack.peek() > Math.abs(curr)){
                    curr = 0;
                    break;
                }
                if(stack.peek() < Math.abs(curr)){
                    stack.pop();
                }else if(stack.peek() == Math.abs(curr)){
                    stack.pop();
                    curr = 0;
                    break;
                }
            }
            if(curr!=0){
                stack.push(curr);
            }
            
        }
        int[] ans = new int[stack.size()];
        for(int i = stack.size()-1 ; i>=0 ; i--){
            ans[i] = stack.pop();
        }
        return ans;
    }
    
}
