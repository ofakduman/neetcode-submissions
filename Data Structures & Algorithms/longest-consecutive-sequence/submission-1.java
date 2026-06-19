class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for(int num: nums){
            set.add(num);
        }
        int counter = 0;
        int max = 0;
        for(int num: set){
            if(set.contains(num-1)){
                //
            }else{
                while(set.contains(num++)){
                    counter++;
                }
                if(max<counter){
                    max=counter;
                }
            }
            counter = 0;
        }
        return max;

    }
}
