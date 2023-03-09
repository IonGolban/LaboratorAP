import locations.Location;

import java.util.Comparator;
import java.util.Map;

public class MyComparator implements Comparator<Map.Entry<Location,Double>> {
    @Override
    public int compare(Map.Entry<Location, Double> o1, Map.Entry<Location, Double> o2) {
        return Double.compare(o1.getValue(),o2.getValue());
    }
}
