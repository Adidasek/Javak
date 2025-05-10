package zadanie_2;

import java.util.*;

public class Zadanie6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        List<Integer> liczbyUzytkownika = new ArrayList<>();
        List<Integer> wylosowane = new ArrayList<>();

        // Wczytaj 6 unikalnych liczb od użytkownika
        while (liczbyUzytkownika.size() < 6) {
            System.out.print("Podaj liczbę (1-49): ");
            int liczba = sc.nextInt();
            if (liczba >= 1 && liczba <= 49 && !liczbyUzytkownika.contains(liczba)) {
                liczbyUzytkownika.add(liczba);
            } else {
                System.out.println("Błędna lub powtórzona liczba!");
            }
        }

        // Losowanie 6 unikalnych liczb
        while (wylosowane.size() < 6) {
            int los = rand.nextInt(49) + 1;
            if (!wylosowane.contains(los)) {
                wylosowane.add(los);
            }
        }

        // Sprawdź trafienia
        int trafienia = 0;
        for (int l : liczbyUzytkownika) {
            if (wylosowane.contains(l)) trafienia++;
        }

        // Wynik
        System.out.println("Twoje liczby: " + liczbyUzytkownika);
        System.out.println("Wylosowane: " + wylosowane);
        System.out.println("Trafienia: " + trafienia);
    }
}

