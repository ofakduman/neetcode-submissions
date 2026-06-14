class Solution {
    public int[] productExceptSelf(int[] nums) {
        int product = 1;
        int zeroCounter = 0;
        for(int num: nums){
            if(num != 0){
                product*=num;
            }
            else
                zeroCounter++;
        }
        int[] result = new int[nums.length];
        int index = 0;
        for(int num: nums){
            if(zeroCounter==0)
                result[index++] = product/num;
            else if(zeroCounter==1 && num==0)
                result[index++] = product;
            else
                result[index++] = 0;            
        }

        return result;
    }
}  
