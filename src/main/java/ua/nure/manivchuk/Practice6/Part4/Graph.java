package ua.nure.manivchuk.Practice6.Part4;

import java.util.ArrayList;

/**
 * Created by nec on 06.12.17.
 */
public class Graph {
    private int number;
    private ArrayList<Edge> edgeList;

    public Graph(int number) {
        this.number = number;
        edgeList = new ArrayList<>();
    }

    public boolean add(int first, int second){
        if(first < number && second < number){
            if(!edgeList.contains(new Edge(first, second))){
                edgeList.add(new Edge(first, second));
                return true;
            }
        }
        return false;
    }

    public boolean remove(int first, int second){
        if(first < number && second < number){
            if(edgeList.contains(new Edge(first, second))){
                edgeList.remove(new Edge(first, second));
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for(Edge g : edgeList){
            stringBuilder.append(g.toString()).append(System.lineSeparator());
        }
        stringBuilder.append("-------");
        return stringBuilder.toString();
    }
}
