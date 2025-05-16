package Lab_E.Zadanie2;

public abstract class Odtwarzacz implements Wlacz, Odtwarzaj {
    protected boolean wlaczony;
    protected String marka;

    public Odtwarzacz(String marka) {
        this.marka = marka;
        this.wlaczony = false;
    }

    @Override
    public void wlacz() {
        wlaczony = true;
        System.out.println(marka + " włączony.");
    }

    @Override
    public void wylacz() {
        wlaczony = false;
        System.out.println(marka + " wyłączony.");
    }

    @Override
    public boolean czyWlaczony() {
        return wlaczony;
    }

    @Override
    public abstract void start();

    @Override
    public abstract void stop();

    @Override
    public abstract void pauza();
}