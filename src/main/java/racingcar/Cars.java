package racingcar;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Cars {
    private final List<Car> cars;

    public Cars(List<Car> cars) {
        this.cars = cars;
    }

    public List<Car> findWinners() {
        return findWinners(this.cars, getMaxPosition());
    }

    public static List<Car> findWinners(List<Car> cars, Position maxPosition) {
        List<Car> winners = new ArrayList<>();
        cars.stream()
                .filter(car -> car.isWinner(maxPosition))
                .forEach(winners::add);
        return winners;
    }

    private Position getMaxPosition() {
        return cars.stream()
                .map(Car::getPosition)
                .max(Comparator.naturalOrder())
                .orElse(new Position(0));
    }
}
