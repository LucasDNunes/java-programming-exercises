package codesignal.arcade.intro.thejourneybegins.add;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class AddTest {

    @Test
    public void should_addTwoNumbers() {
        assertEquals(Add.calculate(1, 1),2);
        assertEquals(Add.calculate(1, 2),3);
        assertEquals(Add.calculate(1, 4),5);
    }
}
