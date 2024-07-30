class Solution {
    public int numSub(String s) {
        int c = 0;
        int sum = 0;
        int mod = (int)Math.pow(10, 9) + 7;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '1') 
                c++;
            else if(c > 0) {
                sum += ((c*(c+1))/2) % mod;
                c = 0;
            }
        }
        if(c > 0){
        sum += ((c*(c+1))/2) % mod;
        }
        return sum;
    }
}
