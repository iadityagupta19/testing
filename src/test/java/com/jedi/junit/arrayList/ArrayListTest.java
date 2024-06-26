package com.jedi.junit.arrayList;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class ArrayListTest {
    private ArrayList<Integer> list;

    @Before
    public void setUp() {
        list = new ArrayList<>();
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetWithInvalidIndex() {
        list.get(0); // Should throw IndexOutOfBoundsException
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testRemoveWithInvalidIndex() {
        list.remove(0); // Should throw IndexOutOfBoundsException
    }

    @Test
    public void testAddAndGet() {
        list.add(1);
        assertEquals(1, (int) list.get(0));
    }

    @Test
    public void testRemove() {
        list.add(1);
        list.add(2);
        list.remove(0);
        assertEquals(1, list.size());
        assertEquals(2, (int) list.get(0));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testRemoveAllElements() {
        list.add(1);
        list.remove(0);
        list.get(0); // Should throw IndexOutOfBoundsException
    }

    @Test
    public void testEnsureCapacity() {
        for (int i = 0; i < 15; i++) {
            list.add(i);
        }
        assertEquals(15, list.size());
        for (int i = 0; i < 15; i++) {
            assertEquals(i, (int) list.get(i));
        }
    }
}

