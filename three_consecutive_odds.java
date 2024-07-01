class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        boolean flag = false;
        for(int i=0;i<arr.length-2;i++){
            
            if(arr[i]%2 != 0 && arr[i+1]%2!=0 && arr[i+2]%2!=0){ 
                flag = true;
                break;
            }
            
        }
        if(!flag) return false;
        return true;
    }
}
