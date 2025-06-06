package LabF;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class Zadanie4 {



    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Set<String> imiona = new HashSet<>();

        System.out.println("Podaj imiona (wpisz 'koniec' aby zakończyć):");

        while (true) {

            System.out.print("Imię: ");

            String imie = scanner.nextLine();

            if (imie.equalsIgnoreCase("koniec")) {

                break;

            }

            imiona.add(imie); // Duplikaty zostaną automatycznie odrzucone

        }

        System.out.println("\nUnikalne imiona:");

        for (String imie : imiona) {

            System.out.println(imie);

        }

        scanner.close();

    }

}
