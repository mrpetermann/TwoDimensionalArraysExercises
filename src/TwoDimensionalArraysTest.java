import org.junit.Assert;
import org.junit.Test;

public class TwoDimensionalArraysTest {
    @Test
    public void increaseVarianceTest() {
        Assert.assertArrayEquals(
                TwoDimensionalArrays.increaseVariance(
                        new int[][]{
                                {1, -2, 0},
                                {-4, 0, 5}
                        }),
                        new int[][]{
                                {2, -3, 0},
                                {-5, 0, 6}
                        }
        );
    }

    @Test
    public void prioritizeRowTest() {
        Assert.assertArrayEquals(
                TwoDimensionalArrays.prioritizeRow(
                        new int[][]{
                                {1, -2, 0},
                                {-4, 0, 5}
                        }),
                        new int[][]{
                                {-4, 0, 5},
                                {1, -2, 0}
                        }
        );
    }

    @Test
    public void transposeTest() {
        Assert.assertArrayEquals(TwoDimensionalArrays.transpose(
                new int[][]{
                        {1, -4, 2},
                        {0, 3, -1}
                }),
                new int[][]{
                        {1, 0},
                        {-4, 3},
                        {2, -1}
                }
        );
    }

    @Test
    public void prioritizeColumnTest() {
        Assert.assertArrayEquals(TwoDimensionalArrays.prioritizeColumn(
                new int[][]{
                        {1, 0, -3},
                        {-4, 1, 5}
                }),
                new int[][] {
                        {-3, 0, 1},
                        {5, 1, -4}
                }
        );
    }
}
