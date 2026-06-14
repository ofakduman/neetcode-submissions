class Solution {
    public int[] productExceptSelf(int[] nums) {
        int numLen = nums.length;
        int[] result = new int[numLen];
        int solCarpim = 1;
        //1,2,3,4
        //1,1,2,6
        for(int i=0; i<numLen; i++){
            result[i] = solCarpim;
            solCarpim*=nums[i];
        }

        //result-> 1,1,2,6        
        int sagCarpim = 1;
        for(int i = numLen-1; i>=0 ; i--){
            result[i]*=sagCarpim;
            sagCarpim*=nums[i];
        }



        
        return result;
    }
}  
