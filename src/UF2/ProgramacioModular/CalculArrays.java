package UF2.ProgramacioModular;

public class CalculArrays {
    //Param. entr:
    //Param. sort:
    public double calcularMaxim(double[] array, int NUM_NOTES) {
        double max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        return max;
    }

    //Param. entr:
    //Param. sort:
    public double calcularMinim(double[] array, int NUM_NOTES) {
        double min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }

    //Param. entr:
    //Param. sort:
    public double calcularMitjana(double[] array, int mida) {
        double suma = 0;
        for (int i = 0; i < mida; i++) {
            suma = suma + array[i];
        }
        return suma/mida;
    }

}