package array;

import java.util.Comparator;

/**
 * Created by Shikha on 23/03/18.
 */
public class IntervalComparator implements Comparator<Interval> {
    @Override
    public int compare(Interval o1, Interval o2) {
        return o1.start-o2.start;
    }
}
