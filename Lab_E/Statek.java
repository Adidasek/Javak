package Lab_E;
//implementacja Plywa
 class Statek extends Machina implements Plywa {
    public Statek(int zasieg, String opis)
    {
        super(zasieg,opis);
    }
    public void plyn(){
        System.out.println("Statek plynie");
    }

}
