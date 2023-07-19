public class FindLongestNameInArray {

    public String findLongestNameInArray(String [] names) {
        if (names.length == 0 || names == null ) {
            return "";
        } else {
            String longestName = names[0];
            for (int i = 1; i < names.length; i++) {
                if (names[i].length() > longestName.length()) {
                    longestName = names[i];
               }
            }
            return longestName;
        }
    }
}
