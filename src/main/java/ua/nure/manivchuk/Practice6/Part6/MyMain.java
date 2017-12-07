package ua.nure.manivchuk.Practice6.Part6;

import java.io.*;
import java.util.regex.Pattern;

/**
 * Created by nec on 07.12.17.
 */
public class MyMain {
    public static void main(String[] args) {
        init(args);
    }

    private static void init(String[] args) {
        String fileName;
        String taskName;

        if(args.length > 1){
            fileName = args[1];
            taskName = args[3];
        }else{
            String[] inputData = args[0].split("\\s");
            fileName = inputData[1];
            taskName = inputData[3];
        }
        String inputText = getTextFromFile(fileName);
        textAnalyze(inputText, taskName);
    }

    private static String getTextFromFile(String fileName) {
        StringBuffer sb = new StringBuffer();

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(fileName),"UTF-8"))){
            String str;

            while((str = reader.readLine()) != null){
                sb.append(str).append(" ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sb.toString();
    }

    private static void textAnalyze(String inputText, String taskName) {
        switch (taskName){
            case "frequency" : {
                Option.FREQUENCY.analyzeFrequency(inputText);
                break;
            }
            case "length" : {
                Option.LENGTH.analyzeLength(inputText);
                break;
            }
            case "duplicates" : {
                Option.DUPLICATES.analyzeDuplicates(inputText);
                break;
            }
        }
    }
}
