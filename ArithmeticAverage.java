package Average;

import java.util.ArrayList;

public class ArithmeticAverage extends Average {
    public double compute() {
        double sum = 0;
        for (Double d : getArrayList()) {
            sum += d.doubleValue();
        }
        if (getArrayList().isEmpty()) {
            return 0;
        }else return sum / getArrayList().size();
    }
}
