package UF4.HerenciaSimpleActivitat;

public class Persona {
    private int id;
    private int edat;
    private String nom;

    public Persona() {
    }

    public Persona(int sid, int sedat, String sNom) {
        this.id = sid;
        this.edat = sedat;
        this.nom = sNom;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setEdat(int edat) {
        this.edat = edat;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setCognom(String cognom) {
        Cognom = cognom;
    }

    public void setAdreca(String adreca) {
        this.adreca = adreca;
    }

    public int getId() {
        return id;
    }

    public int getEdat() {
        return edat;
    }

    public String getNom() {
        return nom;
    }

    public String getCognom() {
        return Cognom;
    }

    public String getAdreca() {
        return adreca;
    }

    private String Cognom;
    private String adreca;

    public void visualitzar() {
        System.out.println("Hola, aqui tienes todas los informaciones");
            System.out.println("Id...........:" + id);
            System.out.println("Nom...........:" + nom);
            System.out.println("Edat..........:" + edat);
    }
}


