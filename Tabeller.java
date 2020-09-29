package no.hvl.dat100.lab5.tabeller;

public class Tabeller {



	// a)
	public static void skrivUt(int[] tabell) {

		for (int i = 0; i < tabell.length; i++) {

			System.out.println(tabell[i]);
		}
	}

	// b)
	public static String tilStreng(int[] tabell) {

		String returneres = "[";

		for (int i = 0; i < tabell.length; i++) {

			returneres += tabell[i];

			if (i == tabell.length - 1) {

				returneres += "]";
			}

			else {
				returneres += ",";
			}

		}
		return returneres;
		

	}

	// c)
	public static int summer(int[] tabell) {
		
		int sum = 0;
		
		for (int i = 0; i<tabell.length; i++) {
			
			sum += tabell[i];
		}

		return sum;
	}
	
	public static int summer2(int[] tabell) {
		
		int sum = 0;
		int teller = 0;
		
		
		while  (teller != tabell.length) {
			
			sum += tabell[teller];
			teller += 1;
		}

		return sum;	
			
	}
	
	public static int summer3(int[] tabell) {
		int sum = 0;
		
		for (int element : tabell) {
		
			sum += element; 
		
		}
		return sum;
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {


		boolean funnettall = false;
		
		for (int element : tabell) {
			
			if (element == tall) {
				
				funnettall = true;
				
				break;
			}
			
		}
		

		return funnettall;
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {

		int index = -1;
		
		for (int i = 0; i<tabell.length; i++) {
			
			if (tabell[i] == tall) {
				
				index = i;
				
				break;
			}
			
			
		}
		
		return index;

	}

	// f)
	public static int[] reverser(int[] tabell) {

		int[] n = new int[tabell.length];

		for (int i = 0, j = tabell.length - 1; i<tabell.length; i++, j--) {
			
			 n[j] = tabell[i]; 
		}
		  
		 return n;

	}

	// g)
	public static boolean erSortert(int[] tabell) {

		boolean sortert = true;
		
		int i = 1;
		while (sortert && i<tabell.length) {
			if (tabell[i-1] <= tabell[i])
				i++;
			else 
				sortert = false;
		}
		return sortert;
		
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

		int nyLengde = tabell1.length + tabell2.length;
		int [] nyTabell = new int[nyLengde];
		for (int i = 0; i<tabell1.length; i++) {
			nyTabell[i] = tabell1[i];
		}
		for (int j=0; j<tabell2.length; j++) {
			nyTabell[tabell1.length + j] = tabell2[j];
		}
		return nyTabell;
	}
}
