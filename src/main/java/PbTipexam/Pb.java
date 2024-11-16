package PbTipexam;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Pb {
    static List<Vehicul> get_vehicule()
    {
        List<Vehicul> vehicule = new ArrayList<Vehicul>();
        try {
            Scanner sc = new Scanner(new File("C:\\Users\\alexg\\IdeaProjects\\LABORATOR5\\src\\main\\resources\\Vehicule.csv"));
            while (sc.hasNextLine())
            {
                String line = sc.nextLine();
                String[] parts = line.split("-");
                String model = parts[0];
                int an= Integer.parseInt(parts[1]);
                if(parts[2].equals("c"))
                {
                    Masina masina = new Masina(an, model);
                    vehicule.add(masina);
                }
                else {
                    Motocicleta motocicleta = new Motocicleta(an, model);
                    vehicule.add(motocicleta);
                }
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }



        return vehicule;
    }

    public static void main(String[] args)
    {
        List<Vehicul> Vehicule;
        Vehicule=get_vehicule();

        int optiune;
        Scanner sc = new Scanner(System.in);
        optiune=sc.nextInt();
        switch (optiune)
        {
            case 1:
                for (Vehicul vehicule : Vehicule)
                {
                    System.out.println(vehicule.getModel()+" "+vehicule.getAn_fabricatie()+"\n");
                }
                break;
            case 2:
                Scanner sc1 = new Scanner(System.in);
                String c_b=sc1.nextLine();

                    if(c_b.equals("Masina"))
                    {

                        List<Masina>m=Vehicule.stream().filter(Masina.class::isInstance).map(Masina.class::cast).collect(Collectors.toList());
                        for (Masina masina : m)
                            System.out.println(masina.getAn_fabricatie()+" "+masina.getModel());
                    }
                    else {
                        List<Motocicleta> m = Vehicule.stream().filter(Motocicleta.class::isInstance).map(Motocicleta.class::cast).collect(Collectors.toList());
                    for(Motocicleta motocicleta : m)
                        System.out.print(motocicleta.getModel()+" "+motocicleta.getAn_fabricatie()+"\n");
                    }

                break;
            case 3:
                Scanner sc2 = new Scanner(System.in);
                int an;
               an=is_int();


                    Vehicule.stream().filter(a->a.getAn_fabricatie()>an).collect(Collectors.toList()).forEach(System.out::println);
                break;

        }


    }

    private static int is_int() {
        Scanner sc = new Scanner(System.in);
        float f;
        f = sc.nextFloat();
        int y=0;
        if(f==(int)f) {
            y=(int)f;
        }
        else {
            System.out.println("Not a year");
            is_int();

        }
        return y;
    }
}
