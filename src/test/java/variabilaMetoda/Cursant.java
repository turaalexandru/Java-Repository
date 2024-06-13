package variabilaMetoda;

import org.testng.annotations.Test;

public class Cursant {

    //asta e un comentariu
    //recunoastem o clasa intr-un fisier Java (cursat.java) dupa cuvnatul cheie class
    //intr-un fisier Java putem aveam o multime de clase pe care le deferentiem prin numele lor
    //nu este un practice bun in Java sa avem intr-un fisier mai multe clase
    //in fiecare clasa trebuie sa definim un nume
    //intelegem printr-o clasa ca fiind un sablon specific din viata reala
    //intr-o clasa definim varibile si metode
    //variabila=proprietatea unei clase
    //intr-o clasa putem avea o multime de variabile
    //variabilele se diferentiaza prin tip si nume
    //variabilele pot sa fie de 2 feluri: global si local
    //variabila globala = proprietate vizibila oriunde in cod
    //variabila locala = proprietate vizibila doar in locul definit
    //tipuri de date: string, integer, double/float, character, boolean(raspuns cu true/false)
    //integer, double(64 bit)/float(32 biti) ocupa trei tipuri de memorie

    public String nume;
    public String prenume;
    public Integer varsta;
    public String adresa;
    public Double inaltime;
    public Float greutate;
    public Character tipSex;
    public Boolean areRestnate;


    //metoda=actiunea unei clase
    //intr-o clasa putem avea o multime de metode diferentiate prin numele acestora
    //exista doua tipuri de metode: void si return
    //metoda void=actiune pe care vrem sa o afisam/interpretam fara a fi nevoie sa o interpretam
    //pentru o metoda trebuie sa specificam un access control public (public), () si {}

    @Test
    public void metodaTest() {
        descriereCursant();
        primesteBursa();
    }

    public void primesteBursa () {
        Integer bursa=1000;
        System.out.println("Bursa cursantului este: " +bursa);
    }

    public void descriereCursant () {
        nume = "Alex";
        prenume = "Alejandro";
        varsta = 36;
        adresa = "prin Iasi nr 25";
        inaltime = 1.75;
        greutate = 83.00f;
        tipSex = 'M';
        areRestnate = true;

        System.out.println("numele cursantului: " + nume + ".");//concatenam valorile
        System.out.println("prenumele cursantului: " + prenume + ".");
        System.out.println("inaintarea in varsta: " + varsta + ".");
        System.out.println("inaltime: " + inaltime + ".");
        System.out.println("greutatea: " + greutate + ".");
        System.out.println("masculin/feminin: " + tipSex + ".");
        System.out.println("restant? " + areRestnate + ".");



    }


}