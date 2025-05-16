package Lab_E;

abstract class Machina {
    protected int zasieg;
    protected String OpisTechniczny;


    public Machina(int zasieg, String OpisTechniczny)
    {
    this.zasieg=zasieg;
    this.OpisTechniczny=OpisTechniczny;
    }

    public void pokazOpis() 
    {
        System.out.println("Zasięg: " + zasieg + " km");
        System.out.println("Opis: " + OpisTechniczny);
    }
}