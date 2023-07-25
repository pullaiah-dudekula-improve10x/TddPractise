package templerun;

public class FireBall {
    public FireBall(int speed) {
        if(speed < 0 || speed > 100) {
            throw new InvalidFireBallSpeedException();
        }

    }
    public class InvalidFireBallSpeedException extends RuntimeException {
    }
}
