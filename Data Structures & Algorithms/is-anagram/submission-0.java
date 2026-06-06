class Solution {
    public static boolean isAnagram(String s, String t) {
        int sLength = s.length();
        int tLength = t.length();

        HashMap<Character,Integer> hm1 = new HashMap<>();
        HashMap<Character,Integer> hm2 = new HashMap<>();

        if(sLength != tLength)
            return false;

        for (int i = 0; i < sLength; i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            hm1.put(c1, hm1.getOrDefault(c1,1) + 1);
            hm2.put(c2, hm2.getOrDefault(c2,1) + 1);
        }

        return hm1.equals(hm2);
    }
}
