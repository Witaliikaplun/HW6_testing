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
public class MassTest2 {
    int[] arrIn;
    int[] arrOut;
    ArrayMy arrObj;

    public MassTest2(int[] arrIn, int[] arrOut) {
        this.arrIn = arrIn;
        this.arrOut = arrOut;
    }

    @Parameterized.Parameters
    public  static Collection<Object[]> data(){
        return Arrays.asList(new Object[][]{
                {new int[]{1, 2, 3, 0, 5, 6, 7, 8, 9, 10, 11}, new int[]{5, 6, 7, 8, 9, 10, 11}},
                {new int[]{1, 2, 8, 8, 2, 3, 1, 1, 7}, new int[]{1, 7}},
                {new int[]{1, 2, 3, 3, 2, 3, 5, 2, 7}, new int[]{7}},
                {new int[]{7, 5, 3, 2, 1, 7, 5, 3, 8, 7, 7}, new int[]{8, 7, 7}}

        });
    }

    @BeforeClass
    public static void printMsg(){
        System.out.println("Тестирование 2 на выброс исключений");
    }

    @Before
    public void startTest(){
        arrObj = new ArrayMy();
    }

    @Test (expected = RuntimeException.class)
    public void testArr2() {
        Assert.assertArrayEquals(arrObj.arrayCreator(arrIn), arrOut);
    }



}
