package chart1_array.impl;

import chart1_array.DLinkNode;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author ChenMJ
 * @version CirDoublyLinkedListTest.class, v 0.1 2020/4/23 10:02  Exp$
 */
public class CirDoublyLinkedListTest {
    private CirDoublyLinkedList<Integer> cirDoublyLinkedList = null;

    @Before
    public void crated(){
        cirDoublyLinkedList = new CirDoublyLinkedList<Integer>(new DLinkNode<Integer>());
    }

    @Test
    public void isEmpty() {
        boolean temp = cirDoublyLinkedList.isEmpty();
        Assert.assertTrue(temp);
    }

    @Test
    public void size() {
        int size = cirDoublyLinkedList.size();
        assertEquals("集合的长度为2", 2, size);
    }

    @Test
    public void get() {
        assertEquals("集合的第一个元素为1", 1, (int) cirDoublyLinkedList.get(0));
    }

    @Test
    public void set() {
        cirDoublyLinkedList.set(2,5);
        assertEquals("修改集合的第二个元素后为5", 5, (int) cirDoublyLinkedList.get(1));
    }

    @Test
    public void insert() {
        cirDoublyLinkedList.insert(5,9);
        assertEquals("刚刚插入的元素为9", 9, (int) cirDoublyLinkedList.get(2));
    }

    @Test
    public void add() {
        cirDoublyLinkedList.add(1);
        cirDoublyLinkedList.add(2);
    }

    @Test
    public void remove() {
    }

    @Test
    public void removeAll() {
    }

    @Test
    public void search() {
    }
}