package Average;

import java.util.ArrayList;

public abstract class Average  {
    private ArrayList<Double> arrayList = new ArrayList<>();
    public ArrayList<Double> getArrayList() {
        return arrayList;
    }
    public void add(double d) {
        arrayList.add(d);
    }
    public void clear() {
        arrayList.clear();
    }
    public abstract double compute();
}
