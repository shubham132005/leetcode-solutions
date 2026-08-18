import java.util.Stack;

public class SimplifyPath {
    public String simplifyPath(String path){
        Stack<String> stack = new Stack<>();
        String[] parts = path.split("/");
        for(int i = 0 ; i<parts.length ; i++){
            if(parts[i].equals("") || parts[i].equals(".")){
                continue;
            }
            else if(parts[i].equals("..")){
                if(!stack.isEmpty()){
                    stack.pop();
                }
            }
            else{
                stack.push(parts[i]);
            }
        }
        StringBuilder res = new StringBuilder();
        for(String dir : stack){
            res.append("/");
            res.append(dir);
        }

        if (res.length() == 0) return "/";

        return res.toString();
    }
    
}
