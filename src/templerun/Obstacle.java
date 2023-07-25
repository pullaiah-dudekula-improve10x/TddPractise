package templerun;

public class Obstacle {
    private String name;
    private int damage;
    public Obstacle(String name, int damage) {
        this.name = name == null ? "" : name.trim();
    }

    public String getName() {
        return name;
    }

    public class InvalidObstacleDamageException extends Exception {
    }
}
