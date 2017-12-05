package ua.nure.manivchuk.Practice6.Part1;


/**
 * Created by nec on 05.12.17.
 */
public class Word {
    private String content;
    private int frequency;

    public Word() {
    }

    public Word(String content) {
        this.content = content;
    }

    public Word(String content, int frequency) {
        this.content = content;
        this.frequency = frequency;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Word word = (Word) o;

        if (frequency != word.frequency) return false;
        return content != null ? content.equals(word.content) : word.content == null;
    }

    @Override
    public int hashCode() {
        int result = content != null ? content.hashCode() : 0;
        result = 31 * result + frequency;
        return result;
    }

    @Override
    public String toString() {
        return content + " " + frequency;
    }
}
