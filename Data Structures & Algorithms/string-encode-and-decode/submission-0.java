class Solution {

     public String encode(List<String> strs) {
        StringBuilder encoded = new StringBuilder();
        for (String s : strs) {
            encoded.append(s.length()).append('#').append(s);
        }
        return encoded.toString();
    }

    // Decodes a single string to a list of strings.
    public List<String> decode(String s) {
        List<String> decoded = new ArrayList<>();
        int i = 0;
        while (i < s.length()) {
            int delimiterPos = s.indexOf('#', i); // Find the next '#'
            int length = Integer.parseInt(s.substring(i, delimiterPos));
            i = delimiterPos + 1; // Move past '#'
            decoded.add(s.substring(i, i + length));
            i += length; // Move past the current string
        }
        return decoded;
    }
}
