package calculator;

import calculatorHomeTask.CalculatorHome;
import calculatorHomeTask.InputHelperHome;
import org.junit.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CalculatorHomeTest {
    static CalculatorHome calculator;
    static InputHelperHome inputHelperHome;

    @BeforeClass
    public static void setUp(){
        calculator = new CalculatorHome();
        inputHelperHome = new InputHelperHome();
        List<Integer> listValue = new ArrayList<>();
        System.out.println("Test begin");
    }

    @Test
    public void testCalculate(){
        System.out.println("Test plus");
        Assert.assertEquals(25, calculator.calculate("2ascasc2sacasc21"));
        Assert.assertEquals(60, calculator.calculate("20+-*40"));
        Assert.assertEquals(2020, calculator.calculate("2000 + 20@da"));
        Assert.assertEquals(31, calculator.calculate("sdds20    + 5!2#2#2"));
    }

    @Test
    public void testGetListValue(){
        System.out.println("Test get list int value");
        Assert.assertEquals(new ArrayList<>(Arrays.asList(22, 0)), inputHelperHome.getListValue("asd22d0"));
        Assert.assertEquals(new ArrayList<>(Arrays.asList(22, 11)), inputHelperHome.getListValue("sd22d    11"));
        Assert.assertEquals(new ArrayList<>(Arrays.asList(2, 1)), inputHelperHome.getListValue("a@d2@1"));
        Assert.assertEquals(new ArrayList<>(Arrays.asList(11, 2, 101)), inputHelperHome.getListValue("as11  2d101"));
    }


    @AfterClass
    public static void tearDown(){
        System.out.println("Test done");
    }
}
