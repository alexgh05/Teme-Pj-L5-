package LAB7;


import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Map<Integer,Carte> carti = new HashMap<Integer,Carte>();
        ObjectMapper mapper = new ObjectMapper();
        carti.putAll(mapper.readValue(new File("C:\\Users\\alexg\\IdeaProjects\\LABORATOR5\\src\\main\\resources\\Carti.json"), new TypeReference<Map<Integer,Carte>>(){}));
        int optiune;
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserati nr ul cartii");
        optiune = sc.nextInt();
        switch (optiune) {
            case 1:
                for(Map.Entry<Integer,Carte> carte : carti.entrySet()){
                    System.out.println(carte.getKey() + " " + carte.getValue().getTitlu());
                }
                break;
        }
    }
}
