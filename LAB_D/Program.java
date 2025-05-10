package LAB_D;

public class Program{
        public static void main(String[] args){

            Wektor3D a = new Wektor3D(new Punkt3D("poczatek"), new Punkt3D("koniec"), "a");
            a.Wyswietl();

            Wektor3D b = new Wektor3D("b");
            b.Wczytaj();
            b.Wyswietl();

            Wektor3D suma = Wektor3D.suma(a, b, "suma");
            suma.Wyswietl();

            Wektor3D roznica = Wektor3D.roznica(a, b, "roznica");
            roznica.Wyswietl();

            System.out.println("dlugosc wektora a= "+ a.dlugosc());

        }
}
