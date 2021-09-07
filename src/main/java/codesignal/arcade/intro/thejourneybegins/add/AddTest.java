package codesignal.arcade.intro.thejourneybegins.add;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AddTest {

    @Test
    public void should_addTwoNumbers() {
        assertThat(Add.calculate(1, 1)).isEqualTo(2);
        assertThat(Add.calculate(1, 2)).isEqualTo(3);
        assertThat(Add.calculate(1, 4)).isEqualTo(5);
        assertThat(Add.calculate(5, 5)).isEqualTo(10);
    }
}
