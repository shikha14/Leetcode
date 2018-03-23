package array;

import java.util.Comparator;

/**
 * Created by Shikha on 23/03/18.
 */
public class Interval {
      public int start;
      public int end;
      Interval() { start = 0; end = 0; }
      Interval(int s, int e) { start = s; end = e; }

    @Override
    public String toString() {
        return "Interval{" +
                "start=" + start +
                ", end=" + end +
                '}';
    }
}
