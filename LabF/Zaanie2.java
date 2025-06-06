package LabF;
import java.util.ArrayList;
import java.util.Iterator;
public class Zaanie2 {
    public static void main(String[] args) {
    
        ArrayList<String> imiona = new ArrayList<>();
            // Dodajemy kilka imion do listy
                imiona.add("Anna");
                imiona.add("Bartek");
                imiona.add("Alicja");
                imiona.add("Kamil");
                imiona.add("Antek");
            // Wyświetlanie imion za pomocą Iteratora

            System.out.println("Imiona na liście:");

            Iterator<String> it = imiona.iterator();

            while (it.hasNext()) {

                System.out.println(it.next());

            }

            // Usuwanie imion zaczynających się na "A"

            it = imiona.iterator(); // Trzeba ponownie uzyskać iterator

            while (it.hasNext()) {

                String imie = it.next();

                if (imie.startsWith("A")) {

                    it.remove(); // Usuwamy element za pomocą iteratora

                }

            }

            // Wyświetlanie listy po usunięciu

            System.out.println("\nImiona po usunięciu imion zaczynających się na 'A':");

            for (String imie : imiona) {

                System.out.println(imie);

            }

        }

    }

