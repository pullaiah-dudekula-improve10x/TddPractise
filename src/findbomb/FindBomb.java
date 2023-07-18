package findbomb;

import java.util.Locale;

public class FindBomb {

    public String findBomb(String text) {
        if (text == null || text.equals("")) {
            return "";
        } else {
            String result = "";
            String lowerCase = text.toLowerCase(Locale.ROOT);
            if (lowerCase.contains("bomb")) {
                result = "Duck!";
            } else {
                result = "Relax there is no Bomb!";
            }
            return result;
        }
    }
}
