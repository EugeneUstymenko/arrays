package interfaceHomeTask;

import java.util.ArrayList;
import java.util.List;

import static interfaceHomeTask.Book.printBooks;
import static interfaceHomeTask.Magazine.printMagazine;

public class Main {

    public static void main(String[] args) {

        Book war = new Book("War and piece");
        Book tor = new Book("Tore");
        Book more = new Book("More cars");
        Magazine last = new Magazine("Barby");
        Magazine create = new Magazine("Beautiful");
        Magazine icon = new Magazine("Icon of Star");

        List<Printable> magazinesBooksList = new ArrayList<>();
        magazinesBooksList.add(tor);
        magazinesBooksList.add(war);
        magazinesBooksList.add(more);
        magazinesBooksList.add(last);
        magazinesBooksList.add(create);
        magazinesBooksList.add(icon);

        for (Printable item: magazinesBooksList) {
            item.print();
        }

        System.out.println("\nSeparate list of books and magazines");
        printBooks(magazinesBooksList);
        printMagazine(magazinesBooksList);
    }
}
