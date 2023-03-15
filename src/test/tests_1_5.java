package test;

import org.junit.Test;
import tasks.tasks1_5;

import static org.junit.Assert.*;
public class tests_1_5 {
    @Test
    public void testSingleNumber() {
        int[] nums1 = {1, 2, 3, 4, 5, 6, 5, 4, 3, 2, 1};
        int expected1 = 6;
        int actual1 = tasks1_5.singleNumber(nums1);
        assertEquals(expected1, actual1);

        int[] nums2 = {1, 1, 2, 2, 3, 3, 4, 4, 5};
        int expected2 = 5;
        int actual2 = tasks1_5.singleNumber(nums2);
        assertEquals(expected2, actual2);

        int[] nums3 = {1};
        int expected3 = 1;
        int actual3 = tasks1_5.singleNumber(nums3);
        assertEquals(expected3, actual3);
    }

    @Test
    public void testMinSplit() {
        int amount1 = 63;
        int expected1 = 5;
        int actual1 = tasks1_5.minSplit(amount1);
        assertEquals(expected1, actual1);

        int amount2 = 27;
        int expected2 = 4;
        int actual2 = tasks1_5.minSplit(amount2);
        assertEquals(expected2, actual2);

        int amount3 = 50;
        int expected3 = 1;
        int actual3 = tasks1_5.minSplit(amount3);
        assertEquals(expected3, actual3);
    }

    @Test
    public void testNotContains() {
        int[] array1 = {1, 2, 3, 4, 6};
        int expected1 = 5;
        int actual1 = tasks1_5.notContains(array1);
        assertEquals(expected1, actual1);

        int[] array2 = {1, 2, 0};
        int expected2 = 3;
        int actual2 = tasks1_5.notContains(array2);
        assertEquals(expected2, actual2);

        int[] array3 = {2, 4, 6, 8, 10};
        int expected3 = 1;
        int actual3 = tasks1_5.notContains(array3);
        assertEquals(expected3, actual3);
    }

    @Test
    public void testBinnarySum() {
        String a1 = "101010";
        String b1 = "111100";
        String expected1 = "1100110";
        String actual1 = tasks1_5.binnarySum(a1, b1);
        assertEquals(expected1, actual1);

        String a2 = "1010111";
        String b2 = "1111111";
        String expected2 = "11010110";
        String actual2 = tasks1_5.binnarySum(a2, b2);
        assertEquals(expected2, actual2);

        String a3 = "10001";
        String b3 = "11011";
        String expected3 = "101100";
        String actual3 = tasks1_5.binnarySum(a3, b3);
        assertEquals(expected3, actual3);
    }

    @Test
    public void testCountVariants() {
        int stairsCount1 = 3;
        int expected1 = 3;
        int actual1 = tasks1_5.countVariants(stairsCount1);
        assertEquals(expected1, actual1);

        int stairsCount2 = 4;
        int expected2 = 5;
        int actual2 = tasks1_5.countVariants(stairsCount2);
        assertEquals(expected2, actual2);
    }
}
