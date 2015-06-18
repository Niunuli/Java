
import java.io.Serializable;
import java.util.Random;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 * Kun bean merkataan, framework (=JSF) hallitsee sita.
 * @ManagedBeanille on annettu nimi (noppabean)
 * Jos nimea ei olisi annettu, se johdettu suoraan luokan nimesta.
 * @author Niina
 */

@ManagedBean(name = "NoppaBean")
@SessionScoped

public class NoppaBean implements Serializable {

    public NoppaBean() {
    }
    private int summa;
    private int tulos;
    private int lkm;
    private int ka;
    private Random rand = new Random();

    public int getKa() {
        return ka;
    }

    public int getLkm() {
        return lkm;
    }

    public int getSumma() {
        return summa;
    }

    public int getTulos() {
        return tulos;
    }

    public void setKa() {
        ka = summa / lkm;

    }

    public void setLkm() {
        lkm++;
    }

    public void heita() {
        tulos = rand.nextInt(6) + 1;
        summa += tulos;
        lkm++;
        ka = summa / lkm;
    }

    public void nollaa() {
        summa = 0;
        tulos = 0;
        lkm = 0;
        ka = 0;
    }
}
