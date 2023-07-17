package namegreeting;

public class NameGreeting {

    public String nameGreeting(String name) {
        if (name.equals("")) {
            return "";
        }
        String result = "";
        result = "Hello " + name + "!";
        return result;
    }
}
