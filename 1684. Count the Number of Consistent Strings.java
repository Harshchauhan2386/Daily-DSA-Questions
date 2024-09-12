class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i < allowed.length(); i++) {
            set.add(allowed.charAt(i));
        }
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words[i].length(); j++) {
                if (!set.contains(words[i].charAt(j))) {// Checks the Character do exist or Not
                    count++;
                    break;// Return from the secound loop and continue the first loop
                }
            }
        }
        return words.length - count;
    }
}
