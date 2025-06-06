package LabF;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

    

    class Osoba implements Comparable<Osoba> {

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

        public int compareTo(Osoba inna) {

            return Integer.compare(this.wiek, inna.wiek); // sortowanie wg wieku rosnąco

        }

        @Override

        public String toString() {

            return imie + " (" + wiek + " lat)";

        }

    }

    public class Zadanie6 {

        public static void main(String[] args) {

            LinkedList<Osoba> osoby = new LinkedList<>();

            osoby.add(new Osoba("Anna", 30));

            osoby.add(new Osoba("Bartek", 25));

            osoby.add(new Osoba("Kamil", 40));

            osoby.add(new Osoba("Zofia", 20));

            // Sortowanie listy

            Collections.sort(osoby);

            // Wypisanie posortowanej listy za pomocą iteratora

            System.out.println("Osoby posortowane wg wieku:");

            Iterator<Osoba> it = osoby.iterator();

            while (it.hasNext()) {

                System.out.println(it.next());

            }

        }

    }

