package zadanie_2;

import java.util.Scanner;
import javax.swing.*;

public class labB {

public static void main(String[] args){
    // Scanner sc = new Scanner(System.in);            //obiekt typu scaner do wczytywania danych z kalwiatury
    // System.out.println("podaj pierwszą liczbe");    ///wczytujemy wartość zmiennej z kalwiatury

    // int f = sc.nextInt();
    //     //usuwamy znak nowej linii z bufora
    // sc.nextLine();  

    // System.out.println("Wprowadzona liczba to "+f);

    int n;
    //pobieranie liczby wprowadzonej
    String liczba = JOptionPane.showInputDialog("Podaj n = ");
    n = Integer.parseInt(liczba);
    //wyświetlenie liczby na ekranie 
    System.out.println("Pobrano dla n warość "+n);
}    
    }


