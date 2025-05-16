package Lab_E;
//implementacja Lata
class Samolot extends Machina implements Lata {
    
    public Samolot(int zasieg, String opis)
    {
        super(zasieg,opis);
    }
    public void lec(){
        System.out.println("Samolot leci ");

    }
}
