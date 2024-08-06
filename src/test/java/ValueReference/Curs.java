package ValueReference;

public class Curs {

    private String descriere;
    private String titlu;
    private Integer nrCursantl;

    public Curs(String descriere, String titlu, Integer nrCursantl) {
        this.descriere = descriere;
        this.titlu = titlu;
        this.nrCursantl = nrCursantl;
    }

    public String getDescriere() {
        return descriere;
    }

    public void setDescriere(String descriere) {
        this.descriere = descriere;
    }

    public String getTitlu() {
        return titlu;
    }

    public void setTitlu(String titlu) {
        this.titlu = titlu;
    }

    public Integer getNrCursantl() {
        return nrCursantl;
    }

    public void setNrCursantl(Integer nrCursantl) {
        this.nrCursantl = nrCursantl;
    }

    public void prezentareCurs () {
        System.out.println("Descriere este: " +descriere);
        System.out.println("Titlu este: " +titlu);
        System.out.println("Numarul de cursant este: " +nrCursantl);
    }
}
