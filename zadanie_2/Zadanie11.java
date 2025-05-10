package zadanie_2;

class Person {
    int m_nAge;
    String m_sLastName;

    // Konstruktor klasy
    Person(String sName, int nAge) {
        this.m_nAge = nAge;
        m_sLastName = new String(sName);
    }

    // Metoda do ustawiania wieku
    public void setAge(int nAge) {
        this.m_nAge = nAge;
    }

    // Metoda do ustawiania nazwiska
    public void setLastName(String sName) {
        this.m_sLastName = sName;
    }

    // Metoda do pobierania wieku
    public int Age() {
        return this.m_nAge;
    }

    // Metoda do pobierania nazwiska
    public String Name() {
        return this.m_sLastName;
    }

    public static void main(String args[]) {
        // Tworzymy obiekt klasy Person
        Person somebody = new Person("Tomek", 26);

        // Wyświetlamy dane osoby
        System.out.println("Dane osoby:");
        System.out.println("Nazwisko: " + somebody.Name());
        System.out.println("Wiek: " + somebody.Age());

        // Aktualizujemy dane
        somebody.setLastName("Nowak");
        somebody.setAge(30);

        // Wyświetlamy zaktualizowane dane
        System.out.println("\nZaktualizowane dane osoby:");
        System.out.println("Nazwisko: " + somebody.Name());
        System.out.println("Wiek: " + somebody.Age());
    }
}
