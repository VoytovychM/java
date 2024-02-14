package org.homework.five;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AlgorithmManagerTest {

    @Test
    public void testZeroValues() {
        AlgorithmManager test = new AlgorithmManager();
        int[] result = test.getResultArray(0, 0, 0);
        Assertions.assertEquals(result, null, "result should be null");
    }

    @Test
    public void testWrongData() {
        AlgorithmManager test = new AlgorithmManager();
        int[] result = test.getResultArray(1, -1, 0);
        Assertions.assertEquals(result, null, "result should be null");
    }
    @Test
    public void testWrongTaskNumber() {
        AlgorithmManager test = new AlgorithmManager();
        int[] result = test.getResultArray(12, 1, 7);
        Assertions.assertEquals(result, null, "result should be null");

    }

    @Test
    public void testSuccessOne() {
        AlgorithmManager test = new AlgorithmManager();
        int[] actual = test.getResultArray(1, 1, 7);
        int[] expexted = new int[]{0, 1, 1, 2, 3, 5, 8};
        Assertions.assertArrayEquals(expexted, actual);

    }

    @Test
    public void testSuccessTwo() {
        AlgorithmManager test = new AlgorithmManager();
        int[] actual = test.getResultArray(1, 2, 8);
        int[] expexted = new int[]{0, 1, 1, 2, 3, 5, 8, 13};
        Assertions.assertArrayEquals(expexted, actual);

    }

    @Test
    public void testSuccessThree() {
        AlgorithmManager test = new AlgorithmManager();
        int[] actual = test.getResultArray(1, 3, 9);
        int[] expexted = new int[]{0, 1, 1, 2, 3, 5, 8, 13, 21};
        Assertions.assertArrayEquals(expexted, actual);

    }

    @Test
    public void testSuccessFour() {
        AlgorithmManager test = new AlgorithmManager();
        int[] actual = test.getResultArray(2, 1, 9);
        int[] expected = new int[]{362880};
        Assertions.assertArrayEquals(expected, actual);


    }

    @Test
    public void testSuccessFive() {
        AlgorithmManager test = new AlgorithmManager();
        int[] actual = test.getResultArray(2, 2, 9);
        int[] expected = new int[]{362880};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testSuccessSix() {
        AlgorithmManager test = new AlgorithmManager();
        int[] actual = test.getResultArray(2, 3, 9);
        int[] expected = new int[]{362880};
        Assertions.assertArrayEquals(expected, actual);
    }
}