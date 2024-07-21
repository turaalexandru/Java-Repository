package accessControlPart1;

public class Caine {

    //public - este un tip de access control ce face publica informatia in toate pachetele
    //private - este un tip de access control ce face informatia privata in clasa curenta
    //default - este un alt tip de access control ce face vizibila informatia doar in pachetul respectiv daca vorbim
    // despre mostenire/creare obiect
    //protected este un tip de access control unde informatia este protejata in pachetul respectiv,
    // daca vorbim de mostenire/creare de obiect
    //daca iesim din pachet vizibilitatea lui este prezenta doar daca vorbim de mostenire

    public void metodaPublica () {

    }

    private void metodaPrivata () {

    }

    protected void metodaProtedtec () {

    }

    void metodaDefault () {

    }
}
