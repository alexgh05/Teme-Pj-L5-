package LAB6;

import java.time.LocalDate;

public class Angajat {
String Nume;
String Post;
LocalDate Data;
float Salariu;
public Angajat(String Nume, String Post, LocalDate Data, float Salariu) {
    this.Nume = Nume;
    this.Post = Post;
    this.Data = Data;
    this.Salariu = Salariu;
}
public String getNume() {
    return Nume;
}
public void setNume(String Nume) {
    this.Nume = Nume;
}
public String getPost() {
    return Post;
}
public void setPost(String Post) {
    this.Post = Post;
}
public LocalDate getData() {
    return Data;
}
public void setData(LocalDate Data) {
    this.Data = Data;
}
public float getSalariu() {
    return Salariu;
}
public void setSalariu(float salariu) {
    Salariu = salariu;
}

public Angajat(){};

public String toString() {
    return Nume + "," + Post + "," + Data + "," + Salariu+"\n";
}
}
