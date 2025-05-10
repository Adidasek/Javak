package zadanie_2;
import java.util.Scanner;

public class Zadanie10 {
    public static void main(String[] args) {
        // Tworzymy obiekt Scanner do wczytywania danych z klawiatury
        Scanner scanner = new Scanner(System.in);
        
        // Wczytujemy pierwszy łańcuch znaków
        System.out.print("Pierwsze słowo: ");
        String firstString = scanner.nextLine();
        
        // Wczytujemy drugi łańcuch znaków
        System.out.print("Drugie słowo: ");
        String secondString = scanner.nextLine();
        
        // Przechodzimy przez pierwszy łańcuch i usuwamy znaki, które występują w drugim
        String result = "";
        for (int i = 0; i < firstString.length(); i++) {
            char c = Character.toLowerCase(firstString.charAt(i));
            if (secondString.toLowerCase().indexOf(c) == -1) {
                result += firstString.charAt(i);
            }
        }
        
        // Wyświetlamy wynik
        System.out.println("Na ekranie: " + result);
    }
}