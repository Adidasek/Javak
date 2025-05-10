package zadanie_2;

import java.util.Scanner;

public class Zadanie8b {
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
            System.out.println("1. Oblicz sumę");
            System.out.println("2. Oblicz iloczyn");
            System.out.println("3. Oblicz średnią");
            System.out.println("4. Znajdź minimum");
            System.out.println("5. Znajdź maksimum");
            System.out.println("0. Wyjście");
            System.out.print("Wybierz opcję: ");
            wybor = scanner.nextInt();

            if (wybor == 1) {
                double suma = 0;
                for (double x : tablica) {
                    suma += x;
                }
                System.out.println("Suma: " + suma);

            } else if (wybor == 2) {
                double iloczyn = 1;
                for (double x : tablica) {
                    iloczyn *= x;
                }
                System.out.println("Iloczyn: " + iloczyn);

            } else if (wybor == 3) {
                double suma = 0;
                for (double x : tablica) {
                    suma += x;
                }
                System.out.println("Średnia: " + (suma / tablica.length));

            } else if (wybor == 4) {
                double min = tablica[0];
                for (double x : tablica) {
                    if (x < min) min = x;
                }
                System.out.println("Minimum: " + min);

            } else if (wybor == 5) {
                double max = tablica[0];
                for (double x : tablica) {
                    if (x > max) max = x;
                }
                System.out.println("Maksimum: " + max);

            } else if (wybor != 0) {
                System.out.println("Nieprawidłowa opcja.");
            }

        } while (wybor != 0);

        System.out.println("Koniec programu.");
    }
}
