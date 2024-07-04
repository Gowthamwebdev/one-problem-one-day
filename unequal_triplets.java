class Solution {
    public int unequalTriplets(int[] nums) {
        int count = 0;
        for(int i=0;i<nums.length-2;i++){
            for(int j=i+1;j<nums.length-1;j++){
                if(nums[i] != nums[j]){
                    for(int k=j+1;k<nums.length;k++){
                        if(nums[k] != nums[j] && nums[i] != nums[k]){
                            count++;
                        }
                    }
                }
            }
        }
        return count;
    }
}
