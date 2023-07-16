package reversestring;

public class ReverseString {

    public String reverseString(String text) {
        String reverseText = "";
        if (text.equals("")) {
            return "";
        } else {
            for (int i = text.length() - 1; i >= 0; i--) {
                reverseText = reverseText + text.charAt(i);
            }
        }
        return reverseText;
    }
}
