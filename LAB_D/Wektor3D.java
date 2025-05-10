package LAB_D;

import java.util.Scanner;

public class Wektor3D {
    public double X,Y,Z;
    private String nazwa;

    public Wektor3D(double x, double y, double z, String nazwa)
    {
        X=x;
        Y=y;
        Z=z;
        nazwa="";
    }
    public Wektor3D(Punkt3D poczatek, Punkt3D koniec, String nazwa)
    {
        X=koniec.X - poczatek.X;
        Y=koniec.Y - poczatek.Y;
        Z=koniec.Z - poczatek.Z;
        this.nazwa=nazwa;
    
    }
    public Wektor3D(String nazwa)
    {
        X=0;
        Y=0;
        Z=0;
        this.nazwa=nazwa;
    }

    private void suma(Wektor3D a,Wektor3D b)
    {
        X=a.X + b.X;
        Y=a.Y + b.Y;
        Z=a.Z + b.Z;
    }
    private void roznica(Wektor3D a, Wektor3D b)
    {
        X=a.X - b.X;
        Y=a.Y - b.Y;
        Z=a.Z - b.Z;
    }
    public void Wczytaj()
    {
    Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj x: ");
        this.X = scanner.nextDouble();
        System.out.print("Podaj y: ");
        this.Y = scanner.nextDouble();
        System.out.print("Podaj z: ");
        this.Z = scanner.nextDouble();
    }
    public void Wyswietl()
    {
        System.out.println("Wektor '" + nazwa + "': (" + X + ", " + Y + ", " + Z + ")");
    }
    public static Wektor3D suma(Wektor3D a, Wektor3D b, String nazwa)
    {
        Wektor3D wynik = new Wektor3D(nazwa);
        wynik.suma(a,b);
        return wynik;
    }
    public static Wektor3D roznica(Wektor3D a, Wektor3D b, String nazwa)
    {
        Wektor3D wynik = new Wektor3D(nazwa);
        wynik.roznica(a,b);
        return wynik;
    }
    public double dlugosc()
    {
        return Math.sqrt(X*X + Y*Y + Z*Z);
    }
}
