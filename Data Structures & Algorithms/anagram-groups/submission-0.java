class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<Map<Character,Integer>, List<String>> map = new HashMap<>();
        for(String str: strs) {
            Map<Character,Integer> frequencyMap = new HashMap<>();
            for(int i = 0;i<str.length();i++) {
                char key = str.charAt(i);
                frequencyMap.put(key, frequencyMap.getOrDefault(key,0) +1);
            }
            if(!map.containsKey(frequencyMap)) {
                List<String> strings = new ArrayList<>();
                strings.add(str);
                map.put(frequencyMap,strings);
             }else {
                List<String> strings = map.get(frequencyMap);
                strings.add(str);
            }
        }
        List<List<String>> stringList = new ArrayList<>();
        stringList.addAll(map.values());
        return stringList;
        
    }
}
