public class CountVowels {

    public int countVowels(String text) {
        if (text == null || text.isEmpty()) {
            return 0;
        } else {
            int count = 0;
            for (int i = 0; i < text.length(); i++) {
                char c = text.toUpperCase().charAt(i);
                if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                    count++;
                }
            }
            return count;
        }
    }
}
