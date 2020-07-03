package codesignal.arcade.intro.edgeoftheocen.shapearea;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ShapeAreaTest {

    @Test
    public void shapeArea() {
        assertThat(ShapeArea.shapeArea(1)).isEqualTo(1);
        assertThat(ShapeArea.shapeArea(2)).isEqualTo(5);
        assertThat(ShapeArea.shapeArea(3)).isEqualTo(13);
        assertThat(ShapeArea.shapeArea(4)).isEqualTo(25);
    }
}
