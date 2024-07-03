package racingcar;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class CarTest {
    @Test
    void 자동차_이름_5_이하_검증() {
        assertThatThrownBy(() -> new Car("racingcar")).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void move() {
        Car car = new Car("chooh");
        car.move(() -> true);
        assertThat(car.getPosition()).isEqualTo(new Position(1));
    }

    @Test
    void stop() {
        Car car = new Car("chooh");
        car.move(() -> false);
        assertThat(car.getPosition()).isEqualTo(new Position(0));
    }
}
