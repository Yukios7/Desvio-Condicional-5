package EDNA5;

import java.util.Scanner;

public class Titia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner jax = new Scanner(System.in);
		int n1 = jax.nextInt();
		int n2 = jax.nextInt();
		int n3 = jax.nextInt();
		
		if (n1 > n2 && n1 > n3 && n2 < n3) {
			System.out.println(n1 +" É o maior número e " + n2 + " É o menor" );
		}
		else if (n1 > n2 && n1 > n3 && n3 < n2) {
			System.out.println(n1 +" É o maior número e " + n3 + " É o menor" );
		}
		else if (n2 > n1 && n2 > n3 && n3 < n1) {
			System.out.println(n2 +" É o maior número e " + n3 + " É o menor" );
		}
		else if (n2 > n1 && n2 > n3 && n1 < n3) {
			System.out.println(n2 +" É o maior número e " + n1 + " É o menor" );
		}
		else if (n3 > n2 && n3 > n1 && n1 < n2) {
			System.out.println(n3 +" É o maior número e " + n1 + " É o menor" );
		}
		else if (n3 > n2 && n3 > n1 && n2 < n1) {
			System.out.println(n3 +" É o maior número e " + n2 + " É o menor" );
		}

}
}


