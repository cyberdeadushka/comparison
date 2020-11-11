import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Comparing ArrayList and LinkedList by the execution time of three methods: add, get, remove.
 */
public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        LinkedList<Integer> list = new LinkedList<Integer>();
        long startAdd = System.nanoTime();
        for (int i = 0; i < 2000; i++)
            arrayList.add(333);
        long endAdd = System.nanoTime();
        System.out.println("ArrayList: add - " + (endAdd - startAdd));

        startAdd = System.nanoTime();
        for (int i = 0; i < 2000; i++)
            list.add(333);
        endAdd = System.nanoTime();
        System.out.println("LinkedList: add - " + (endAdd - startAdd));


        long startGet = System.nanoTime();
        for (int i = 0; i < 2000; i++)
            arrayList.get(i);
        long endGet = System.nanoTime();
        System.out.println("ArrayList: get - " + (endGet - startGet));

        startGet = System.nanoTime();
        for (int i = 0; i < 2000; i++)
            list.get(i);
        endGet = System.nanoTime();
        System.out.println("LinkedList: get - " + (endGet - startGet));

        long startDel = System.nanoTime();
        arrayList.subList(0, 2000).clear();
        long endDel = System.nanoTime();
        System.out.println("ArrayList: clear - " + (endDel - startDel));

        startDel = System.nanoTime();
        list.subList(0, 2000).clear();
        endDel = System.nanoTime();
        System.out.println("LinkedList: clear - " + (endDel - startDel));
    }
}