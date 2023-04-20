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

  @Test
  public void testAverageWithoutLowest() {
    double[] input1 = { };
    double[] input2 = {4.0};
    double[] input3 = {35.4, 64.2, 66.4, 44.5};
    double[] input4 = {35.4, 64.2, 66.4, 44.5, 35.4, 35.4};
    assertEquals(0, ArrayExamples.averageWithoutLowest(input1), 0);
    assertEquals(0, ArrayExamples.averageWithoutLowest(input2), 0);
    assertEquals(58.367, ArrayExamples.averageWithoutLowest(input3), 0.1);
    assertEquals(49.18, ArrayExamples.averageWithoutLowest(input4), 0.1);
  }
}
