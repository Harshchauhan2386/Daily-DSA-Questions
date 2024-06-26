class Solution {
   public List<List<String>> groupAnagrams(String[] strs) {
    Map<String, List<String>> result = new HashMap<>();
    for (int i = 0; i < strs.length; i++) {
      String str = strs[i];
      String alignedStr = alignStr(str);
      if (result.get(alignedStr) == null) {
        result.put(alignedStr, new ArrayList<>());
      }
      result.get(alignedStr).add(str);
    }
    return new ArrayList<>(result.values());
  }

  private String alignStr(String str) {
    char[] charArray = str.toCharArray();
    Arrays.sort(charArray);
    return new String(charArray);
  }
}
