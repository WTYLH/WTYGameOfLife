package LG.gameOfLife.model;

import org.junit.Assert;
import org.junit.Test;
import LG.gameOfLife.util.Utils;


public class UtilsTest {

    @Test
    public void initMatrixFromFile() throws Exception {
        String path = "D:\\IDEA-JAVA\\TXGameOfLife\\test.case";
        CellMatrix cellMatrix = Utils.initMatrixFromFile(path);
        int[][] expected = new int[][]{{1, 0, 1}, {0, 1, 0}, {1, 1, 1}};
        Assert.assertEquals(3, cellMatrix.getHeight());
        Assert.assertEquals(3, cellMatrix.getWidth());
        Assert.assertEquals(60, cellMatrix.getTransfromNum());
        Assert.assertEquals(200, cellMatrix.getDuration());


        Assert.assertArrayEquals(expected, cellMatrix.getMatrix());

        Assert.assertEquals(null,Utils.initMatrixFromFile(""));
    }


}