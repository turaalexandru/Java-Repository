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

    public DaciaConfigurator(String marca, String model, Integer an, Double pretStandard,
                             String versiune, String motor, String culoare, String jante,
                             String interior, String nivelDeDotari, List<String> echipamente, List<String> accesorii) {
        super(marca, model, an, pretStandard);
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




}
