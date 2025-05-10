package zadanie_2.Kalkulator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calc = new Calculator();

        System.out.print("Podaj pierwszą liczbę: ");
        double a = scanner.nextDouble();

        System.out.print("Podaj drugą liczbę: ");
        double b = scanner.nextDouble();

        boolean exit = false;

        while (!exit) {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Dodawanie");
            System.out.println("2. Odejmowanie");
            System.out.println("3. Mnożenie");
            System.out.println("4. Dzielenie");
            System.out.println("5. Wyjście");
            System.out.print("Wybierz operację (1-5): ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Wynik: " + calc.add(a, b));
                    break;
                case 2:
                    System.out.println("Wynik: " + calc.subtract(a, b));
                    break;
                case 3:
                    System.out.println("Wynik: " + calc.multiply(a, b));
                    break;
                case 4:
                    System.out.println("Wynik: " + calc.divide(a, b));
                    break;
                case 5:
                    exit = true;
                    System.out.println("Zamykanie programu.");
                    break;
                default:
                    System.out.println("Nieprawidłowy wybór.");
            }
        }

        scanner.close();
    }
}