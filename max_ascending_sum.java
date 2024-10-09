class Solution {
    public int maxAscendingSum(int[] nums) {
        int res = 0, temp = 0, prev = 0;
        for(int i = 0; i < nums.length; i++){
            res += nums[i];
            System.out.print(res+" ");
            if(nums[i] <= prev){
                res -= nums[i];
                System.out.print(res+" ");
                temp = Math.max(temp, res);
                res = nums[i];
            }
            prev = nums[i];
        }
        return Math.max(temp, res);
    }
}
