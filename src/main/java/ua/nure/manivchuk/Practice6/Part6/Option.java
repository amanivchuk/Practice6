package ua.nure.manivchuk.Practice6.Part6;

/**
 * Created by nec on 07.12.17.
 */
public enum Option {
    FREQUENCY, LENGTH, DUPLICATES;

    public void analyzeFrequency(String text) {
        new TextAnalyze().frequencyAnalyze(text);
    }
    public void analyzeLength(String text) {
        new TextAnalyze().lengthAnalyze(text);
    }
    public void analyzeDuplicates(String text) {
        new TextAnalyze().duplicatesAnalyze(text);
    }
}
