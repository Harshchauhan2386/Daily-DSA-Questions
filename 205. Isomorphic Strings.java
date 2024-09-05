class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length())
        {
            return false;
        }
        int[] sMap = new int[256]; // ASCII characters
        int[] tMap = new int[256];
        for (int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            if (sMap[sChar] != tMap[tChar]) {
                return false; // If the last seen positions differ, they are not isomorphic
            }
            // Mark the current position +1 because the default is 0 (unseen)
            sMap[sChar] = i + 1;
            tMap[tChar] = i + 1;
        }
        return true;
    }
}
