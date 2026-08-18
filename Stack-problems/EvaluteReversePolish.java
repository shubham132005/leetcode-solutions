import java.util.*;
class RPN {
    public int evalRPN(String[] tokens) {

        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i < tokens.length; i++) {

            String token = tokens[i];

            if(!token.equals("+") &&
               !token.equals("-") &&
               !token.equals("*") &&
               !token.equals("/")) {

                stack.push(Integer.parseInt(token));
            }

            else {

                int a = stack.pop();
                int b = stack.pop();

                int result;

                if(token.equals("+"))
                    result = b + a;
                else if(token.equals("-"))
                    result = b - a;
                else if(token.equals("*"))
                    result = b * a;
                else
                    result = b / a;

                stack.push(result);
            }
        }

        return stack.peek();
    }
}