package ua.nure.manivchuk.Practice6.Part2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by nec on 06.12.17.
 */
public class Part2 {
    private int size = 100000;

    public void start(){
        List<Integer> arrayList = new ArrayList<>();
        for(int i = 0; i < size; i++){
            arrayList.add(i);
        }
        System.out.println("Total time for ArrayList: " + circle(arrayList));

        List<Integer> linkedList = new LinkedList<>();
        for(int i = 0; i < size; i++){
            linkedList.add(i);
        }
        System.out.println("Total time for LinkedList: " + circle(linkedList));
    }

    public long circle(List<Integer> list){
        long time = System.currentTimeMillis();
        while(list.size() > 1){
            for(int i = 0; i < list.size(); i++){
                if(i % 3 == 0){
                    list.remove(i);
                }
            }
        }
//        System.out.println("size = "+list.size());
//        System.out.println("elem = "+list);
        return System.currentTimeMillis() - time;
    }

    public static void main(String[] args) {
        new Part2().start();
    }
}
