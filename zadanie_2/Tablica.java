package zadanie_2;


    public class Tablica {
        int[] tab;
    
        public Tablica() {
            // Tworzymy tablicę o rozmiarze 5
            tab = new int[5];
            // Inicjalizujemy tablicę przykładowymi wartościami
            for (int i = 0; i < tab.length; i++) {
                tab[i] = i * 10; // Przykładowe wartości: 0, 10, 20, 30, 40
            }
        }
    
        // Metoda, która zwraca element na danym indeksie
        public int getElement(int index) {
            // Sprawdzamy, czy indeks jest w dozwolonym zakresie
            if (index < 0 || index >= tab.length) {
                throw new ArrayIndexOutOfBoundsException("Indeks " + index + " jest poza zakresem tablicy.");
            }
            return tab[index];
        }
    }
     

