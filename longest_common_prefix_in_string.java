class Solution {
    public String longestCommonPrefix(String[] strs) {

        if(strs.length < 1) return strs[0];

        int i = 0;
        for(i=0; i<strs[0].length(); i++){
           for(int j=1; j<strs.length; j++){
            if( strs[j].length() <= i || (strs[0].charAt(i) != strs[j].charAt(i))) return strs[0].substring(0, i);
           }
        }
        return strs[0].substring(0, i);   
    }
}
