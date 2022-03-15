package codesignal.arcade.intro.edgeoftheocen.almostincreasingsequence;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AlmostIncreasingSequenceOfSequenceSameNumberTest {

  @Test
  public void almostIncreasingSequenceOfSequenceSameNumber(){
    int[] sequence = {1,1};
    Boolean isSequence = AlmostIncreasingSequence.solution(sequence);
    Assertions.assertTrue(isSequence);
  }

  @Test
  public void testSequence(){
    int[] sequence = {1,3,2,1};
    Boolean isSequence = AlmostIncreasingSequence.solution(sequence);
    Assertions.assertFalse(isSequence);
  }

  @Test
  @DisplayName("should delete just one elemente of array to be true")
  public void shoul_delete_oneElementeOfArray(){
    int[] sequence = {1,3,2};
    Boolean isSequence = AlmostIncreasingSequence.solution(sequence);
    Assertions.assertTrue(isSequence);
  }

  @Test
  @DisplayName("should delete the first element of the array")
  public void should_delete_firstElement() {
    int[] sequence = new int[]{10, 1, 2, 3, 4, 5};
    Boolean isSequence = AlmostIncreasingSequence.solution(sequence);
    Assertions.assertTrue(isSequence);
  }

  @Test
  @DisplayName("Should delete one element os the array")
  public void should_delteOneElementOfTheArray() {
    int[] sequence = new int[]{1, 2, 5, 3, 5};
    Boolean isSequence = AlmostIncreasingSequence.solution(sequence);
    Assertions.assertTrue(isSequence);

    sequence = new int[]{1, 2, 3, 4, 99, 5, 6};
    Assertions.assertTrue(AlmostIncreasingSequence.solution(sequence));

    sequence = new int[]{1, 2, 3, 4, 3, 6};
    Assertions.assertTrue(AlmostIncreasingSequence.solution(sequence));

    sequence = new int[]{3, 6, 5, 8, 10, 20, 15};
    Assertions.assertFalse(AlmostIncreasingSequence.solution(sequence));

    sequence = new int[]{3, 5, 67, 98, 3};
    Assertions.assertTrue(AlmostIncreasingSequence.solution(sequence));

    sequence = new int[]{1, 2, 1, 2};
    Assertions.assertFalse(AlmostIncreasingSequence.solution(sequence));


  }

}
