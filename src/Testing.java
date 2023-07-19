public class Testing {
    public static void main(String[] args) {
        System.out.println(removeTheLettersAbc("apple contain"));
    }
    public static String removeTheLettersAbc(String text) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c == 'a' || c == 'b' || c == 'c') {
                result = text.replace(c, ' ');
            }
        }
        return result;
    }
}

