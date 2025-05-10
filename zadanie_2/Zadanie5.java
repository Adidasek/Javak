package zadanie_2;

import java.util.Scanner;

public class Zadanie5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj liczbę elementów (N): ");
        int n = scanner.nextInt();
        double[] liczby = new double[n];

        // Wczytywanie liczb
        System.out.println("Podaj " + n + " liczb:");
        for (int i = 0; i < n; i++) {
            liczby[i] = scanner.nextDouble();
        }

        // Obliczanie średniej M
        double suma = 0;
        for (int i = 0; i < n; i++) {
            suma += liczby[i];
        }
        double srednia = suma / n;

        // Obliczanie sumy kwadratów różnic (xi - M)^2
        double sumaKwadratow = 0;
        for (int i = 0; i < n; i++) {
            sumaKwadratow += Math.pow(liczby[i] - srednia, 2);
        }

        // Odchylenie standardowe
        double odchylenie = Math.sqrt(sumaKwadratow / n);

        System.out.printf("Odchylenie standardowe: %.4f\n", odchylenie);
    }
}