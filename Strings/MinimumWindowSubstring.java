package Strings;

public class MinimumWindowSubstring {
    public String minWindow(String s, String t){
        int required = t.length();
        if(t.length() > s.length()) return "";
        int left = 0;
        int minlen = Integer.MAX_VALUE;
        int start = 0;
        int[] freq = new int[128];
        for(int i = 0 ; i<t.length() ; i++){
            freq[t.charAt(i)]++;
        }
        for(int right = 0 ; right < s.length() ; right++){
            char c = s.charAt(right);
            if(freq[c] > 0){
                required--;
            }
            freq[c]--;
            while(required == 0){
                if(right-left+1 < minlen){
                    minlen = right-left+1;
                    start = left;
                }
                char d = s.charAt(left);

                freq[d]++;
                if(freq[d] > 0){
                    required++;
                }
                left++;
            }

        }
        if(minlen == Integer.MAX_VALUE) return "";
        return s.substring(start,start+minlen);

    }
}
