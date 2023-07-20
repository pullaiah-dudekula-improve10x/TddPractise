public class RemoveVowels {

    public String removeVowels(String text) {
        if (text == null || text.isEmpty()) {
            return "";
        } else {
            String result = "";
            result = text.replaceAll("[aeiouAEIOU]", "");
            return result;
        }
    }
}
