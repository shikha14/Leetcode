package array;

import java.util.*;

/**
 * Created by Shikha on 23/03/18.
 * Given a collection of intervals, merge all overlapping intervals.
 * For example,
 * Given [1,3],[2,6],[8,10],[15,18],
 * return [1,6],[8,10],[15,18].
 */
public class MergeIntervals {
    public static void main(String[] args){
        List<Interval> intervalList = new ArrayList<>();
        intervalList.add(new Interval(1,3));
        intervalList.add(new Interval(2,6));
        intervalList.add(new Interval(8,10));
        intervalList.add(new Interval(15,18));

        System.out.println(merge(intervalList));

    }

    public static List<Interval> merge(List<Interval> intervals) {
        Collections.sort(intervals,new IntervalComparator());
        LinkedList<Interval> mergedIntervalList = new LinkedList<>();
        for(Interval interval:intervals){
            if(mergedIntervalList.isEmpty() || mergedIntervalList.getLast().end<interval.start)
              mergedIntervalList.add(interval);
            else{
                mergedIntervalList.getLast().end = Math.max(mergedIntervalList.getLast().end,interval.end);
            }
        }
        return mergedIntervalList;
    }
}
