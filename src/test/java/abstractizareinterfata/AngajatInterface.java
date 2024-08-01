package abstractizareinterfata;

public interface AngajatInterface extends CommenInterface{
    //recunoastem intr-un fisier Java o interfata dupa cuvantul interface
    //o interfata contine numai metode abstracte (metode ce nu au body)
    //toate metodele dintr-o interfata sunt bydefault publice
    //intr-o interfata putem avea atat metode void cat si return
    //o interfata nu poate contine un constructor
    //dintr-o interfata nu putem sa facem un obiect
    //o interfata se implementeaza
    //clasa care implementeaza interfata, trebuie sa implementeze, toate metodele abstracte din interfata
    //o clasa poate implementa mai multe interfata
    // o interfata poate mosteni o alta interfata

    void mergeLaServiciu();
    void desfasurareaActivitatii();
    void beaCafea();
    void incheieActivitatea();

}
