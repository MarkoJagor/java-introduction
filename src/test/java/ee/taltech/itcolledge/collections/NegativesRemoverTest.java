package ee.taltech.itcolledge.collections;

import com.google.common.collect.Lists;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class NegativesRemoverTest {

    //todo 1 fix tests
    // ask lecturer about Arrays.asList vs Lists.newArrayList

    @Test
    public void removeNegativeIntegers() {
        assertEquals(null, NegativesRemover.removeNegativeIntegers(null));
        assertEquals(Arrays.asList(1), NegativesRemover.removeNegativeIntegers(Lists.newArrayList(-1, 1)));

    }

    @Test
    public void removeNegativeIntegers_while_preserving_original_list() {
        assertEquals(null, NegativesRemover.removeNegativeIntegers(null));
        List<Integer> numbers = Lists.newArrayList(-1, 1);
        assertEquals(Arrays.asList(1), NegativesRemover.removeNegativeIntegers(numbers));
        assertEquals(numbers, NegativesRemover.removeNegativeIntegers(numbers));
    }

    @Test
    public void removeNegativeLongs() {
        assertEquals(null, NegativesRemover.removeNegativeLongs(null));
        assertEquals(Arrays.asList(1L), NegativesRemover.removeNegativeLongs(Arrays.asList(-1L, 1L)));
    }

    @Test
    public void removeNegativeDoubles() {
        assertEquals(null, NegativesRemover.removeNegativeDoubles(null));
        assertEquals(Arrays.asList(1.0), NegativesRemover.removeNegativeDoubles(Arrays.asList(-1.0, 1.0)));
    }
}