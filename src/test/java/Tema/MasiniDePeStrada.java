package Tema;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class MasiniDePeStrada {


    @Test
    public void MasiniStrada() {

        System.out.println("===Masina: Prius===");

        Map<String, String> prius = new HashMap<>();
        prius.put("Cai putere", "130");
        prius.put("Greutate", "1300");
        prius.put("Combustibil", "Benzina");

        List<String> dotariPrius = new ArrayList<>();
        dotariPrius.add("Xenon");
        dotariPrius.add("Stergatoare Automate");
        dotariPrius.add("Camera Reverse");

//instantam obiectul facut
        Masini Toyota = new Masini("Toyota", "Prius", 2015, "Japonia", "C", 30000, true, 0, prius, dotariPrius);
        Toyota.PrezentareMasini();
        Toyota.anfabricare = 2012;
        Toyota.taradeorigine = "Germania";
        Toyota.PrezentareMasini();
        Toyota.VerificareVarsta();
        Toyota.VerificareBogatie();
        Toyota.IntretinereMarita(10);
        Toyota.VerficiareMasinacuNrDefinitive();
        Toyota.TaxeTVA(19);

        System.out.println("===Masina: Golf===");

        Map<String, String> golf = new HashMap<>();
        golf.put("Cai putere", "180");
        golf.put("Greutate", "1500");
        golf.put("Combustibil", "Motorina");

        List<String> dotarigolf = new ArrayList<>();
        dotarigolf.add("Xenon");
        dotarigolf.add("Stergatoare Automate");
        dotarigolf.add("Camera Reverse");

        Masini VW = new Masini("VW", "Golf", 2020, "Germania", "B", 40000, true, 0, golf, dotarigolf);
        VW.clasademarime = "C";
        VW.PrezentareMasini();
        VW.VerificareVarsta();
        VW.VerificareBogatie();
        VW.IntretinereMarita(30);
        VW.VerficiareMasinacuNrDefinitive();
        VW.TaxeTVA(24);

        System.out.println("===Masina: XC-90===");

        Map<String, String> volvo = new HashMap<>();
        volvo.put("Cai putere", "130");
        volvo.put("Greutate", "1300");
        volvo.put("Combustibil", "Benzina");

        List<String> dotarivolvo= new ArrayList<>();
        dotarivolvo.add("Xenon");
        dotarivolvo.add("Stergatoare Automate");
        dotarivolvo.add("Camera Reverse");

        Masini Volvo = new Masini("Volvo", "XC-90", 2024, "Suedia", "D", 120000, true, 3500, volvo, dotarivolvo);
        Volvo.numerenegre = false;
        Volvo.PrezentareMasini();
        Volvo.VerificareVarsta();
        Volvo.VerificareBogatie();
        Volvo.IntretinereMarita(20);
        Volvo.VerficiareMasinacuNrDefinitive();
        Volvo.TaxeTVA(19);

        System.out.println("===Masina: Sandero===");

        Map<String, String> sandero = new HashMap<>();
        sandero.put("Cai putere", "130");
        sandero.put("Greutate", "1300");
        sandero.put("Combustibil", "Benzina");

        List<String> dotarisandero = new ArrayList<>();
        dotarisandero.add("Xenon");
        dotarisandero.add("Stergatoare Automate");
        dotarisandero.add("Camera Reverse");

        Masini Dacia = new Masini("Dacia", "Sandero", 2024, "Romania", "B", 12000, false, 300, sandero, dotarisandero);
        Dacia.PrezentareMasini();
        Dacia.VerificareVarsta();
        Dacia.VerificareBogatie();
        Dacia.IntretinereMarita(40);
        Dacia.VerficiareMasinacuNrDefinitive();
        Dacia.TaxeTVA(0);

        System.out.println("-----------------------------");


    }


}
