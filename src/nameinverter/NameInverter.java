package nameinverter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NameInverter {

    public String nameInverter(String text) {
        if(text.equals("")) {
            return "";
        } else if (!text.trim().contains(" ")) {
            return text.trim();
        } else {
            ArrayList<String> texts = new ArrayList<>(Arrays.asList(text.trim().split("\\s+")));
            removeHonorifics(texts);
            String postNominal = getPostNominal(texts.subList(2, texts.size()));
            return (texts.get(1) + ", " + texts.get(0) + " " + postNominal).trim();
        }
    }

    private String getPostNominal(List<String> texts) {
        String postNominal = "";
            for (int i = 0; i < texts.size(); i++) {
                postNominal += texts.get(i) + " ";
            }

        return postNominal;
    }
    private void removeHonorifics(ArrayList<String> texts) {
        if(texts.get(0).matches("Mrs.|Mr.|Miss,") && texts.size() > 2) {
            texts.remove(0);
        }
    }
}
