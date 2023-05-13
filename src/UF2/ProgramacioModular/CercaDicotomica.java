package UF2.ProgramacioModular;

public class CercaDicotomica {

    //Param. entr:
    //Param. sort:
    public int cercaDicotomica(double[] array, int inici, int fi, double valor) {
        if (inici > fi) {
            //Cas base: No s’ha trobat el valor
            //Caso base: No se ha encontrado el valor
            return -1;
        }
        //Es calcula la posició central entre els dos índexs de cerca
        //Se calcula la posición central entre los dos índices de búsqueda
        int pos = inici + (fi - inici) / 2;

        if (array[pos] > valor) {
            //Cas recursiu: Si el valor es menor que la posició que s’ha mirat
            //llavors cal seguir cercant per la part "dreta" de l’array
            //Caso recursivo: Si el valor es menor que la posición que se ha mirado
            //entonces hay que seguir buscando por la parte "derecha" del array
            return cercaDicotomica(array, inici, pos - 1, valor);
        }
        else if (array[pos] < valor) {
            //Cas recursiu: Si el valor és més gran que la posició que s’ha mirat
            //llavors cal seguir cercant per la part "esquerra" de l’array
            //Caso recursivo: Si el valor es mayor que la posición que se ha mirado
            //entonces hay que seguir buscando por la parte "izquierda" del array
            return cercaDicotomica(array, pos + 1, fi, valor);
        }
        else {
            //cas base: és igual, per tant, s’ha trobat
            //caso base: da igual, por tanto, se ha encontrado
            return pos;
        }
    }
}
