package OOPs;
public class bookobject {
    public static void main(String[] args) {
        bookclass myBook = new bookclass();
        myBook.Settitle("Java Programming");
        myBook.Setauthor("Kumar model");
        myBook.Setprice(499.99);
        System.out.println(myBook);
    }
}