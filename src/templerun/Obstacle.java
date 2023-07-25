package templerun;

public class Obstacle {
    private String name;
    private int damage;
    public Obstacle(String name, int damage) throws InvalidObstacleDamageException {
        this.name = name == null ? "" : name.trim();
        if(damage < 0) {
            throw new InvalidObstacleDamageException();
        }
    }

    public String getName() {
        return name;
    }

    public class InvalidObstacleDamageException extends Exception {
    }
}
