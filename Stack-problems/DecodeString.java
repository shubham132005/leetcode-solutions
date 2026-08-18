import java.util.Stack;

public class DecodeString {
    public String decodeString(String s){
        Stack<Integer> NumStack = new Stack<>();
        Stack<String> StringStack = new Stack<>();
        int num = 0;
        String curr = "";
        for(int i = 0 ; i<s.length() ;i++){
            char c = s.charAt(i);
            if(Character.isDigit(c)){
                num = num*10 + (c - '0');
            }
            else if(c == '['){
                NumStack.push(num);
                StringStack.push(curr);
                num = 0;
                curr = "";
            }
            else if(c == ']'){
                String previous = StringStack.pop();
                int repeat = NumStack.pop();
                String res = previous;
                for(int j = 0 ; j<repeat ;j++){
                    res += curr;
                }
                curr = res;
            }
            else{
                curr += c;
            }
        }
        return curr;
    }
}
