package PbTipexam;

public class Vehicul {
    int An_fabricatie;
    String Model;

    Vehicul(){}

    Vehicul(int An_fabricatie, String Model) {
        this.An_fabricatie = An_fabricatie;
        this.Model = Model;
    }
    public int getAn_fabricatie() {
        return An_fabricatie;
    }
    public void setAn_fabricatie(int An_fabricatie) {
        this.An_fabricatie = An_fabricatie;
    }
    public String getModel() {
        return Model;
    }
    public void setModel(String Model) {
        this.Model = Model;
    }

    public String toString(){
        return An_fabricatie + " " + Model;
    }

}
