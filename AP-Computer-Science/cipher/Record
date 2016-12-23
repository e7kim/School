
public class Record implements Comparable<Record>{

    private char letter;
    private int frequency;
    private char substitution;

    public Record() {
    }

    public Record(char letter) {
        this.letter = letter;
    }

    public char getLetter() {
        return letter;
    }

    public void setLetter(char letter) {
        this.letter = letter;
    }

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    public void setSubstitution(char c) {
    	this.substitution = c;
    }
    
    public char getSubstitution() {
    	return substitution;
    }

    public int compareTo(Record other) {
        return this.frequency - other.frequency;
    }
}
