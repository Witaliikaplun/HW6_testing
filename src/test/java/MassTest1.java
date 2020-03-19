import HW6.ArrayMy;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class MassTest1 {
    int[] arrIn;
    int[] arrOut;
    ArrayMy arrObj;

    public MassTest1(int[] arrIn, int[] arrOut) {
        this.arrIn = arrIn;
        this.arrOut = arrOut;
    }

        @Parameterized.Parameters
    public  static Collection<Object[]> data(){
        return Arrays.asList(new Object[][]{
                {new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11}, new int[]{5, 6, 7, 8, 9, 10, 11}},
                {new int[]{1, 2, 4, 4, 2, 3, 4, 1, 7}, new int[]{1, 7}},
                {new int[]{1, 2, 4, 3, 2, 3, 5, 4, 7}, new int[]{7}},
                {new int[]{7, 5, 3, 2, 1, 4, 5, 4, 8, 7, 7}, new int[]{8, 7, 7}}

        });
    }

    @BeforeClass
    public static void printMsg(){
        System.out.println("Тестирование 1");
    }

    @Before
    public void startTest(){
        arrObj = new ArrayMy();
    }

    @Test
    public void testArr1() {
        Assert.assertArrayEquals(arrObj.arrayCreator(arrIn), arrOut);
    }



}
