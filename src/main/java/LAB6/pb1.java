package LAB6;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class pb1 {

    public static void main(String[] args) throws JsonProcessingException {

        List<Angajat>Angajati=new ArrayList<Angajat>();
        String filename="src/main/resources/Angajati.json";
        ObjectMapper mapper=new ObjectMapper();

        mapper.registerModule(new JavaTimeModule());
        mapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
        try {
            Angajati=mapper.readValue(new File(filename),new TypeReference<List<Angajat>>(){});
        } catch (IOException e) {
            throw new RuntimeException(e);

        }
        int opt;
        int currentYear= LocalDate.now().getYear();
        Scanner sc=new Scanner(System.in);
        opt=sc.nextInt();
        switch (opt)
        {

            case 1:
                System.out.print(Angajati.toString());
                break;

            case 2:
                Angajati.stream().filter(a->a.getSalariu()>2500).forEach(System.out::println);
                break;
            case 3:
                List<Angajat>Sefi=new ArrayList<>();
                Sefi=Angajati.stream().filter(a->a.getData().getYear()==currentYear-1).filter(a->a.getData().getMonth()== Month.APRIL)
                        .filter(a->a.getPost().contains("sef")||a.getPost().contains("director")).collect(Collectors.toList());
                System.out.println(Sefi);
                break;
            case 4:
                Angajati.stream().filter(a->!a.getPost().contains("sef")||!a.getPost().contains("director")).sorted(Comparator.comparing(Angajat::getSalariu)).forEach(System.out::println);
                break;
            case 5:
                    Angajati.stream().map(a->a.getNume().toUpperCase()).forEach(System.out::println);
                    break;
            case 6:
                Angajati.stream().map(Angajat::getSalariu).filter(sal->sal<3000).forEach(System.out::println);
                break;
        }
    }
}
