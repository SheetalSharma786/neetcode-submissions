class Solution {
    public boolean isAnagram(String s, String t) {
         if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Integer> map = new HashMap<>(26);
        for (int i = 0; i < s.length(); i++) {
            char charAt = s.charAt(i);
            if (!map.containsKey(charAt)) {
                map.put(charAt, 1);
            } else {
                Integer i1 = map.get(charAt);
                map.put(charAt, i1 + 1);
            }
        }

            for (int i = 0; i < s.length(); i++) {
                char charAt = t.charAt(i);
                if (!map.containsKey(charAt)) {
                    return false;
                } else {
                    Integer i1 = map.get(charAt);
                    int i2 = i1 - 1;
                    if (i2 == 0) {
                        map.remove(charAt);
                    } else {
                        map.put(charAt, i1 - 1);
                    }

                }
            }
        return map.isEmpty();
    }
}
