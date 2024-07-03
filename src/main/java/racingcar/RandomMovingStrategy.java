package racingcar;

import java.util.Random;

public class RandomMovingStrategy implements MovingStrategy{

    public static final int MAX_BOUND = 10;
    public static final int FORWARD_NUM = 4;

    @Override
    public boolean movable() {
        return getRandomNo() >= FORWARD_NUM;
    }

    private int getRandomNo(){
        Random random = new Random();
        return random.nextInt(MAX_BOUND);
    }
}
