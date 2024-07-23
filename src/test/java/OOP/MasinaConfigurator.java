package OOP;

public class MasinaConfigurator {

    private String marca;
    private String model;
    private Integer an;
    private Double pretStandard;
    private Double pretFinal;

    public MasinaConfigurator(String marca, String model, Integer an) {
        this.marca = marca;
        this.model = model;
        this.an = an;

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

    //incapsulare=conceptul prin care putem sa setam anumite restrictii de vizibilitate pentru proprietati/metode
    //polimorfism = conceptul prin care o metoda poate avea implementari diferite
    //polimorfismul poate fi de doua feluri = dinamic(override) si static (overload)
    //polimorfism dinamic : intr-o ierarhie de clase obtinute prin mostenire, o metoda poate avea implementari diferite

    //polimorfismul dinamic poate fi prezent doar la mostenire
    //polimorfismul static: daca avem nevoie ca o metoda sa fie folosita in diferite circumstante,
    //putem defini mai multe metode cu acelasi nume avand un nr de parametri/tip parametri diferiti

    public void infoMasina() {
        System.out.println("Marca masinii este: " + marca);
        System.out.println("Modelul masinii este: " + model);
        System.out.println("Anul masinii este: " + an);
    }

    //polimorfism dinamic
    public void pornesteMotor (){

        System.out.println("Masina porneste doar cu cheia");
    }

    public void promotieDacia () {
        System.out.println("Pentru luna Iulie, Dacia nu are promotie");
    }

    public void promotieDacia (String ticket) {
        System.out.println("Daca ai " + ticket + " primesti reducere");
    }

    public void promotieDacia (int reducere) {
        System.out.println("Aparent,in Decembrie primesti reducere" + reducere);
    }

    public Double getPretStandard() {
        return pretStandard;
    }

    public String getMarca() {
        return marca;
    }

    public String getModel() {
        return model;
    }

    public Integer getAn() {
        return an;
    }

    public Double getPretFinal() {
        return pretFinal;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setAn(Integer an) {
        this.an = an;
    }

    public void setPretStandard(Double pretStandard) {
        this.pretStandard = pretStandard;
    }

    public void setPretFinal(Double pretFinal) {
        this.pretFinal = pretFinal;
    }
}
