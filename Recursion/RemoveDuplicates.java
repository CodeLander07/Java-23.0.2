public class RemoveDuplicates{
    public static String removeDuplicates(String s) {
        if (s.length() == 0) {
            return "";
        }
        if (s.length() == 1) {
            return s;
        }
        if (s.charAt(0) == s.charAt(1)) {
            return removeDuplicates(s.substring(1));
        }
        return s.charAt(0) + removeDuplicates(s.substring(1));
    }
    public static void main(String[] args) {
        System.out.println(removeDuplicates("aaaabbbcc"));
    }
}