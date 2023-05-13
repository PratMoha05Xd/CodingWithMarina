package UF2.ProgramacioModular;

public class NotaAText {

    //Param. entr: la nota que volem transformar a text
    //Param. sort: la nota transformada en text
    //Param. entr: la nota que queremos transformar en texto
    //Param. suerte: la nota transformada en texto
    public String notaAText(double note) {
        if (note >= 0 && note <= 4.9) {
            return "Suspés";
        } else if (note >= 5 && note <= 6.49) {
            return "Aprovat";
        } else if (note >= 6.5 && note <= 8.9) {
            return "Notable";
        } else if (note >= 9 && note <= 10) {
            return "Exel-lent";
        } else {
            return "nota no valida\nPor Favor Repetir de nuevo!";

        }
    }
}