import java.util.Stack;

public class RemoveKdigits {
    public String removeKdigits(String num, int k){
        Stack<Character> stack = new Stack<>();
        for(int i = 0 ; i<num.length() ; i++){
            char c = num.charAt(i);
            while(k>0 && !stack.isEmpty() && stack.peek() > c){
                stack.pop();
                k--;
            }
            stack.push(c);
        }
        while(k>0){
            stack.pop();
            k--;
        }

        StringBuilder res = new StringBuilder();
        while(!stack.isEmpty()){
            res.append(stack.pop());
        }
        res.reverse();

        int i = 0;
        while(i<res.length() && res.charAt(i) == '0'){
            i++;
        }
        res = new StringBuilder(res.substring(i));

        if(res.length() == 0){
            return "0";
        }

        return res.toString();
    }
}
