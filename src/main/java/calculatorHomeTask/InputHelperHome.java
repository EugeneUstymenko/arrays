package calculatorHomeTask;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InputHelperHome {

    public List<Integer> getListValue(String expression){
        List<Integer> result = new ArrayList<>();
        Pattern pattern = Pattern.compile("(\\d+)");
        Matcher matcher = pattern.matcher(expression);
        while (matcher.find()){
           result.add(Integer.parseInt(matcher.group()));
        }
        return result;
    }
}
