package LabF;
 import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;

class Osoba {

    private String imie;

    private int wiek;

    public Osoba(String imie, int wiek) {

        this.imie = imie;

        this.wiek = wiek;

    }


    public String getImie() {

        return imie;

    }

    public int getWiek() {

        return wiek;

    }

    @Override

    public String toString() {

        return imie + " (" + wiek + " lat)";

    }

}

// Comparator porównujący po imieniu


class ImieComparator implements Comparator<Osoba> {

    @Override

    public int compare(Osoba o1, Osoba o2) {


        return o1.getImie().compareToIgnoreCase(o2.getImie());

    }

}


public class Zadanie7 {

    public static void main(String[] args) {

        LinkedList<Osoba> osoby = new LinkedList<>();

        osoby.add(new Osoba("Anna", 30));


        osoby.add(new Osoba("Burek", 25));

        osoby.add(new Osoba("Kamil", 40));

        osoby.add(new Osoba("Ala", 20));

        // Sortowanie po imieniu przy użyciu Comparatora

        Collections.sort(osoby, new ImieComparator());

        // Wypisanie posortowanej listy

        System.out.println("Osoby posortowane alfabetycznie po imieniu:");

        Iterator<Osoba> it = osoby.iterator();

        while (it.hasNext()) {

            System.out.println(it.next());

        }

    }

}


