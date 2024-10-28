import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class PermutationCombinationUtilsTest {

    @Test
    public void testPermutationValidInput() {
        assertEquals(60, PermutationCombinationUtils.permutation(5, 3));
    }

    @Test
    public void testCombinationValidInput() {
        assertEquals(10, PermutationCombinationUtils.combination(5, 3));
    }

    @Test
    public void testPermutationWhenRGreaterThanN() {
        assertEquals(0, PermutationCombinationUtils.permutation(3, 4));
    }

    @Test
    public void testCombinationWhenRGreaterThanN() {
        assertEquals(0, PermutationCombinationUtils.combination(3, 4));
    }

    @Test
    public void testPermutationForZeroValues() {
        assertEquals(1, PermutationCombinationUtils.permutation(0, 0));
    }

    @Test
    public void testCombinationForZeroValues() {
        assertEquals(1, PermutationCombinationUtils.combination(0, 0));
    }
}
