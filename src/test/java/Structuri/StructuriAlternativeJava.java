package Structuri;

import org.testng.annotations.Test;

public class StructuriAlternativeJava {

//Structurile alternative: if..then..else../switch..Case..

    @Test
    public void metodaTest() {
        //verificnrmaimare();
        //verificamnrmaimarev2(11);
        //verificamnrmaimarev2(8);
//        verificamNrPar(7);
//        verificamNrPar(6);
//        verificamNrPar(0);
//        verificamNrPar(-4);
//        verificamNrPar(20);
        zileleSaptamanii(8);


    }

    //verificam daca un numar este mai mare decat 10
    public void verificnrmaimare() {

        if (15 > 10) {
            System.out.println("Numarul este mai mare ca 15");
        } else {
            System.out.println("Numarul nu este mai mare ca 15");
        }
    }

    //verificam daca un numar este mai mare decat 10 - v2
    public void verificamnrmaimarev2(Integer numar) {


        if (numar > 10) {
            System.out.println("Numarul " + numar + " ii mai mare ca 10");
        } else {
            System.out.println("Numarul " + numar + " nu ii mai mare ca 10");
        }

    }

    //verificam dac aun nr este par si pozitiv
    public void verificamNrPar(Integer numarpar) {
        //daca vrem sa luam catul impartirii = /(devide)
        //daca vrem sa luam restul impartirii = %(modulo)
        if (numarpar % 2 == 0) {
            if (numarpar > 0) {
                System.out.println("Numarul este pozitiv " + numarpar + " si par");
            } else if (numarpar < 0) {
                System.out.println("Numarul este negativ " + numarpar + " si par");
            } else {
                System.out.println("Numarul este egal cu 0");
            }
        } else if (numarpar % 2 == 1) {
            if (numarpar > 0) {
                System.out.println("Numarul este pozitiv " + numarpar + " si impar");
            } else {
                System.out.println("Numarul este negativ " + numarpar + " si impar");
            }
        }

    }

    //definim zilele saptamanii
    public void zileleSaptamanii(Integer zi) {
        switch (zi) {
            case 1:
                System.out.println("Astazi este Luni");
                break;
            case 2:
                System.out.println("Astazi este Marti");
                break;
            case 3:
                System.out.println("Astazi este Miercuri");
                break;
            case 4:
                System.out.println("Astazi este Joi");
                break;
            case 5:
                System.out.println("Astazi este Vineri");
                break;
            case 6:
                System.out.println("Astazi este Sambata");
                break;
            case 7:
                System.out.println("Astazi este Duminica");
                break;
            default:
                System.out.println("Valoarea nu este correcta");

        }
    }

}
