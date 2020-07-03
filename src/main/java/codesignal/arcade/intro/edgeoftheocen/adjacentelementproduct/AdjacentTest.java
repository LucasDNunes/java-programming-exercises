package codesignal.arcade.intro.edgeoftheocen.adjacentelementproduct;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AdjacentTest {

    @Test
    public void adjacentElementsProduct() {
        int[] array = {3, 6, -2, -5, 7, 3};
        assertThat(Adjacent.adjacentElementsProduct(array)).isEqualTo(21);

        array = new int[]{-1, -2};
        assertThat(Adjacent.adjacentElementsProduct(array)).isEqualTo(2);

        array = new int[]{5, 1, 2, 3, 1, 4};
        assertThat(Adjacent.adjacentElementsProduct(array)).isEqualTo(6);

        array = new int[]{1, 2, 3, 0};
        assertThat(Adjacent.adjacentElementsProduct(array)).isEqualTo(6);

        array = new int[]{9, 5, 10, 2, 24, -1, -48};
        assertThat(Adjacent.adjacentElementsProduct(array)).isEqualTo(50);
    }
}
