package UF2.Modular;

public class CalcChar {

    static char[] letras = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
    static char[] chars = new char[5];

    public static int findBiggestIndex(char[] chars, char[] letra) {
        int biggestOne = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] > chars[biggestOne]) {
                biggestOne = i;
            }
        }
        return biggestOne;
    }

    public static int findSmallestIndex(char[] chars, char[] letras) {
        int smallestOne = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] < chars[smallestOne]) {
                smallestOne = i;
            }
        }
        return smallestOne;
    }

    public static boolean areCharsDifferent(char[] chars) {
        for (int i = 0; i < chars.length - 1; i++) {
            for (int j = i + 0; j < chars.length; j++) {
                if (chars[i] != chars[j]) {
                    return true;
                }
            }
        }
        return false;
    }
}