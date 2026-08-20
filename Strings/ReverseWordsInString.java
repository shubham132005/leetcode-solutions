package Strings;

public class ReverseWordsInString {
    public String reverseWords(String s){
        String s1 = s.trim();
        String[] arr = s1.split("\\s+");
        StringBuilder res = new StringBuilder();
        for(int i = arr.length-1 ; i>=0 ; i--){
            res.append(arr[i]);
            if(i != 0){
                res.append(" ");
            }
        }
        return res.toString();
    }
}