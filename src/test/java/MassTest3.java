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
public class MassTest3 {
    int[] arrIn;
    boolean out;
    ArrayMy arrObj;

    public MassTest3(int[] arrIn, boolean out) {
        this.arrIn = arrIn;
        this.out = out;
    }

    @Parameterized.Parameters
    public  static Collection<Object[]> data(){
        return Arrays.asList(new Object[][]{
                {new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11}, false},
                {new int[]{1, 4, 4, 4, 1, 1, 4, 4, 4, 4, 1}, true},
                {new int[]{1, 2, 4, 3, 2, 3, 5, 4, 7}, false},
                {new int[]{4, 4, 4, 4, 1, 1, 1, 1, 4, 1, 1}, true}

        });
    }

    @BeforeClass
    public static void printMsg(){
        System.out.println("Тестирование 3");
    }

    @Before
    public void startTest(){
        arrObj = new ArrayMy();
    }

    @Test
    public void testArr3() {
        Assert.assertEquals(arrObj.arrayBool(arrIn), out);
    }



}