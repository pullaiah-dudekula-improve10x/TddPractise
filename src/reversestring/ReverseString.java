package reversestring;

public class ReverseString {

    public String reverseString(String text) {
        String reverseText = "";
        if (text == null || text.equals("")) {
            return "";
        } else if (text.length() == 1) {
            return text;
        } else {
            for (int i = text.length() - 1; i >= 0; i--) {
                reverseText = reverseText + text.charAt(i);
            }
        }
        return reverseText;
    }
}
