package zadanie_2;

import java.util.Scanner;

public class Zadanie8a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ile liczb chcesz wprowadzić? ");
        int n = scanner.nextInt();
        double[] tablica = new double[n];

        // Wczytanie liczb
        for (int i = 0; i < n; i++) {
            System.out.print("Liczba " + (i + 1) + ": ");
            tablica[i] = scanner.nextDouble();
        }

        int wybor;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Wyświetl wszystkie liczby (for-each)");
            System.out.println("2. Wyświetl od końca (klasyczny for)");
            System.out.println("3. Nieparzyste indeksy");
            System.out.println("4. Parzyste indeksy");
            System.out.println("0. Wyjście");
            System.out.print("Wybierz opcję: ");
            wybor = scanner.nextInt();

            if (wybor == 1) {
                for (double liczba : tablica) {
                    System.out.print(liczba + " ");
                }
                System.out.println();
            } else if (wybor == 2) {
                for (int i = tablica.length - 1; i >= 0; i--) {
                    System.out.print(tablica[i] + " ");
                }
                System.out.println();
            } else if (wybor == 3) {
                for (int i = 1; i < tablica.length; i += 2) {
                    System.out.print(tablica[i] + " ");
                }
                System.out.println();
            } else if (wybor == 4) {
                for (int i = 0; i < tablica.length; i += 2) {
                    System.out.print(tablica[i] + " ");
                }
                System.out.println();
            } else if (wybor != 0) {
                System.out.println("Nieprawidłowy wybór.");
            }

        } while (wybor != 0);

        System.out.println("Zakończono.");
    }
}
