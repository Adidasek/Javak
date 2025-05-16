package Lab_E;

public class Transport {
    
    public static void main(String[] args){
        Samolot samolot = new Samolot(1000,"Pasazerski");
        samolot.lec();
        samolot.pokazOpis();
        Statek statek = new Statek(2000, "ICON SEE");
        statek.plyn();
        statek.pokazOpis();
        Hydroplan hydroplan = new Hydroplan(200,"   Samolotostatek");
        hydroplan.lec();
        hydroplan.plyn();
        hydroplan.pokazOpis();
    }
}
