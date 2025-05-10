package zadanie_2;

import java.util.Scanner;

public class Zadanie7b {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Wczytywanie danych
        System.out.print("Ile liczb chcesz wprowadzić? ");
        int n = scanner.nextInt();
        double[] tablica = new double[n];

        System.out.println("Wprowadź " + n + " liczb:");
        for (int i = 0; i < n; i++) {
            System.out.print("Liczba " + (i + 1) + ": ");
            tablica[i] = scanner.nextDouble();
        }

        int wybor;

        // Menu z algorytmami
        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Oblicz sumę");
            System.out.println("2. Oblicz iloczyn");
            System.out.println("3. Oblicz średnią");
            System.out.println("4. Znajdź wartość minimalną");
            System.out.println("5. Znajdź wartość maksymalną");
            System.out.println("0. Zakończ program");
            System.out.print("Wybierz opcję: ");
            wybor = scanner.nextInt();

            if (wybor == 1) {
                double suma = 0;
                for (int i = 0; i < n; i++) {
                    suma += tablica[i];
                }
                System.out.println("Suma: " + suma);

            } else if (wybor == 2) {
                double iloczyn = 1;
                for (int i = 0; i < n; i++) {
                    iloczyn *= tablica[i];
                }
                System.out.println("Iloczyn: " + iloczyn);

            } else if (wybor == 3) {
                double suma = 0;
                for (int i = 0; i < n; i++) {
                    suma += tablica[i];
                }
                System.out.println("Średnia: " + (suma / n));

            } else if (wybor == 4) {
                double min = tablica[0];
                for (int i = 1; i < n; i++) {
                    if (tablica[i] < min) min = tablica[i];
                }
                System.out.println("Minimalna wartość: " + min);

            } else if (wybor == 5) {
                double max = tablica[0];
                for (int i = 1; i < n; i++) {
                    if (tablica[i] > max) max = tablica[i];
                }
                System.out.println("Maksymalna wartość: " + max);

            } else if (wybor != 0) {
                System.out.println("Nieprawidłowa opcja.");
            }

        } while (wybor != 0);

        System.out.println("Zakończono program.");
    }
}
