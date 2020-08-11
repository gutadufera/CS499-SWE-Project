package edu.cs.cs499lab10.lesson15labten.q7;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import edu.cs.cs499lab10.lesson15labten.ArrayReversor;
import edu.cs.cs499lab10.lesson15labten.service.ArrayFlattenerService;

import static org.junit.Assert.assertArrayEquals;
import static org.mockito.Mockito.*;

public class ArrayReversorForNullTest {
    private ArrayReversor arrayReversor;
    private ArrayFlattenerService arrayFlattenerService = mock(ArrayFlattenerService.class);

    @Before
    public void setUp() throws Exception {
        this.arrayReversor = new ArrayReversor(arrayFlattenerService);
    }

    @After
    public void tearDown() throws Exception {
        this.arrayReversor = null;
    }

    @Test
    public void reversorArray() {
        int[][] nestArray = null;
        when(arrayFlattenerService.flatternArray(nestArray)).thenReturn(null);
        int[] output = arrayReversor.reversedArray(nestArray);
        int[] expected = null;
        assertArrayEquals(expected, output);
        verify(arrayFlattenerService).flatternArray(nestArray);
    }
}

