package ua.nure.manivchuk.Practice6.Part6;

import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Collectors;


/**
 * Created by nec on 07.12.17.
 */
public class TextAnalyze {


    public void frequencyAnalyze(String inputText) {
        ArrayList<String> listInputText = new ArrayList<>(Arrays.asList(inputText.split(" ")));
        Map<String, Integer> mapWords = new TreeMap<>();
//        System.out.println(listInputText);

        for(String word : listInputText){
            if(mapWords.containsKey(word)){
                int count = mapWords.get(word);
                mapWords.remove(word);
                mapWords.put(word, ++count);
            }else{
                mapWords.put(word, 1);
            }
        }

        List<Entry<String, Integer>> list = new LinkedList<>(mapWords.entrySet());
        Collections.sort(list, (o1, o2) -> o2.getValue().compareTo(o1.getValue()));

        Map<String, Integer> sortedMap = new LinkedHashMap<>();
        int count = 1;
        for(Entry<String, Integer> entry : list){
            if(count == 4) break;
            sortedMap.put(entry.getKey(), entry.getValue());
            count++;
        }

        Map result = sortedMap.entrySet().stream()
                .sorted(Entry.comparingByKey((v1, v2)->v2.compareTo(v1)))
                .collect(Collectors.toMap(Entry::getKey, Entry::getValue, (v1, v2)->v1, LinkedHashMap::new));

        System.out.println("=== FREQUENCY ===");
        result.forEach((s, integer) -> System.out.println(s + " ==> " + integer));

    }

    public void lengthAnalyze(String inputText) {
        ArrayList<String> listInputText = new ArrayList<>(Arrays.asList(inputText.split(" ")));
        List<String> listWordsMacLength = new ArrayList<>();

        for(String word : listInputText){
            if(!listWordsMacLength.contains(word)){
                listWordsMacLength.add(word);
            }
        }

        listWordsMacLength.sort((o1, o2) -> Integer.compare(o2.length(), o1.length()));

        System.out.println("=== LENGTH ===");
        for(int i = 0; i < 3; i++){
            System.out.println(listWordsMacLength.get(i) + " ==> " + listWordsMacLength.get(i).length());
        }
    }

    public void duplicatesAnalyze(String inputText) {
        ArrayList<String> listInputText = new ArrayList<>(Arrays.asList(inputText.split(" ")));
        Set<String> duplicates = new HashSet<>();

        int count = 0;
        for(int i = 0; i < listInputText.size(); i++){
            String currentWord = listInputText.get(i);
            for(int j = 0; j < listInputText.size(); j++){
                if(currentWord.equals(listInputText.get(j)) && duplicates.add(listInputText.get(j))){
                    count++;
                }
            }
            if(count == 3){
                break;
            }
        }
        System.out.println("=== DUPLICATES ===");
        if(duplicates.size() != 0){
            StringBuffer stringBuffer = new StringBuffer();
            for(String word : duplicates){
                stringBuffer.append(word.toUpperCase()).append(System.lineSeparator());
            }
            System.out.println(stringBuffer.reverse().toString());
        }else {
            System.out.println("No duplicates!");
        }

    }

}
