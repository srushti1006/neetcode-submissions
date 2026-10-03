class Solution {
    public boolean isAnagram(String s, String t) {
        // char[] sarray = s.toCharArray();
        // char[] tarray = t.toCharArray();
        // Arrays.sort(sarray);
        // Arrays.sort(tarray);
        // return Arrays.equals(sarray, tarray);
        if(s.length() != t.length())
        {
            return false;
        }
        HashMap<Character,Integer> countS=new HashMap<>();
        HashMap<Character,Integer> countT=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            countS.put(s.charAt(i),countS.getOrDefault(s.charAt(i),0)+1);
            countT.put(t.charAt(i),countT.getOrDefault(t.charAt(i),0)+1);
        }
        return countS.equals(countT);
    }
}
