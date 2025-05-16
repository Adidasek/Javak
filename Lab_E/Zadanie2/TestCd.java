package Lab_E.Zadanie2;

public class TestCd {
    public static void main(String[] args) {
        OdtwarzaczCD cd = new OdtwarzaczCD("Sony");

        System.out.println(cd); // toString()
        cd.wlacz();
        cd.glosniej();
        cd.start();
        cd.pauza();
        cd.stop();
        cd.ciszej();
        System.out.println(cd); // ponownie toString()
        cd.wylacz();
    }
}