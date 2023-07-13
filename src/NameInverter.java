public class NameInverter {

    public String nameInverter(String text) {
        if(text.contains("")) {
            return "";
        } else if (!text.trim().contains(" ")) {
            return text.trim();
        }

        return "";
    }
}
