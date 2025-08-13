package FinalKeywordDemo;
import java.util.ArrayList;
public class finalKeyword {
    private final int rollNumber;
    public finalKeyword(int rollNumber) {
        this.rollNumber = rollNumber;
    }
    public final void displayRollNumber() {
        System.out.println("Roll Number: " + rollNumber);
    }
    public static void main(String[] args) {
        finalKeyword obj = new finalKeyword(111);
        obj.displayRollNumber();
        final ArrayList<String> names = new ArrayList<>();
        names.add("kumar");
        names.add("model");
        System.out.println("Names list: " + names);

    }
}