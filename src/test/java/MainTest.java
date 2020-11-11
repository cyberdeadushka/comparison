import org.junit.Test;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Tests comparing the execution time of the three methods: add, get, remove.
 */
public class MainTest {

    /**
     * Comparison of the execution time for add method.
     */
    @Test
    public void testAdd() {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        LinkedList<Integer> list = new LinkedList<Integer>();

        // add
        long startAdd = System.nanoTime();
        for (int i = 0; i < 2000; i++)
            arrayList.add(333);
        long endAdd = System.nanoTime();
        long listAdd = endAdd - startAdd;

        startAdd = System.nanoTime();
        for (int i = 0; i < 2000; i++)
            list.add(333);
        endAdd = System.nanoTime();
        long arrAdd = endAdd - startAdd;

        assertTrue(arrAdd > listAdd);
    }
    /**
     * Comparison of the execution time for get method.
     */
    @Test
    public void testGet() {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        LinkedList<Integer> list = new LinkedList<Integer>();

        for (int i = 0; i < 2000; i++) {
            arrayList.add(333);
            list.add(333);
        }

        long startGet = System.nanoTime();
        for (int i = 0; i < 2000; i++)
            arrayList.get(i);
        long endGet = System.nanoTime();
        long arrGet = endGet - startGet;

        startGet = System.nanoTime();
        for (int i = 0; i < 2000; i++)
            list.get(i);
        endGet = System.nanoTime();
        long listGet = endGet - startGet;

        assertTrue(listGet > arrGet);
    }

    /**
     * Comparison of the execution time for remove method.
     */
    @Test
    public void testDel() {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        LinkedList<Integer> list = new LinkedList<Integer>();

        for (int i = 0; i < 2000; i++) {
            arrayList.add(333);
            list.add(333);
        }

        long startDel = System.nanoTime();
        for (int i = 1999; i >= 0; i--)
            arrayList.remove(i);
        long endDel = System.nanoTime();
        long arrDel = endDel - startDel;

        startDel = System.nanoTime();
        for (int i = 1999; i >= 0; i--)
            list.remove(i);
        endDel = System.nanoTime();
        long listDel = endDel - startDel;
        assertTrue(listDel > arrDel);
    }
}