package LAB7;

public class Publicatie {
    String Titlu;
    String Autor;
    int an_publicatie;
    public Publicatie() {}
    public Publicatie(String Titlu, String Autor, int an_publicatie) {
        this.Titlu = Titlu;
        this.Autor = Autor;
        this.an_publicatie = an_publicatie;
    }
    public String getTitlu() {
        return Titlu;
    }
    public void setTitlu(String Titlu) {
        this.Titlu = Titlu;

    }
    public String getAutor() {
        return Autor;
    }
    public void setAutor(String Autor) {
        this.Autor = Autor;
    }
    public int getAn_publicatie() {
        return an_publicatie;
    }
    public void setAn_publicatie(int an_publicatie) {
        this.an_publicatie = an_publicatie;
    }
    public String toString() {
        return "  an  "+an_publicatie+"   Titlu "+Titlu+"   Autor "+Autor;
    }

}
