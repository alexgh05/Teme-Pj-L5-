package PbTipexam;

import java.time.LocalDateTime;
import java.util.Date;

public class Motocicleta extends Vehicul {

public Motocicleta() {}

    public Motocicleta(int an,String model)
    {
        super(an,model);
    }
    public int get_vechime()
    {
        LocalDateTime data;
        data= LocalDateTime.now();
        int vehcime;
                vehcime=data.getYear()-  super.getAn_fabricatie();

                return vehcime;
    }
}
