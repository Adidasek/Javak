package zadanie_2;
import java.math.BigInteger;
import java.util.Scanner;


import javax.swing.JOptionPane;

public class Zadanie3 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        do {
            System.out.print("Podaj dodatnią liczbę całkowitą n (n > 3): ");
            n = scanner.nextInt();
        } while (n <= 3);

        int suma = -1;

        for (int j = 3; j <= n; j++) {
            BigInteger factorial = silnia(j - 2);
            BigInteger floorDiv = factorial.divide(BigInteger.valueOf(j));
            BigInteger expression = factorial.subtract(BigInteger.valueOf(j).multiply(floorDiv));
            suma += expression.intValue();
        }

        System.out.println("π(" + n + ") = " + suma);
    }

    // Funkcja licząca silnię (z użyciem BigInteger dla dużych wartości)
    public static BigInteger silnia(int x) {
        BigInteger wynik = BigInteger.ONE;
        for (int i = 2; i <= x; i++) {
            wynik = wynik.multiply(BigInteger.valueOf(i));
        }
        return wynik;
    }
}