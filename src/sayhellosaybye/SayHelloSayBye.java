package sayhellosaybye;

public class SayHelloSayBye {

    public String sayHelloSayBye(String name, int num) {
        if (name == null || name.equals("") || num < 0) {
            return "";
        } else {
            if (num == 1) {
                return  "Hello " + name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
            } else {
                return  "Bye " + name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
            }
        }
    }
}
