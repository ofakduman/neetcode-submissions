class Solution {
    /**
        burda ilk olarak sayilarin frekansini alalim
        frekansi alinan sayilari bucket a koyalim yani tum bir array e 
        sonra o arrayden geriye dogru alalim k kadar
    */
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0) +1);
        }

        List<List<Integer>> listOfInt = new ArrayList<>();

        for(int i=0; i<=nums.length; i++){
            listOfInt.add(new ArrayList<>());
        }

        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            int num = entry.getKey();
            int freq = entry.getValue();

            listOfInt.get(freq).add(num);    
        }

        int[] result  = new int [k];
        int index=0;
        for(int i = nums.length; i>=0; i--){
            for(int num: listOfInt.get(i)){
                result[index++] = num;
                if(index==k){
                    return result;
                }
            }
        }

        return result;

    }
}
