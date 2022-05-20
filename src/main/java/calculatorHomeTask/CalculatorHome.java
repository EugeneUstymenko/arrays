package calculatorHomeTask;


//import calculator.InputHelperHome;

import java.util.List;

public class CalculatorHome {
    public int calculate (String expression){
        InputHelperHome inputHelperHome = new InputHelperHome();
        List<Integer> listValue = inputHelperHome.getListValue(expression);
        int sum = 0;
        for (Integer i: listValue) {
                sum = sum + i;
        }
        return sum;
    }
}


