import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    int[] input2 = {1, 2, 3};
    ArrayExamples.reverseInPlace(input1);
    ArrayExamples.reverseInPlace(input2);
    assertArrayEquals(new int[]{ 3 }, input1);
    assertArrayEquals(new int[]{3, 2, 1}, input2);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    int[] input2 = { 4, 5, 6};
    int[] input3 = {10, 20, 30, 50};
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
    assertArrayEquals(new int[]{50, 30, 20, 10}, ArrayExamples.reversed(input3));
  }
}
