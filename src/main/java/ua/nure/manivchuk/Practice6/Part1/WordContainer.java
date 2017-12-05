package ua.nure.manivchuk.Practice6.Part1;

import java.util.ArrayList;

/**
 * Created by nec on 05.12.17.
 */
public class WordContainer {
    private ArrayList<Word> words = new ArrayList<>();

    public void addWords(Word word) {
        for (Word w : words) {
            if (w.getContent().equals(word.getContent())) {
                w.setFrequency(w.getFrequency() + 1);
                return;
            }
        }
        words.add(word);
    }

    public ArrayList<Word> getWords() {
        words.sort((o1, o2) ->{
            if (o1.getFrequency() > o2.getFrequency()) {
                return -1;
            } else if (o1.getFrequency() < o2.getFrequency()) {
                return 1;
            } else {
                return o1.getContent().compareTo(o2.getContent());
            }
        } /*o2.getFrequency() - o1.getFrequency()*/);
        return words;
    }
}
