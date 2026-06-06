class Solution {
    public static boolean isAnagram(String s, String t) {
        int sLength = s.length();
        int tLength = t.length();

        if(sLength!=tLength)
            return false;

        int[] letters = new int[26];

        for(int i=0; i<sLength; i++){
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);
            letters[ch1 - 'a']++;
            letters[ch2 - 'a']--;
        }

        for(int value: letters){
            if(value!=0)
                return false;
        }
        return true;
    }
}
