package ua.nure.manivchuk.Practice6.Part4;

/**
 * Created by nec on 06.12.17.
 */
public class Part4 {
    public static void main(String[] args) {
        Graph graph = new Graph(5);
        graph.add(0, 1);
        graph.add(1, 0);
        graph.add(2, 0);
        graph.add(3, 0);
        graph.add(4, 0);
        System.out.println(graph.toString());
        graph.remove(1, 0);
        System.out.println(graph.toString());
    }
}
