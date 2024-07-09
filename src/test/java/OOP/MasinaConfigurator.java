package OOP;

public class MasinaConfigurator {

    public String marca;
    public String model;
    public Integer an;
    public Double pretStandard;

    public MasinaConfigurator(String marca, String model, Integer an, Double pretStandard) {
        this.marca = marca;
        this.model = model;
        this.an = an;
        this.pretStandard = pretStandard;
    }

    //OOP=programare orientata pe obiecte
    //OOP=4 principiii -> mosternire, incapsulare, polimerfism, abstractizare
    //Mostenire: = conceptul prin care o clasa mosteneste o alta clasa
    //clasa care este mostenita=parina
    //clasa care mosteneste=copil
    //in java, putem mosteni o singura clasa
    //cand copilul mosteneste parintele, copilul trebuie sa apeleze cosntructorul din parinte
    //copilul va avea access la proprietatile/metodele din clasa parintele(daca se folseste public/protected/default)
    //ca sa apelam constructorul din parinte in copil se foloseste cuvantul super

    public void infoMasina () {
        System.out.println("Marca masinii este: " +marca);
    System.out.println("Modelul masinii este: " + model);
    System.out.println("Anul masinii este: " + an);
    System.out.println("Pretul standard este: " + pretStandard);
  }

}
