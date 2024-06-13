package Structuri;

import org.testng.annotations.Test;

public class StructuriRepetitive {

    //Structuri repetitive = for, while, for each
    @Test
    public void testMethod() {
        //afisareNrFor();
        //afisareNrWhile();
        afisamNrPar();
    }

    //afisam numelerele pana la 15
    public void afisareNrFor() {
        for (Integer index = 0; index <= 15; index++) {
            //index++ va lua valoarea initiala si va adauga unu la valoare
            System.out.println(index);
        }
    }

    public void afisareNrWhile() {
        Integer index = 0;
        while (index <= 15) {
            System.out.println(index);
            index++;
        }
    }

    //afisam numele pare de la 0 la 20

    public void afisamNrPar() {
        for (Integer index = 0; index <= 20; index++) {
            if (index % 2 == 1) {
                System.out.println("Numarul " + index + " este impar.");
            } else {
                System.out.println("Numarul " + index + " este par.");
            }
        }
    }
}
