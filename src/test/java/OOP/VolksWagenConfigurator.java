package OOP;

import java.util.List;

public class VolksWagenConfigurator extends MasinaConfigurator {

    public String liniideechipareVW;
    public String motor;
    public String exterior;
    public String vopsea;
    public String roti;
    public List<String> dotarioptionale;


    public VolksWagenConfigurator(String marca, String model, Integer an, Double pretStandard,
    String liniideechipareVW, String motor, String exterior, String vopsea, String roti, List<String> dotarioptionale) {
        super(marca, model, an, pretStandard);
        this.liniideechipareVW=liniideechipareVW;
        this.motor=motor;
        this.exterior=exterior;
        this.vopsea=vopsea;
        this.roti=roti;
        this.dotarioptionale=dotarioptionale;

    }

    public void infoVW() {
        infoMasina();
        System.out.println("Versiune masinii este: " + liniideechipareVW);
        System.out.println("Motorul masinii este: " + motor);
        System.out.println("Culoarea masinii este: " + exterior);
        System.out.println("Vopseaua masinii standard este: " + vopsea);
        System.out.println("Rotile masinii standard sunt: " + roti);


        System.out.println("Dorile optionale ale masinii standard sunt: ");
        for (Integer i=0; i<dotarioptionale.size(); i++)
            System.out.println(dotarioptionale.get(i));

    }

}
