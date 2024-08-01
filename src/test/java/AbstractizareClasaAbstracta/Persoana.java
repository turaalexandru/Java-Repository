package AbstractizareClasaAbstracta;

public abstract class Persoana {

    //recunoastem o clasa abstracta dupa cuvantul abstract
    //clasa abstracta poate sau nu contina metode abstracte
    //intr-o clasa abstracta putem avea un constructor --> nu putem face un obiect din clasa abstracta
    //o clasa poate mosteni o singura clasa/clasa abstracta
    //o clasa abstracta poate implemnta o interfata una sau mai multe interfete
    //intr-o clasa abstracta putem avea metode void sau return
    //metodele abstracte dintr-o clasa abstracta trebuie sa aibe access control
    private String nume;
    private String prenume;
    private Integer varsta;
    private Double inaltime;
    private Character sex;

    public abstract void mananca();
    public abstract void doarme();
    public abstract void iaPauza();
    public abstract void iaSalar();
    public abstract void mergeLaServiciu();
    public abstract void desfasurareaActivitatii();
    public abstract void beaCafea();
    public abstract void incheieActivitatea();
    public abstract void cautDeLucru();
    public abstract void depuneCv();
    public abstract void staAcasa();
    public abstract void mergeLaCursuri();
    public abstract void invata();
    public abstract void daExamen();
    public abstract void primesteNota();
    public abstract void mergeLaRestanta();
    

    public Persoana(String nume, String prenume, Integer varsta, Double inaltime, Character sex) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
        this.inaltime = inaltime;
        this.sex = sex;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public Integer getVarsta() {
        return varsta;
    }

    public void setVarsta(Integer varsta) {
        this.varsta = varsta;
    }

    public Double getInaltime() {
        return inaltime;
    }

    public void setInaltime(Double inaltime) {
        this.inaltime = inaltime;
    }

    public Character getSex() {
        return sex;
    }

    public void setSex(Character sex) {
        this.sex = sex;
    }
}
