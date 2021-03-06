package ee.taltech.itcolledge.collections;

import com.google.common.collect.Lists;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class UniqueElementsTest {

    //todo 2 fix tests

    @Test
    public void nothing_happens_to_list_of_unique_elements() {
        List<Integer> initialList = Lists.newArrayList(1, 2, 3);
        List<Integer> duplicateFreeList = UniqueElements.removeDuplicates(initialList);
        assertEquals(initialList, duplicateFreeList);
    }

    @Test
    public void a_list_of_non_unique_elements_has_duplicates_removed() {
        List<Integer> initialList = Lists.newArrayList(1, 1, 1);
        List<Integer> duplicateFreeList = UniqueElements.removeDuplicates(initialList);
        assertEquals(Arrays.asList(1), duplicateFreeList);
    }
}