package LabF;


    import java.util.*;


class Uczestnik implements Comparable<Uczestnik> {
    String imie;
    String nazwisko;
    int wiek;

    
    public Uczestnik(String imie, String nazwisko, int wiek) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
    }


    
    public int compareTo(Uczestnik inny) {
        return this.wiek - inny.wiek;
    }
}


class NazwiskoComparator implements Comparator<Uczestnik> {
    public int compare(Uczestnik a, Uczestnik b) {
        return a.nazwisko.compareToIgnoreCase(b.nazwisko);
    }
}


class ImieComparator implements Comparator<Uczestnik> {
    public int compare(Uczestnik a, Uczestnik b) {
        return a.imie.compareToIgnoreCase(b.imie);
    }
}

public class Zadanie8 {
    public static void main(String[] args) {
       
        LinkedList<Uczestnik> lista = new LinkedList<>();

     
        lista.add(new Uczestnik("Anna", "Banas", 22));
        lista.add(new Uczestnik("Jan", "Kowalski", 30));
        lista.add(new Uczestnik("Ewa", "Zając", 25));

        
        System.out.println("Lista uczestników (dodana):");
        wypiszListe(lista);

        
        Collections.sort(lista);
        System.out.println("\nLista posortowana wg wieku:");
        wypiszListe(lista);

        
        Collections.sort(lista, new NazwiskoComparator());
        System.out.println("\nLista posortowana wg nazwiska:");
        wypiszListe(lista);

        
        Collections.sort(lista, new ImieComparator());
        System.out.println("\nLista posortowana wg imienia:");
        wypiszListe(lista);
    }

   
    public static void wypiszListe(List<Uczestnik> lista) {
        Iterator<Uczestnik> it = lista.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}


