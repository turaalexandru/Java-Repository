package variabilaMetoda;

import org.testng.annotations.Test;

public class Masina {
    public String marca;

    public String modelMasina;

    public Double greutate;

    public Integer pret;

    public Boolean esteDecapotabila;

    public Integer an;





    @Test
    public void metodaTest(){
        afisareMasina();
        System.out.println("===Exemplu orice masina===");
        descriemOriceMasina("Dacia","Golan",950.5,1000, false, 2005);
        System.out.println("===Exemplu la alta masina===");
        descriemOriceMasina("Lada", "Niva", 800.1, 50, true, 1950);

    }

    //Descriem o masina

    public void afisareMasina(){
        marca="Toyota";
        modelMasina = "Avensis";
        pret=3200;
        an=2005;
        esteDecapotabila=true;
        greutate=1500.0;
        System.out.println("Marca masinii este: " + marca);
        System.out.println("Modelul masinii este: " + modelMasina);
        System.out.println(" Greutatea masinii este" + greutate);
        System.out.println("Pretul maisnii este: "+ pret);
        System.out.println("Este masina decapotabila" + esteDecapotabila);
        System.out.println("Anul masinii este" + an);

    }

    //Descriem orice masina

    public void descriemOriceMasina(String marca, String modelMasina, Double greutate, Integer pret, Boolean esteDecapotabila, Integer an){
        System.out.println("Marca masinii este: " + marca);
        System.out.println("Modelul masinii este: " + modelMasina);
        System.out.println(" Greutatea masinii este: " + greutate);
        System.out.println("Pretul maisnii este: "+ pret);
        System.out.println("Este masina decapotabila " + esteDecapotabila);
        System.out.println("Anul masinii este " + an);
    }

}
