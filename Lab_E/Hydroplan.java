package Lab_E;
//implementacja Lata, Plywa
 class Hydroplan extends Machina implements Lata, Plywa {

     public Hydroplan(int zasieg, String opis) {
        super(zasieg, opis);
    }
    public void lec(){
        System.out.println("Hydroplan leci");
    }

    public void plyn(){
        System.out.println("Hydroplan plynie");
    }
}
