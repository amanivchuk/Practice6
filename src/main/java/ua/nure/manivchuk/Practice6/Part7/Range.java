package ua.nure.manivchuk.Practice6.Part7;

import java.util.Iterator;

/**
 * Created by nec on 07.12.17.
 */
public class Range implements Iterable<Integer> {
    private int n;
    private int m;
    private boolean reverse;


    public Range(int n, int m) {
        this.n = n;
        this.m = m;
    }

    public Range(int n, int m, boolean reverse) {
        this.n = n;
        this.m = m;
        this.reverse = reverse;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            @Override
            public boolean hasNext() {
                if(!reverse) {
                    return n <= m;
                }else{
                    return m >= n;
                }
            }

            @Override
            public Integer next() {
                if(!reverse) {
                    return n++;
                }else {
                    return m--;
                }
            }
        };
    }
}
