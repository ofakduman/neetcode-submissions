class Solution {
    public static boolean isAnagram(String s, String t) {
        int sLength = s.length();
        int tLength = t.length();

        if (sLength != tLength)
            return false;

        Map<Character, Integer> containMap = new HashMap<>();


        for (int i = 0; i < sLength; i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            containMap.put(c1, containMap.getOrDefault(c1, 0) + 1);
            containMap.put(c2, containMap.getOrDefault(c2, 0) - 1);
        }
        for (Map.Entry<Character, Integer> entry : containMap.entrySet()) {
            if (entry.getValue() != 0)
                return false;
        }
        return true;
    }
}
