package LAB7;

public class Revista extends Publicatie {
    int nr_exemplare;

    Revista(){}
    Revista(int nr_exemplare,String Titlu,String Autor,int data) {
        super(Titlu,Autor,data);
        this.nr_exemplare = nr_exemplare;
    }

    int getNr_exemplare() {
        return nr_exemplare;
    }
    void setNr_exemplare(int nr_exemplare) {
        this.nr_exemplare = nr_exemplare;
    }
    public String toString(){
        return "Nr Exemplare "+nr_exemplare + super.toString();
    }
}
