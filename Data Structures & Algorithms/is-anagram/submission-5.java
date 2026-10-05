class Solution {
    public boolean isAnagram(String s, String t) {
       
        Map<String, Integer> map = new HashMap<>();
        for(int i= 0; i<s.length(); i++) {
            String key = s.charAt(i) + "_" + 's';
            if(map.isEmpty()) {
                map.put(key, 1);
            }else {
                Integer i1 = map.get(key);
                if(Objects.isNull(i1)) {
                    map.put(key, 1);
                }else {
                    map.put(key, i1 + 1);
                }
            }
        }

        for(int i= 0; i<t.length(); i++) {
            String key = t.charAt(i) + "_" + 't';
            if(map.isEmpty()) {
                map.put(key, 1);
            }else {
                Integer i1 = map.get(key);
                if(Objects.isNull(i1)) {
                    map.put(key, 1);
                }else {
                    map.put(key, i1 + 1);
                }
            }
        }
        boolean flag = false;
        for (String key : map.keySet()) {
            String[] split = key.split("_");
            String s1 = split[0];
            Integer sCharCount = map.get(s1 + "_" + "s");
            Integer tCharCount = map.get(s1 + "_" + "t");
            if (Objects.equals(sCharCount, tCharCount)) {
                flag = true;
            }else {
                flag = false;
                break;
            }
        }
        return flag;
    }
}
