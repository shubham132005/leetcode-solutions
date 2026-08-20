package Strings;

import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s){
        int left = 0 ;
        int right = 0;
        int max = 0;
        int n = s.length();
        HashSet<Character> set = new HashSet<>();
        while(right < n){
            if(!set.contains(s.charAt(right))){
                set.add(s.charAt(right));
                max = Math.max(max,right-left+1);
                right++;
            }else{
                set.remove(s.charAt(left));
                left++;
            }
        }
        return max;
    }
}
