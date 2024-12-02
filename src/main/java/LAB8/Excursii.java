package LAB8;

public class Excursii {
    int ID_persoana;
    int ID_excursie;
    String Destinatie;
    int An;

    Excursii() {}
    Excursii(int ID_persoana, int ID_excursie, String Destinatie, int An) {
        this.ID_persoana = ID_persoana;
        this.ID_excursie = ID_excursie;
        this.Destinatie = Destinatie;
        this.An = An;
    }
    public int getID_persoana() {
        return ID_persoana;
    }
    public void setID_persoana(int ID_persoana) {
        this.ID_persoana = ID_persoana;
    }
    public int getID_excursie() {
        return ID_excursie;

    }
    public void setID_excursie(int ID_excursie) {
        this.ID_excursie = ID_excursie;
    }
    public String getDestinatie() {
        return Destinatie;
    }
    public void setDestinatie(String Destinatie) {
        this.Destinatie = Destinatie;

    }
    public int getAn() {
        return An;
    }
    public void setAn(int An) {
        this.An = An;
    }

}
