package no.hvl.dat100.lab6.matriser;

public class Matriser {
	public static void main(String[] args) {
		int [][] matrise = { {1,2,3}, {4,5,6}, {7,8,9} };
		int [][] matrise2 = { {1,2,3}, {4,5,6}, {7,8,9} };
		
		
		skrivUt(matrise);
		

		System.out.println();
		
		String returneres = tilStreng(matrise);
		
		System.out.println(returneres);
		

		System.out.println();
		
		int [][] test = skaler(4,matrise);
		
		skrivUt(test);
		
		System.out.println();
		
		boolean erLike = erLik(matrise,matrise2);
		System.out.println(erLike);
		
	}

	// a)
	public static void skrivUt(int[][] matrise) {
		
		for (int row[] : matrise) {
			System.out.println();
			for (int element : row) {
				
				System.out.print(element);
			}
		}
	}

	// b)
	public static String tilStreng(int[][] matrise) {

String returneres = "";
		
		for (int row = 0; row<matrise.length; row++) {
			returneres += '\n';
			
			for (int col = 0; col < matrise[row].length; col++) {
				
			returneres += matrise[row][col];
			
			
				}
			}
			
		return returneres;
		
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		
		int[][] nyMatrise = new int[matrise.length][matrise[0].length];
		
		for (int y = 0; y < matrise.length; y++)
			for (int x = 0; x < matrise[y].length; x++)
				nyMatrise[y][x] = matrise[y][x] * tall;
		
		return nyMatrise;
	
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {

boolean erLike = true;
		
		for (int row = 0; row < a.length; row++) {
			for (int col = 0; col < a[row].length; col++) {
				if (a[row][col] != b[row][col]) {
					erLike = false;
					break;
				}
				
				
			}
		}
		return erLike;
	}
	
	// e)
	public static int[][] speile(int[][] matrise) {

		// TODO
		throw new UnsupportedOperationException("speile ikke implementert");
	
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		// TODO
		throw new UnsupportedOperationException("multipliser ikke implementert");
	
	}
}
