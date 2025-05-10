package zadanie_2;

public class Zadanie12 {
    public static void main(String[] args) {
        Tablica tab = new Tablica();
        try {
            // Próba uzyskania elementu o indeksie 20
            int value = tab.getElement(20);
            System.out.println("Element nr 20 to: " + value);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Błąd: Indeks poza zakresem tablicy.");
        }
    }
}



