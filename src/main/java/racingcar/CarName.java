package racingcar;

public class CarName {
    public static final int MAX_LENGTH = 5;

    private final String name;

    public CarName(String name) {
        if (name.isEmpty() || name.length() > MAX_LENGTH) {
            throw new IllegalArgumentException("자동차의 이름의 길이는 1이상 5이하여야 합니다.");
        }
        this.name = name.trim();
    }

}
