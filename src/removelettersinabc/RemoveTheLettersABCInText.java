package removelettersinabc;

public class RemoveTheLettersABCInText {

    public String removeTheLettersABCInText(String text) {
        if (text == null || text.isEmpty()) {
            return "";
        } else {
            StringBuilder result = new StringBuilder();
           for (int i = 0; i < text.length(); i++) {
               char c = text.charAt(i);
               if ( c != 'A' && c != 'B' && c != 'C' && c != 'a' && c != 'b' && c != 'c') {
                   result.append(i);
               }
           }
           return result.toString();
        }
    }
}

