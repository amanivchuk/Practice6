package ua.nure.manivchuk.Practice6.Part4;

/**
 * Created by nec on 06.12.17.
 */
public class Edge {
    private int first;
    private int second;

    public Edge(int first, int second) {
        this.first = first;
        this.second = second;
    }

    public int getFirst() {
        return first;
    }

    public int getSecond() {
        return second;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Edge edge = (Edge) o;

        if (first != edge.first) return false;
        return second == edge.second;
    }

    @Override
    public int hashCode() {
        int result = first;
        result = 31 * result + second;
        return result;
    }

    @Override
    public String toString() {
        return getFirst() + " - " + getSecond();
    }
}
