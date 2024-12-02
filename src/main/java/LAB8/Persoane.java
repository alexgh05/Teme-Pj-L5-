package LAB8;

public class Persoane {
    int ID;
    String Nume;
    int Varsta;
    Persoane(){}
    Persoane(int ID, String Nume, int Varsta) {
        this.ID = ID;
        this.Nume = Nume;
        this.Varsta = Varsta;
    }
    public int getID() {
        return ID;
    }
    public void setID(int ID) {
        this.ID = ID;
    }
    public String getNume() {
        return Nume;
    }
    public void setNume(String Nume) {
        this.Nume = Nume;
    }
    public int getVarsta() {
        return Varsta;
    }
    public void setVarsta(int Varsta) {
        this.Varsta = Varsta;
    }

}
