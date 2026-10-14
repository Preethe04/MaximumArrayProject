import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MaximumArrayTest {
    @Test void typicalArray() { assertEquals(50, MaximumArray.findMaximum(new int[]{10, 50, 20, 40, 30})); }
    @Test void negativeNumbers() { assertEquals(-1, MaximumArray.findMaximum(new int[]{-5, -1, -9})); }
    @Test void singleElement() { assertEquals(7, MaximumArray.findMaximum(new int[]{7})); }
    @Test void duplicateMaximum() { assertEquals(9, MaximumArray.findMaximum(new int[]{9, 3, 9})); }
    @Test void emptyArray() { assertThrows(IllegalArgumentException.class, () -> MaximumArray.findMaximum(new int[]{})); }
    @Test void nullArray() { assertThrows(IllegalArgumentException.class, () -> MaximumArray.findMaximum(null)); }
}
