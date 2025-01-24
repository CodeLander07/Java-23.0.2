public class RemoveDuplicates{
    /**
     * Removes duplicate characters from the string.
     * @param s the input string
     * @param idx the current index in the string
     * @param sb the StringBuilder to store the result
     * @param charMap the boolean array to track characters
     */
    public static void removeDuplicates(String s, int idx, StringBuilder sb, boolean[] charMap) {
        if (idx == s.length()) {
            System.out.println(sb.toString());
            return;
        }
        // Check if the current character is already in the charMap
        char currChar = s.charAt(idx);
        if (charMap[currChar - 'a']) {
            removeDuplicates(s, idx + 1, sb, charMap);
        } else {
            charMap[currChar - 'a'] = true;
            removeDuplicates(s, idx + 1, new StringBuilder(sb).append(currChar), charMap);
        }
    }
    public static void main(String[] args) {
        String s = "MayurShantaramPatil".toLowerCase();
        StringBuilder sb = new StringBuilder();
        boolean charMap[] = new boolean[128];
        removeDuplicates(s,0,sb,charMap);
    }
}