import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class newSortingTester {

    @Test
    /* I am choosing to test an already sorted array to make sure that my program
     * does not make any changes to the array. I will make my size equal to 2.
     * My Test Passed
     */
    public void newSortingTest1(){
        newSorting ns = new newSorting();
        int[] array = new int[8];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        array[3] = 4;
        array[4] = 5;
        array[5] = 6;
        array[6] = 7;
        array[7] = 8;
        int[] array2 = new int[8];
        array2[0] = 1;
        array2[1] = 2;
        array2[2] = 3;
        array2[3] = 4;
        array2[4] = 5;
        array2[5] = 6;
        array2[6] = 7;
        array2[7] = 8;
        ns.newSorting(array, 2);
        assertArrayEquals(array2, array);
    }

    @Test
    /* I am choosing to test an array in backwards order to make sure
     * my program properly sorts the array. I will make my size equal to 2.
     * My Test Passed
     */
    public void newSortingTest2(){
        newSorting ns = new newSorting();
        int[] array = new int[8];
        array[0] = 8;
        array[1] = 7;
        array[2] = 6;
        array[3] = 5;
        array[4] = 4;
        array[5] = 3;
        array[6] = 2;
        array[7] = 1;
        int[] array2 = new int[8];
        array2[0] = 1;
        array2[1] = 2;
        array2[2] = 3;
        array2[3] = 4;
        array2[4] = 5;
        array2[5] = 6;
        array2[6] = 7;
        array2[7] = 8;
        ns.newSorting(array, 2);
        assertArrayEquals(array2, array);
    }

    @Test
    /* I am choosing to test an array with duplicates to make sure my program can
     * properly handle duplicates and properly sorts the array. I will make my size equal to 2.
     * My Test Passed
     */
    public void newSortingTest3(){
        newSorting ns = new newSorting();
        int[] array = new int[8];
        array[0] = 3;
        array[1] = 4;
        array[2] = 6;
        array[3] = 5;
        array[4] = 4;
        array[5] = 3;
        array[6] = 2;
        array[7] = 1;
        int[] array2 = new int[8];
        array2[0] = 1;
        array2[1] = 2;
        array2[2] = 3;
        array2[3] = 3;
        array2[4] = 4;
        array2[5] = 4;
        array2[6] = 5;
        array2[7] = 6;
        ns.newSorting(array, 2);
        assertArrayEquals(array2, array);


    }

    @Test
    /* I am choosing to test an array with odd length and use and odd numbered size. I want to do this to
     * see if I correctly programed parts of the code like the partition. These things are easy to code with even
     * numbered arrays but they are a little trickier with odd numbers.
     * My Test Passed
     */
    public void newSortingTest4(){
        newSorting ns = new newSorting();
        int[] array = new int[7];
        array[0] = 4;
        array[1] = 8;
        array[2] = 7;
        array[3] = 2;
        array[4] = 5;
        array[5] = 11;
        array[6] = 1;
        int[] array2 = new int[7];
        array2[0] = 1;
        array2[1] = 2;
        array2[2] = 4;
        array2[3] = 5;
        array2[4] = 7;
        array2[5] = 8;
        array2[6] = 11;
        ns.newSorting(array, 3);
        assertArrayEquals(array2, array);
    }

    @Test
    /* I am choosing to test an array with negative numbers in it. I want to make sure that my program can handle all integers,
     * not just positive ones. I will use an even numbered array with an even size.
     * My Test Passed
     */
    public void newSortingTest5(){
        newSorting ns = new newSorting();
        int[] array = new int[8];
        array[0] = -1;
        array[1] = 4;
        array[2] = 0;
        array[3] = 5;
        array[4] = 4;
        array[5] = -2;
        array[6] = 2;
        array[7] = 1;
        int[] array2 = new int[8];
        array2[0] = -2;
        array2[1] = -1;
        array2[2] = 0;
        array2[3] = 1;
        array2[4] = 2;
        array2[5] = 4;
        array2[6] = 4;
        array2[7] = 5;
        ns.newSorting(array, 2);
        assertArrayEquals(array2, array);
    }
}
