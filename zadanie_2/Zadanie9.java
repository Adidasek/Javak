package zadanie_2;
import java.util.Scanner;
public class Zadanie9 {
        public static void main(String[] args) {
        // Tworzymy obiekt Scanner do wczytywania danych z klawiatury
        Scanner scanner = new Scanner(System.in);
        
        // Wczytujemy łańcuch znaków
        System.out.print("Podaj słowo: ");
        String input = scanner.nextLine();
        
        // Tworzymy odwrotność łańcucha
        String reversed = new StringBuilder(input).reverse().toString();
        
        // Łączymy oryginalny łańcuch z jego odwrotnością
        String result = input + reversed;
        
        // Wyświetlamy wynik
        System.out.println(" " + result);
    }
}

