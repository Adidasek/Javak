package zadanie_2;

import java.util.Scanner;

public class Zadanie7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Wprowadzenie liczby elementów
        System.out.print("Podaj liczbę elementów: ");
        int n = scanner.nextInt();
        double[] tablica = new double[n];

        // Wczytanie elementów do tablicy
        System.out.println("Wprowadź " + n + " liczb:");
        for (int i = 0; i < n; i++) {
            System.out.print("Element " + i + ": ");
            tablica[i] = scanner.nextDouble();
        }

        int wybor;

        do {
            // Menu
            System.out.println("\n--- MENU ---");
            System.out.println("1. Wyświetl od początku");
            System.out.println("2. Wyświetl od końca");
            System.out.println("3. Wyświetl elementy o nieparzystych indeksach");
            System.out.println("4. Wyświetl elementy o parzystych indeksach");
            System.out.println("0. Zakończ program");
            System.out.print("Wybierz opcję: ");
            wybor = scanner.nextInt();

            if (wybor == 1) {
                System.out.println("Tablica od początku:");
                for (int i = 0; i < n; i++) {
                    System.out.print(tablica[i] + " ");
                }
                System.out.println();

            } else if (wybor == 2) {
                System.out.println("Tablica od końca:");
                for (int i = n - 1; i >= 0; i--) {
                    System.out.print(tablica[i] + " ");
                }
                System.out.println();

            } else if (wybor == 3) {
                System.out.println("Elementy o nieparzystych indeksach:");
                for (int i = 1; i < n; i += 2) {
                    System.out.print(tablica[i] + " ");
                }
                System.out.println();

            } else if (wybor == 4) {
                System.out.println("Elementy o parzystych indeksach:");
                for (int i = 0; i < n; i += 2) {
                    System.out.print(tablica[i] + " ");
                }
                System.out.println();

            } else if (wybor != 0) {
                System.out.println("Nieprawidłowa opcja.");
            }

        } while (wybor != 0);

        System.out.println("Koniec programu.");
    }
}