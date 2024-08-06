package ValueReference;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class ValueReferenceTest {

    //Primitive - int, double, float, char, boolean, long
    //Non - primitive (referinta) - string, object, array,
    //Static - valoare care se pastreaza pentru toate instantele din clasa
    //Final - defineste o constanta care nu isi poate modifica valoarea initiala
    //Wrapper class - constructie de clasa care este facut pe baza unui tip de data primitiva (int- Int)

    public int originalInt = 10;
    public String originalString = "AltExemplu";
    public Curs cursTestare = new Curs("Curs testare automata", "Testare Automata", 1);
    public final int nrCursanti = 16;
    public Integer defaultWrapper;
    public int defaultInt;

    @Test
    public void metodaTest(){
        System.out.println("1. Value type:");
        valueTypeExample(originalInt);
        System.out.println("Valoarea initiala este: " + originalInt);

        System.out.println("2. Reference type: ");
        referenceTypeStringExample(originalString);
        System.out.println("Valoarea initiala este:" + originalString);

        System.out.println("3. Reference TYPE Object");
        referenceTypeObjectExample(cursTestare);
        System.out.println("Valoarea initiala este: ");
        cursTestare.prezentareCurs();

        System.out.println("4. Constant TYPE");
        //nrCursanti = nrCursanti + 10;

        System.out.println("5. Value type/wrapper class");
        defaultValue();
    }

    public void valueTypeExample(int value) {
        value = value + 5;
        System.out.println("Valoarea noua este:" + value);
    }

    public void referenceTypeStringExample (String value){
        value = value + "exemplu";
        System.out.println("Valoarea noua este:" + value);
    }

    public void referenceTypeObjectExample (Curs Object) {
        Object.prezentareCurs();
        Object.setTitlu("Testare Manuala");
        Object.prezentareCurs();
    }

    public void defaultValue() {
        System.out.println(defaultWrapper);
        System.out.println(defaultInt);

        Integer[] Array = new Integer[5];
        List<Integer> list = new ArrayList<>();
    }
}
