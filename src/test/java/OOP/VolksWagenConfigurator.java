package OOP;

import java.util.List;

public class VolksWagenConfigurator extends MasinaConfigurator {

    public String liniideechipareVW;
    public String motor;
    public String exterior;
    public String vopsea;
    public String roti;
    public List<String> dotarioptionale;


    public VolksWagenConfigurator(String marca, String model, Integer an,
    String liniideechipareVW, String motor, String exterior, String vopsea, String roti, List<String> dotarioptionale) {
        super(marca, model, an);
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

    public void calculPretStandard() {
        if (model.equals("Golf")) {
            switch (liniideechipareVW) {
                case "Trendline":
                    pretStandard = 22.000;
                    break;
                case "Comfortline":
                    pretStandard = 25.000;
                    break;
                case "Highline":
                    pretStandard = 28.000;
                    break;
            }
        } else if (model.equals("Polo")) {
            switch (liniideechipareVW) {
                case "Trendline":
                    pretStandard = 18.000;
                    break;
                case "Comfortline":
                    pretStandard = 20.000;
                    break;
                case "Highline":
                    pretStandard = 23.000;
                    break;
            }
        }
        System.out.printf("Pretul standard este: %,.3f \n", pretStandard);
    }

    public void calculPretFinal() {
        double pretOptiuni = 0.000;
        if (model.equals("Golf")) {
            switch (vopsea) {
                case "Metalizat":
                    pretOptiuni += 0.500;
                    break;
                case "Standard":
                    pretOptiuni += 0.000;
                    break;
            }
            switch (roti) {
                case "18 inch":
                    pretOptiuni += 2.000;
                    break;
                case "16 inch":
                    pretOptiuni += 1.000;
                    break;
            }
        } else if (model.equals("Polo")) {
            switch (vopsea) {
                case "Metalizat":
                    pretOptiuni += 0.500;
                    break;
                case "Standard":
                    pretOptiuni += 0.000;
                    break;
            }
            switch (roti) {
                case "16 inch":
                    pretOptiuni += 1.500;
                    break;
                case "14 inch":
                    pretOptiuni += 1.000;
                    break;
            }
        }

        // Calculate the cost of optional features
        for (String dotare : dotarioptionale) {
            switch (dotare) {
                case "Navigatie":
                    pretOptiuni += 0.600;
                    break;
                case "Pachet Confort":
                    pretOptiuni += 1.200;
                    break;
                case "Pachet Sport":
                    pretOptiuni += 1.500;
                    break;
                case "Pachet City":
                    pretOptiuni += 1.000;
                    break;
            }
        }

        pretFinal = pretStandard + pretOptiuni;
        System.out.printf("Pretul final este: %,.3f \n", pretFinal);
    }

}
