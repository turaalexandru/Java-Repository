package Obiect;

public class Sportiv {

    //programare orientata obiect se bazeaza pe interactiunea cu obiecte
    //obiect = instanta unei clase
    //putem defini un obiect doar daca avem un constructor
    //constructorul = are ca rol sa initializeze atributele unei clase
    //intr-o clasa recunoastem un constructor dupa numele acesteia
    //constructorul este de cele mai multe ori public
    //intr-o clasa pot sa fie mai multi constructori diferentiati dupa numarul sau tipul de parametri
    //intr-o clasa avem un constructor by default fara parametri
    //in momentul cand se defineste un obiect, se apeleaza constructorul din clasa
    //dintr-o clasa putem defini mai multe obiecte
    //obiectele se diferentiaza prin nume si valorile date
    //un obiect se instanteaza folosind cuvantul "new"
    //Un obiect se poate defini in orice clasa din orice pachet
    //In momentul in care instantam un obiect putem avea acces la toate variabilele/metodele din clasa

    public String nume;
    public String prenume;
    public Integer varsta;
    public String sex;
    public String sportPracticat;
    public Boolean teamEvent;
    public Integer salar;

    //Constructor
    //se poate face prin generate - click dreapta - generate - constructor - select all


    public Sportiv(String nume, String prenume, Integer varsta, String sex, String sportPracticat, Boolean teamEvent)
    {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
        this.sex = sex;
        this.sportPracticat = sportPracticat;
        this.teamEvent = teamEvent;
    }

    public Sportiv(String nume, String prenume, Integer varsta, String sex, String sportPracticat, Boolean teamEvent, Integer salar) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
        this.sex = sex;
        this.sportPracticat = sportPracticat;
        this.teamEvent = teamEvent;
        this.salar = salar;
    }

    public void prezentareSportiv() {
        System.out.println("Numele sportivului este " + nume);
        System.out.println("Prenumele sportivului este " + prenume);
        System.out.println("Varsta sportivului este " + varsta + " ani");
        System.out.println("Sexul sportivului este " + sex);
        System.out.println("Sportul practicat este " + sportPracticat);
        System.out.println("Este sportivul practicant de sport de echipa? " + teamEvent);
        if (salar != null){
            System.out.println("Salarul sportivului este " +salar);
        }
    }

    public void verificareVarsta() {
        if (varsta >= 18) {
            System.out.println("Sportivul este major");
        } else {
            System.out.println("Sportivul este minor");
        }
    }

    public void verificareSalar() {
        if (salar != null && salar >= 10000) {
            System.out.println("Sportivul este bogat");
        } else {
            System.out.println("Sportivul este sarac");
        }
    }

    public void marireSalar(Integer procent) {
        if (salar != null){
            Integer marire = (salar * procent)/100;
            salar = salar + marire;
            System.out.println("Noul salar este " + salar);
        } else {
            System.out.println("Sportivul nu are salar");
        }
    }
}
