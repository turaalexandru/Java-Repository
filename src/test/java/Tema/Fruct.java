package Tema;

import org.testng.annotations.Test;

public class Fruct {
    public String nume;

    public String culoare;

    public Double greutate;

    public Boolean mergeFacutTuica;

    public Integer pret;

    @Test
    public void metodaFruct() {
        afisareFruct();
        System.out.println("===Al doilea fruct===");
        afisareOriceFruct("pere", "galben", 30.5, true, 20);
        System.out.println("===Al treilea fruct===");
        afisareOriceFruct("prune", "mov", 10.5, true, 15);


    }
     //Facem tema
    public void afisareFruct() {

        nume="Mar";
        culoare="Verde";
        greutate=50.5;
        mergeFacutTuica=true;
        pret=2;
        System.out.println("Numele fructului este: " + nume);
        System.out.println("Culoarea fructului este: " + culoare);
        System.out.println("Greutatea fructului este: " + greutate);
        System.out.println("Se poate face tuica? " + mergeFacutTuica);
        System.out.println("Pretul fructului este: " + pret);
    }

    //Descriem orice fruct

    public void afisareOriceFruct(String nume, String culoare, Double greutate, Boolean mergeFacutTuica, Integer pret)

    {


        System.out.println("Numele fructului este: " + nume);
        System.out.println("Culoarea fructului este: " + culoare);
        System.out.println("Greutatea fructului este: " + greutate);
        System.out.println("Se poate face tuica? " + mergeFacutTuica);
        System.out.println("Pretul fructului este: " + pret);

    }



}
