package interfaceHomeTask;

import java.util.List;

public class Magazine implements Printable{
    private final String nameMagazine;

    public Magazine(String nameMagazine){
        this.nameMagazine = nameMagazine;
    }

    public void print(){
        System.out.println("This is magazine: " + nameMagazine);
    }

    public static void printMagazine (List<Printable> printable){
        for (Printable value : printable) {
            if (value instanceof Magazine) {
                System.out.println("This is magazine: " + ((Magazine)value).nameMagazine);
            }
        }
    }
}
