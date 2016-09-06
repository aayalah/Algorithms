/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AppClasses;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author aayala-hurtado
 */
public class SortingTest {
    
    Sorting instance;
    
    //////short
    int[] test1 = {1,0};
    int[] resTest1 = {0,1};
    
    ///// in order
    int[] test2 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    int[] resTest2 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    
    //// out of order
    int[] test3 = {4, 8, 1, -100, 54, 61, 61, 3, 1, -2};
    int[] resTest3 = {-100, -2, 1, 1, 3, 4, 8, 54, 61, 61};
    
    ///one element
    int[] test4 = {0};
    int[] resTest4 = {0};
    
    //empty array
    int[] test5 = {};
    int[] resTest5 = {};
    
     ///// reverse order
    int[] test6 = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
    int[] resTest6 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    
    
    
    public SortingTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        instance = new Sorting();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of bubbleSort method, of class Sorting.
     */
    @Test
    public void testBubbleSort() {
        //test 1
        int[] result = instance.bubbleSort(test1);
        assertArrayEquals(resTest1, result);
        
          //test 2
        result = instance.bubbleSort(test2);
        assertArrayEquals(resTest2, result);
        
          //test 3
        result = instance.bubbleSort(test3);
        assertArrayEquals(resTest3, result);
        
          //test 4
        result = instance.bubbleSort(test4);
        assertArrayEquals(resTest4, result);
        
        
          //test 5
        result = instance.bubbleSort(test5);
        assertArrayEquals(resTest5, result);
        
        
          //test 6
        result = instance.bubbleSort(test6);
        assertArrayEquals(resTest6, result);
       
    }
    
    
    @Test
    public void testInsertionSort() {
            //test 1
        int[] result = instance.insertionSort(test1);
        assertArrayEquals(resTest1, result);
        
          //test 2
        result = instance.insertionSort(test2);
        assertArrayEquals(resTest2, result);
        
          //test 3
        result = instance.insertionSort(test3);
        assertArrayEquals(resTest3, result);
        
          //test 4
        result = instance.insertionSort(test4);
        assertArrayEquals(resTest4, result);
        
        
          //test 5
        result = instance.insertionSort(test5);
        assertArrayEquals(resTest5, result);
        
        
          //test 6
        result = instance.insertionSort(test6);
        assertArrayEquals(resTest6, result);
               
    }
    
    
    @Test
    public void testMergeSort() {
           //test 1
        int[] result = instance.mergeSort(test1);
        assertArrayEquals(resTest1, result);
        
          //test 2
        result = instance.mergeSort(test2);
        assertArrayEquals(resTest2, result);
        
          //test 3
        result = instance.mergeSort(test3);
        assertArrayEquals(resTest3, result);
        
          //test 4
        result = instance.mergeSort(test4);
        assertArrayEquals(resTest4, result);
        
        
          //test 5
        result = instance.mergeSort(test5);
        assertArrayEquals(resTest5, result);
        
        
          //test 6
        result = instance.mergeSort(test6);
        assertArrayEquals(resTest6, result);
        
               
    }
    
    
    
    
    @Test
    public void testQuickSort() {
          //test 1
        instance.QuickSort(test1);
        assertArrayEquals(resTest1, test1);
        
          //test 2
        instance.QuickSort(test2);
        assertArrayEquals(resTest2, test2);
        
          //test 3
        instance.QuickSort(test3);
        assertArrayEquals(resTest3, test3);
        
          //test 4
        instance.QuickSort(test4);
        assertArrayEquals(resTest4, test4);
        
        
          //test 5
        instance.QuickSort(test5);
        assertArrayEquals(resTest5, test5);
        
        
          //test 6
        instance.QuickSort(test6);
        assertArrayEquals(resTest6, test6);
        
               
    }
    
}
