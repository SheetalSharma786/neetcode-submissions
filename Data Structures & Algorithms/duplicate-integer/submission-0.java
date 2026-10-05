class Solution {
    public boolean hasDuplicate(int[] nums) {
         Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<nums.length;i++) {
            if(map.isEmpty()) {
                map.put(nums[i],1);
            }else {
                Integer i1 = map.get(nums[i]);
                if(Objects.nonNull(i1)) {
                    map.put(nums[i], i1+1);
                }else {
                    map.put(nums[i], 1);
                }

            }

        }
        boolean flag = false;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            Integer integer2 = entry.getValue();
            if (integer2 > 1) {
                flag = true;
            }
        }
        return flag;        
    }
}