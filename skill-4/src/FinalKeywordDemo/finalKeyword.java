package FinalKeywordDemo;
public class finalKeyword {
    private final int rollNumber;
    public finalKeyword(int rollNumber) {
        this.rollNumber = rollNumber;
    }
    public final void displayRollNumber() {
        System.out.println("Roll Number: " + rollNumber);
    }
    public static void main(String[] args) {
        finalKeyword obj = new finalKeyword(90082);
        obj.displayRollNumber();
        final StringBuilder sb = new StringBuilder("Hello, ");
        sb.append("bhanu");
        System.out.println(sb);

    }
}