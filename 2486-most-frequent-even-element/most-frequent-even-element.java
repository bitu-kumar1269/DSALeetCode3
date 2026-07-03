class Solution {
    public int mostFrequentEven(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int num: nums){
            if(num % 2 == 0)
                map.put(num, map.getOrDefault(num, 0)+ 1);
        }
        if(map.isEmpty()){
            return -1;
        }
        int maxFreq = 0;
        int res = -1;

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int currentElement = entry.getKey();
            int currentFreq = entry.getValue();
            
            if (currentFreq > maxFreq || (currentFreq == maxFreq && currentElement < res)) {
                maxFreq = currentFreq;
                res = currentElement;
            }
        }
        
        return res;

        



    }
}