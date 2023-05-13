package UF4.HerenciaSimpleActivitat;

public class Estudiant {
    private String curs;
    private String asugnaturas;
    private String escola;
    private double[] notes;

    public Estudiant() {
    }
    public Estudiant(String scurs,String sasugnaturas,String sEscola,double[] snotes) {
        this.curs = scurs;
        this.asugnaturas = sasugnaturas;
        this.escola = sEscola;
        this.notes = snotes;
    }

    public void visualitzar() {
            System.out.println("Curs...........:" + curs);
            System.out.println("Asugnaturas...........:" + asugnaturas);
            System.out.println("Escuela..........:" + escola);
            for(int i = 0; i < notes.length;i++) {
                System.out.println("notes..........:" + notes[i]);
            }
    }

    public String getCurs() {
        return curs;
    }

    public void setCurs(String curs) {
        this.curs = curs;
    }

    public String getAsugnaturas() {
        return asugnaturas;
    }

    public void setAsugnaturas(String asugnaturas) {
        this.asugnaturas = asugnaturas;
    }

    public String getEscola() {
        return escola;
    }

    public void setEscola(String escola) {
        this.escola = escola;
    }

    public double[] getNotes() {
        return notes;
    }

    public void setNotes(double[] notes) {
        this.notes = notes;
    }

    //public void setNotes(double v, double v1, double v2, double v3, double v4, double v5) {
    //}
}
