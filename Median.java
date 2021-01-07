package Average;

import java.util.ArrayList;

public class Median extends Average{

    public void sort(ArrayList<Double> a) {
        for (int i = 1; i < a.size(); i++) {
            for (int j = 0; j < a.size() - i; j++) {
                if (a.get(j) < a.get(j+1)) {
                    Double s = a.get(j);
                    a.set(j, a.get(j+1));
                    a.set(j+1, s);
                }else continue;
            }
        }
    }
    public double compute() {
        ArrayList<Double> a = getArrayList();
        sort(a);
        if (a.size()%2 == 0) {
            if (a.isEmpty()) {
                return 0;
            }else return (a.get(a.size()/2 - 1).doubleValue() + a.get(a.size()/2).doubleValue()) / 2;
        }else return a.get((a.size() + 1) / 2 - 1).doubleValue();
    }
}
