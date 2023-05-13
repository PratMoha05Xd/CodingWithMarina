package UF2.Recursivitat;

public class Recursivitat{
	public static void main(String args[]) {
		int x = 33;
		checkover(x);
	}

	public static void checkover(int x){
		if (x % 2 == 0){
			System.out.println("El nombre " + x + " és parell");
		}
		else{
			System.out.println("El nombre " + x + " és senar");
		}

		if(x > 1){
			checkover(x - 1);
		}
	}
}

