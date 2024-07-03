package racingcar;

public class Car {
    public static final int FORWARD_NUM = 4;

    private final CarName carName;
    private Position position;

    public Car(String name) {
        this(name, 0);
    }

    public Car(String name, int position) {
        this.carName = new CarName(name);
        this.position = new Position(position);
    }

    public boolean isWinner(Position maxPosition) {
        return position.equals(maxPosition);
    }

    public Position getPosition() {
        return position;
    }

    public void move(MovingStrategy movingStrategy) {
        if (movingStrategy.movable()) {
            position = position.move();
        }
    }

    public void move(int randomNo) {
        if (randomNo >= FORWARD_NUM) {
            position = position.move();
        }
    }
}
