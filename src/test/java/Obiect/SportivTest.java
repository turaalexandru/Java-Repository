package Obiect;

import org.testng.annotations.Test;

public class SportivTest {

    @Test

    public void testMethod() {
        //instantam un obiect de tipul sportiv
        Sportiv Ionut = new Sportiv("Popescu", "Ionut", 28, "M", "Baschet", true);
        Ionut.prezentareSportiv();
        Ionut.varsta = 29;
        Ionut.sportPracticat = "Fotbal";
        Ionut.prezentareSportiv();
        Ionut.verificareVarsta();
        Ionut.marireSalar(90);


        System.out.println("-----------------------------");

        Sportiv Alin = new Sportiv("Popescu", "Alin", 17, "M", "Shaormar", false);
        Alin.prezentareSportiv();
        Alin.verificareVarsta();
        Alin.marireSalar(90);
        Alin.verificareSalar();

        System.out.println("-----------------------------");

        Sportiv Alex = new Sportiv("Tura", "Alexandru", 29, "M", "Shaormar", true, 10000);
        Alex.prezentareSportiv();
        Alex.verificareVarsta();
        Alex.marireSalar(30);
        Alex.verificareSalar();
    }

}
