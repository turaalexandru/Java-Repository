package Tema;

import java.util.List;
import java.util.Map;

public class Masini {

    public String marca;
    public String model;
    public Integer anfabricare;
    public String taradeorigine;
    public String clasademarime;
    public Integer costachizitie;
    public Boolean numerenegre;
    public Integer costintretinere;
    public Map <String, String> specificatiiTehnice;
    public List <String> dotari;

    //Constructor


    public Masini(String marca, String model, Integer anfabricare, String taradeorigine, String clasademarime,
                  Integer costachizitie, Boolean numerenegre, Map<String, String> prius, List<String> dotariPrius) {
        this.marca = marca;
        this.model = model;
        this.anfabricare = anfabricare;
        this.taradeorigine = taradeorigine;
        this.clasademarime = clasademarime;
        this.costachizitie = costachizitie;
        this.numerenegre = numerenegre;
    }

    //Constructorul 2

    public Masini(String marca, String model, Integer anfabricare, String taradeorigine, String clasademarime, Integer costachizitie, Boolean numerenegre, Integer costintretinere) {
        this.marca = marca;
        this.model = model;
        this.anfabricare = anfabricare;
        this.taradeorigine = taradeorigine;
        this.clasademarime = clasademarime;
        this.costachizitie = costachizitie;
        this.numerenegre = numerenegre;
        this.costintretinere = costintretinere;
    }

    //Constructorul 3

    public Masini(String marca, String model, Integer anfabricare, String taradeorigine, String clasademarime, Integer costachizitie, Boolean numerenegre, Integer costintretinere, Map<String, String> specificatiiTehnice, List<String> dotari) {
        this.marca = marca;
        this.model = model;
        this.anfabricare = anfabricare;
        this.taradeorigine = taradeorigine;
        this.clasademarime = clasademarime;
        this.costachizitie = costachizitie;
        this.numerenegre = numerenegre;
        this.costintretinere = costintretinere;
        this.specificatiiTehnice = specificatiiTehnice;
        this.dotari = dotari;
    }


    //masini intalnite pe strada

    public void PrezentareMasini() {
        System.out.println("Marca masinii este: " + marca);
        System.out.println("Modelul masinii este: " + model);
        System.out.println("Masina este fabricata in anul: " + anfabricare);
        System.out.println("Tara de origine a masinii este: " + taradeorigine);
        System.out.println("Clasa masinii este: " + clasademarime);
        System.out.println("Costul de achizitie: " + costachizitie);
        System.out.println("Avem numele negre la masina? " + numerenegre);
        if (costintretinere != null) {
            System.out.println("Costul de intretinere a masinii este:  " + costintretinere);
        }

        System.out.println("Specificatiile masinii sunt: ");
        if (specificatiiTehnice != null) {
            for (String key : specificatiiTehnice.keySet()) {
                System.out.println(key + ": " + specificatiiTehnice.get(key));
            }
        } else {
            System.out.println("Nu există specificații tehnice disponibile.");
        }

        System.out.println("dotarile masinii sunt: ");
        if (dotari != null) {
            for (String dotare : dotari) {
                System.out.println(dotare);
            }
        } else {
            System.out.println("Nu există dotări disponibile.");
        }
    }


    public void VerificareVarsta() {
        if (anfabricare >= 2020) {
            System.out.println("Masina este noua");
        } else {
            System.out.println("Masina este un harb");
        }
    }

    public void VerificareBogatie() {
        if (costachizitie >= 50000) {
            System.out.println("Masina este de boher");
        } else {
            System.out.println("Masina este de sarakie");
        }
    }

    public void IntretinereMarita(Integer procent) {
        if (costintretinere != null) {
            Integer marire = (costintretinere * procent) / 100;
            costintretinere = costintretinere + marire;
            System.out.println("Noul cost de intretinere este:" + costintretinere);
        } else {
            System.out.println("Masina nu are costuri de intretinere");
        }

    }

    public void TaxeTVA(Integer procentaj) {
        if (costachizitie != null) {
            Integer taxe = (costachizitie * procentaj) / 100;
            Integer costtotal = costachizitie + taxe;
            System.out.println("TVA-ul este:" + taxe);
            System.out.println("Costul total de achizitie este: " + costtotal);
        } else {
            System.out.println("Costul de achizitie nu este setat.");
        }

    }

    public void VerficiareMasinacuNrDefinitive () {
        if ( numerenegre != false) {
        System.out.println("Masina are numere negre");
        } else {
            System.out.println("Masina are numere rosii");
        }
    }


}
