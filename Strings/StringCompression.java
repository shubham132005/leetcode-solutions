package Strings;

public class StringCompression {
    public int compress(char[] chars){
        int idx = 0;
        int i =0;
        while(i < chars.length){
            char curr = chars[i];
            int count = 0;
            while(i<chars.length && chars[i] == curr){
                i++;
                count++;
            }
            chars[idx++] = curr;
            if(count > 1){
                String s  = String.valueOf(count);
                for(char c : s.toCharArray()){
                    chars[idx++] = c;
                }
            }
        }
        return idx;
    }
}
