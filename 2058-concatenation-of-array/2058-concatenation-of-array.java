class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] result = new int[2*nums.length];
        int n =2*nums.length;

        for(int i =0;i<n/2;i++){
            result[i]=nums[i];
            result[i+nums.length]=nums[i];
            
        }
        return result;
    }
}