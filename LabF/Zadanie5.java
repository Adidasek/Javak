package LabF;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Zadanie5 {
    


    public static void main(String[] args) {

        Map<String, Integer> osoby = new HashMap<>();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Dodaj imiona i wiek (wpisz 'koniec', aby zakończyć):");

        while (true) {

            System.out.print("Imię: ");

            String imie = scanner.nextLine();

            if (imie.equalsIgnoreCase("koniec")) {

                break;

            }

            System.out.print("Wiek: ");

            int wiek = Integer.parseInt(scanner.nextLine());

            osoby.put(imie, wiek); // nadpisze wiek, jeśli imię się powtórzy

        }

        System.out.println("\nWszystkie osoby:");

        for (Map.Entry<String, Integer> entry : osoby.entrySet()) {


            System.out.println(entry.getKey() + " - " +

            entry.getValue() + " lat");

        }

        // Wyszukiwanie wieku po imieniu

        System.out.print("\nPodaj imię do wyszukania: ");

        String szukaneImie = scanner.nextLine();

        if (osoby.containsKey(szukaneImie)) {

            System.out.println(szukaneImie + " ma " +

            osoby.get(szukaneImie) + " lat.");

        } else {

            System.out.println("Nie znaleziono osoby o imieniu " + szukaneImie);



        }

        scanner.close();

    }

    
}
