package LabF;
import java.util.Scanner;
public class Zadanie1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Podaj liczbe calkowita: ");
            int a = Integer.parseInt(scanner.nextLine());
            
            System.out.print("Podaj liczbę, przez którą chcesz podzielić: ");
            int b = Integer.parseInt(scanner.nextLine());

            int wynik = a / b;
            System.out.println("Wynik dzielenia: " + wynik);
        }
        
        catch (NumberFormatException e) {
        System.out.println("Błąd: Wprowadziłeś niepoprawną liczbę.");
        } 
        
        catch (ArithmeticException e) {
        System.out.println("Błąd: Próba dzielenia przez zero.");
        } 
        
        finally {
        System.out.println("Koniec programu.");
        
    }
            scanner.close();
    }
}
