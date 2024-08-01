package abstractizareinterfata;

public abstract class AngajatStudent extends Persoana implements AngajatInterface, StudentInterface {

    public AngajatStudent(String nume, String prenume, Integer varsta, Double inaltime, Character sex) {
        super(nume, prenume, varsta, inaltime, sex);
    }

    @Override
    public void mergeLaServiciu() {

    }

    @Override
    public void desfasurareaActivitatii() {

    }

    @Override
    public void beaCafea() {

    }

    @Override
    public void incheieActivitatea() {

    }

    @Override
    public void mergeLaCursuri() {

    }

    @Override
    public void invata() {

    }

    @Override
    public void daExamen() {

    }

    @Override
    public void primesteNota() {

    }

    @Override
    public void mergeLaRestanta() {

    }

    @Override
    public void mananca() {

    }

    @Override
    public void doarme() {

    }

    @Override
    public void iaPauza() {

    }

    @Override
    public void iaSalar() {

    }
}
