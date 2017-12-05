package ua.nure.manivchuk.Practice6.Part1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by nec on 05.12.17.
 */
public class Part1 {
    private WordContainer wordContainer = new WordContainer();

    public ArrayList<String> readData(){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> wordList = new ArrayList<>();
        String str;
        try {
            /*while(!(str = reader.readLine()).equals( "stop")){*/
            while((str = reader.readLine())!= null){
                String[] res = str.split(" ");
                if(res.length != 0) {
                    for (int i = 0; i < res.length; i++) {
                        wordList.add(res[i].toString());
                    }
                }else{
                    wordList.add(str.toString());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return wordList;
    }

    public void addToContainer(List<String> data){
        for(String str : data){
            Word newWord = new Word(str,1);
            wordContainer.addWords(newWord);
        }
    }

    public void showContainer(){
        wordContainer.getWords().forEach(System.out::println);
    }

    public static void main(String[] args) {
        Part1 part1 = new Part1();
        List<String> data = part1.readData();
        part1.addToContainer(data);

        part1.showContainer();
    }
}
