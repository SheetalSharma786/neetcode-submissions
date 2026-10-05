class Solution {
    public boolean isAnagram(String s, String t) {
          if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }

        for (int i = 0; i < s.length(); i++) {
            char charAt = t.charAt(i);

            int count = map.getOrDefault(charAt, 0);

            if (count == 0) {
                return false;
            }

            if (count == 1) {
                map.remove(charAt);
            } else {
                map.put(charAt, count - 1);
            }

            }

        return map.isEmpty();
    }
}
