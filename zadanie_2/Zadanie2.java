package zadanie_2;

import javax.swing.JOptionPane;

public class Zadanie2 {
    public static void main(String[] args) {
       
        double eps, suma = 0, wyraz;
        int k = 0;
        
        // Wczytanie wartości epsilon od użytkownika
        String liczba_eps = JOptionPane.showInputDialog("Wybierz dokładność obliczeń (epsilon) < 0.01: ");
        eps = Double.parseDouble(liczba_eps);
        
      

        // Obliczanie sumy szeregu Leibniza dla pi
        // Szereg: 4 * (1 - 1/3 + 1/5 - 1/7 + 1/9 - ...)
        while (true) {
            wyraz = 1.0 / (2 * k + 1); // Wyraz ogólny w szeregu
            if (k % 2 == 0) {
                suma += wyraz; // Dodajemy, jeśli k jest parzyste
            } else {
                suma -= wyraz; // Odejmujemy, jeśli k jest nieparzyste
            }

            // Jeśli wartość kolejnego wyrazu jest mniejsza niż epsilon, przerywamy obliczenia
            if (Math.abs(wyraz) < eps) {
                break;
            }

            k++; // Przechodzimy do kolejnego wyrazu w szeregu
        }

        // Obliczenie przybliżonej wartości pi
        suma *= 4;

        // Wyświetlenie wyniku
        System.out.println("Przybliżona wartość pi: " + suma);
        System.out.println("Liczba wyrazów w szeregu: " + (k + 1));
    
    }
}
