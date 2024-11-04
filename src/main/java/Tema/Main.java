package Tema;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;


import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {



    public static void scriere(List<PerecheNumere>lista) {
        try{
            ObjectMapper mapper = new ObjectMapper();
            File file = new File("C:/Users/alexg/Desktop/scriere.json");
            mapper.writeValue(file,lista);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<PerecheNumere> citire() throws IOException {
        File file = new File("C:/Users/alexg/Desktop/citire.json");
        ObjectMapper mapper = new ObjectMapper();
        List<PerecheNumere> numere=new ArrayList<>();
        numere=mapper.readValue(file, new TypeReference<List<PerecheNumere>>(){});
        return numere;
    }

    public static void main(String[] args) {
        List<PerecheNumere>Numere;


    }
}
