package Obiect;

import java.util.List;
import java.util.Map;

public class Telefon {

    public String marca;
    public String model;
    public String culoare;
    public String memorie;
    public Integer pret;
    public Map<String, String> specificatiiTehnice;
    public List<String> accesoriiIncluse;
    public Boolean telefonResigilat;
    public String observatiiresigilat;

    public Telefon(String marca, String model, String culoare, String memorie, Integer pret, Map<String, String> specificatiiTehnice, List<String> accesoriiIncluse) {
        this.marca = marca;
        this.model = model;
        this.culoare = culoare;
        this.memorie = memorie;
        this.pret = pret;
        this.specificatiiTehnice = specificatiiTehnice;
        this.accesoriiIncluse = accesoriiIncluse;
    }

    public Telefon(String marca, String model, String culoare, String memorie, Integer pret, Map<String, String> specificatiiTehnice, List<String> accesoriiIncluse, Boolean telefonResigilat, String observatiiresigilat) {
        this.marca = marca;
        this.model = model;
        this.culoare = culoare;
        this.memorie = memorie;
        this.pret = pret;
        this.specificatiiTehnice = specificatiiTehnice;
        this.accesoriiIncluse = accesoriiIncluse;
        this.telefonResigilat = telefonResigilat;
        this.observatiiresigilat = observatiiresigilat;
    }

    public void infoTelefon() {

        System.out.println("Marca telefonului este " + marca);
        System.out.println("Modelul telefonului este " + model);
        System.out.println("Culoarea telefonului este " + culoare);
        System.out.println("Memoria telefonului este " + memorie + " GB");
        System.out.println("Pretul telefonului este " + pret + " RON");

        System.out.println("Specificatiile telefonului sunt: ");

        for (String key : specificatiiTehnice.keySet()) {
            System.out.println(key + " " + specificatiiTehnice.get(key));
        }

        System.out.println("Accesorile din cutie sunt? ");

        for (Integer index = 0; index < accesoriiIncluse.size(); index++) {
            System.out.println(accesoriiIncluse.get(index));

        } if (telefonResigilat){
            System.out.println("Produsul este resigilat: " + observatiiresigilat);
        } else

        {
            System.out.println("Produsul este nou");
        }
    }


}
