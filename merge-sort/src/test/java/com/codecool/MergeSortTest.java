package com.codecool;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

import java.util.Arrays;

/**
 * Unit test for simple App.
 */
public class MergeSortTest {
    int[] arrayToSort = new int[]{3,4,2,5,6,1,7,9,8,10};

    @Test
    public void testSort() {
        String expected = "[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]";
        MergeSort mergeSort = new MergeSort();
        mergeSort.mergeSort(arrayToSort);

        assertEquals(expected, Arrays.toString(arrayToSort));
    }
}
