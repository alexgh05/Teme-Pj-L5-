package LAB7;

import Tema.PerecheNumere;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;

public class PbTipExamen {

    public static void main(String[] args) throws FileNotFoundException {
        List<Publicatie> publicatie = new Vector<>();
        Scanner sc = null;
        try {
            sc = new Scanner(new File("C:\\Users\\alexg\\IdeaProjects\\LABORATOR5\\src\\main\\resources\\Detalii.csv"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            String[] tokens = line.split("-");
            String Titlu = tokens[1];
            String Autor = tokens[2];
            int c= Integer.parseInt(tokens[4]);
            int An = Integer.parseInt(tokens[0]);
            if(tokens[3]=="r")
            {
                Revista revista = new Revista(c,Titlu,Autor,An);
                publicatie.add(revista);
            }
            else
            {
                Carte carte = new Carte(c,Titlu,Autor,An);
                publicatie.add(carte);
            }

        }
        for (Publicatie p : publicatie) {
            System.out.println(p.toString());
        }



    }
}
