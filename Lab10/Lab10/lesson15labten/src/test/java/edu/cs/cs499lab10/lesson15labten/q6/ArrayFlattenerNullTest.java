package edu.cs.cs499lab10.lesson15labten.q6;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import edu.cs.cs499lab10.lesson15labten.ArrayFlattener;
import edu.cs.cs499lab10.lesson15labten.service.ArrayFlattenerService;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

public class ArrayFlattenerNullTest {
    private ArrayFlattener arrayFlattener = null;
    private ArrayFlattenerService arrayFlattenerService = mock(ArrayFlattenerService.class);

    @Before
    public void setUp() throws Exception {
        this.arrayFlattener = new ArrayFlattener(arrayFlattenerService);
    }

    @After
    public void tearDown() throws Exception {
        this.arrayFlattener = null;
    }

    @Test
    public void FlattenArrayNull() {
        int[][] nestedArray = null;
        int[] expected = null;
        int[] actual = this.arrayFlattener.arrayFlattener(nestedArray);
        assertArrayEquals(expected, actual);
    }
}