package interfaceHomeTask;

import java.util.List;

public class Book implements Printable{
    private final String bookName;

    public Book (String bookName){
        this.bookName = bookName;
    }

    public void print(){
        System.out.println("This is book: " + bookName);
    }

    public static void printBooks(List<Printable> printable){
        for (Printable value : printable) {
            if (value instanceof Book) {
                System.out.println("This is book: " + ((Book) value).bookName);
            }
        }
    }
}
