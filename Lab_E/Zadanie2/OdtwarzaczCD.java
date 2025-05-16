
package Lab_E.Zadanie2;

public class OdtwarzaczCD extends Odtwarzacz {
    private int glosnosc;

    public OdtwarzaczCD(String marka) {
        super(marka);
        this.glosnosc = 5; // domyślny poziom głośności
    }

    public void glosniej() {
        if (wlaczony && glosnosc < 10) {
            glosnosc++;
            System.out.println(marka + ": zwiększono głośność do " + glosnosc);
        } else if (!wlaczony) {
            System.out.println("Najpierw włącz urządzenie.");
        }
    }

    public void ciszej() {
        if (wlaczony && glosnosc > 0) {
            glosnosc--;
            System.out.println(marka + ": zmniejszono głośność do " + glosnosc);
        } else if (!wlaczony) {
            System.out.println("Najpierw włącz urządzenie.");
        }
    }

    @Override
    public void start() {
        if (wlaczony) {
            System.out.println(marka + ": odtwarzanie rozpoczęte.");
        } else {
            System.out.println("Najpierw włącz urządzenie.");
        }
    }

    @Override
    public void stop() {
        if (wlaczony) {
            System.out.println(marka + ": odtwarzanie zatrzymane.");
        } else {
            System.out.println("Najpierw włącz urządzenie.");
        }
    }

    @Override
    public void pauza() {
        if (wlaczony) {
            System.out.println(marka + ": pauza.");
        } else {
            System.out.println("Najpierw włącz urządzenie.");
        }
    }

    @Override
    public String toString() {
        return "Odtwarzacz CD marki " + marka + ", głośność: " + glosnosc +
               ", stan: " + (wlaczony ? "włączony" : "wyłączony");
    }
}