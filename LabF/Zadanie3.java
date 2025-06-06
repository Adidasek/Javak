package LabF;
import java.util.LinkedList;
public class Zadanie3 {
    


    public static void main(String[] args) {

        // Tworzymy LinkedList miast

        LinkedList<String> miasta = new LinkedList<>();

        // Dodajemy miasta na koniec

        miasta.add("Warszawa");

        miasta.add("Kraków");

        miasta.add("Gdańsk");

        // Dodajemy miasto na początek

        miasta.addFirst("Wrocław");

        // Dodajemy miasto na koniec

        miasta.addLast("Poznań");

        System.out.println("Miasta na liście:");

        for (String miasto : miasta) {

            System.out.println(miasto);

        }

        // Usuwamy pierwsze i ostatnie miasto

        miasta.removeFirst();

        miasta.removeLast();

        System.out.println("\nMiasta po usunięciu pierwszego i ostatniego:");

        for (String miasto : miasta) {

            System.out.println(miasto);

        }

    }

}

