package Exceptii;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptiiConcepte {

    // exceptie = eroare care apare in momentul cand programul ruleaza
    // exceptiile trebuie tratate deoarece pot contine informatii din interior ce pot sa fie exploatate
    // doua tipuri de exceptii: checked si unchecked
    // checked = exceptii ce se trateaza in timpul compilarii
    // checked = acest tip de exceptii mostenesc clasa exception

    //unchecked = exceptii care nu se trateaza in timpul compilarii
    //checked = acest tip de exceptii mostenesc clasa runtimeexception

    //exista 2 keywords pentru tratarea exceptiilor: throw si throws
    //throw = folosit sa arunce explicit o exceptie/este regasit in interiorul unei metode
    //throws = folosit in semnatura metodei ca sa declare ca o metoda poate arunca o exceptie
    //de cele mai multe exceptiile se trateaza folosind o structura try...catch...finally

    // incercam sa citim continutul dintr-un fisier

    public void checkedExceptionExample(){
        File file = new File("C://Proba.txt");
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            System.out.println("A intrat pe clauza de catch! Fisierul nu exista");
        }
        finally {
            System.out.println("A intrat pe clauza de finally! Indiferent daca a mers sau nu pe catch, tot apeleaza si finally");
        }
    }

    public void uncheckedExceptionExample(){
        Integer[] multimi = new Integer[2];
        multimi[0] = 15;
        multimi[1] = 30;
        multimi[2] = 40;

        System.out.println(multimi[2]);
    }

    public void throwExceptionExample(Integer varsta){
        if (varsta<18) {
            throw new RuntimeException("Nu iti dau tigari");
        }
        else {
            System.out.println("Persoana poate primi tigari");
        }
    }

    public void throwsExceptionExample() throws FileNotFoundException {
        File file = new File("C://Proba.txt");
        FileInputStream fileInputStream = new FileInputStream(file);
    }
}
