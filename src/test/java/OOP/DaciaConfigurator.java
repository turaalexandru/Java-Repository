package OOP;

import java.util.List;

public class DaciaConfigurator extends MasinaConfigurator {


    public String versiune;
    public String motor;
    public String culoare;
    public String jante;
    public String interior;
    public String nivelDeDotari;
    public List<String> echipamente;
    public List<String> accesorii;

    public DaciaConfigurator(String marca, String model, Integer an,
                             String versiune, String motor, String culoare, String jante,
                             String interior, String nivelDeDotari, List<String> echipamente, List<String> accesorii) {
        super(marca, model, an);
        this.versiune = versiune;
        this.motor = motor;
        this.culoare = culoare;
        this.jante = jante;
        this.interior = interior;
        this.nivelDeDotari = nivelDeDotari;
        this.echipamente = echipamente;
        this.accesorii = accesorii;

    }

    public void infoDacia() {
        infoMasina();
        System.out.println("Versiune masinii este: " + versiune);
        System.out.println("Motorul masinii este: " + motor);
        System.out.println("Culoarea masinii este: " + culoare);
        System.out.println("Jantele masinii standard sunt: " + jante);
        System.out.println("Interiorul masinii standard este " + interior);
        System.out.println("Nivel de dotari: " + nivelDeDotari);


        System.out.println("Echipamentele masinii standard sunt: ");
        for (Integer i = 0; i < accesorii.size() - 1; i++)
            System.out.println(accesorii.get(i));

        System.out.println("Accesoriile masinii standard sunt: ");
        for (Integer i = 0; i < echipamente.size() - 1; i++)
            System.out.println(echipamente.get(i));
    }

    public void calculPretStandard() {
        if (model.equals("Logan")) {
            switch (versiune) {
                case "Essential":
                    pretStandard = 13.500;
                    break;
                case "Expression":
                    pretStandard = 14.150;
                    break;
                case "Journey":
                    pretStandard = 15.250;
                    break;
                case "Journey+":
                    pretStandard = 15.700;
                    break;
            }
        } else if (model.equals("Duster")) {
            switch (versiune) {
                case "Essential":
                    pretStandard = 16.000;
                    break;
                case "Comfort":
                    pretStandard = 18.000;
                    break;
                case "Prestige":
                    pretStandard = 20.000;
                    break;
                case "Prestige+":
                    pretStandard = 22.000;
                    break;
            }
        }
        System.out.printf("Pretul standard este: %,.3f \n", pretStandard);
    }

    public void calculPretFinal() {
        double pretOptiuni = 0.000;
        if (model.equals("Logan")) {
            switch (culoare) {
                case "Grey":
                    pretOptiuni += 0.460;
                    break;
                case "Alb":
                    pretOptiuni += 0.000;
                    break;
            }
            switch (jante) {
                case "Standard":
                    pretOptiuni += 2.000;
                    break;
            }
            switch (interior) {
                case "Textil":
                    pretOptiuni += 0.000;
                    break;
            }
        } else if (model.equals("Duster")) {
            switch (culoare) {
                case "Grey":
                    pretOptiuni += 0.500;
                    break;
                case "Negru":
                    pretOptiuni += 5.500;
                    break;

                case "Alb":
                    pretOptiuni += 0.000;
                    break;
            }
            switch (jante) {
                case "Standard":
                    pretOptiuni += 0.500;
                    break;
                case "Expression":
                    pretOptiuni += 2.500;
                    break;
            }
            switch (interior) {
                case "Piele":
                    pretOptiuni += 3.000;
                    break;
                case "Textil":
                    pretOptiuni += 2.000;
                    break;
            }
        }

        // Calculate the cost of optional features
        for (String echipament : echipamente) {
            switch (echipament) {
                case "Pachet Techno":
                    pretOptiuni += 1.600;
                    break;
                case "Pachet Clima":
                    pretOptiuni += 1.200;
                    break;
                case "Pachet Parking":
                    pretOptiuni += 1.500;
                    break;
                case "Pachet Off-Road":
                    pretOptiuni += 1.000;
                    break;
                case "Pachet Confort":
                    pretOptiuni += 1.000;
                    break;
                case "Pachet Siguranta":
                    pretOptiuni += 1.000;
                    break;
            }
        }

        for (String accesoriu : accesorii) {
            switch (accesoriu) {
                case "Tableta":
                    pretOptiuni += 0.800;
                    break;
                case "Scrumiera":
                    pretOptiuni += 1.000;
                    break;
                case "Bare transversale":
                    pretOptiuni += 0.400;
                    break;
                case "Protectie caroserie":
                    pretOptiuni += 0.900;
                    break;
            }
        }

        pretFinal = pretStandard + pretOptiuni;
        System.out.printf("Pretul final este: %,.3f \n", pretFinal);
    }

}
