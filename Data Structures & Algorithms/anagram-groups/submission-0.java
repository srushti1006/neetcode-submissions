class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0) {
            return new ArrayList<>();
        }
        HashMap<String,List<String>> hs = new HashMap<>();
        for(String temp:strs)
        {
            char[] charArrays = temp.toCharArray();
            Arrays.sort(charArrays);
            String sortedKey = new String(charArrays);
            if(!hs.containsKey(sortedKey))
            {
                hs.put(sortedKey,new ArrayList<>());
            }
            hs.get(sortedKey).add(temp);
        }
        return new ArrayList<>(hs.values());
    }
}
