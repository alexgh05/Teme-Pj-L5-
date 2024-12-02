package LAB8;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class pb {
    public static void main(String[] args) {
        List<Persoane> persoane = new ArrayList<Persoane>();
        List<Excursii> excursii= new ArrayList<Excursii>();
        int opt=-1;
        while (opt!=0)
        {
            Scanner sc1 = new Scanner(System.in);
            System.out.println("Enter optiune: ");
            opt = sc1.nextInt();
            switch (opt)
            {

                case 1:

                    String nume;
                    System.out.print("Enter nume: ");
                    Scanner sc = new Scanner(System.in);
                    nume = sc.nextLine();
                    int ID;
                    System.out.print("Enter ID: ");
                    ID = sc.nextInt();
                    int Varsta;
                    System.out.print("Enter Varsta: ");
                    Varsta = sc.nextInt();
                    Persoane persoane1=new Persoane(ID,nume,Varsta);
                    persoane.add(persoane1);
                    break;

                case 2:
                        String destinatie;
                        System.out.print("Enter destinatie: ");
                        Scanner sc2 = new Scanner(System.in);
                        destinatie = sc2.nextLine();
                        int ID_excursie;
                        System.out.print("Enter ID_excursie: ");
                        ID_excursie = sc2.nextInt();
                        int ID_persoana;
                        System.out.print("Enter ID_persoana: ");
                        ID_persoana = sc2.nextInt();
                        int an;
                        System.out.print("Enter an: ");
                        an = sc2.nextInt();
                        for(Persoane p:persoane)
                        {
                            if (p.ID==ID_persoana)
                            {}
                            else {
                                System.out.print("Persoana nu exista");
                                break;
                            }
                        }
                        Excursii ex=new Excursii(ID_persoana, ID_excursie, destinatie, an);
                        break;

                case 3:

                    persoane.forEach(System.out::println);


                            break;
            }
        }
    }
}
