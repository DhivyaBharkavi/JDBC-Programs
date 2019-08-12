package exercise12aug19;

import java.util.Scanner;

public class FactimpTest {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a value");
		int a=scan.nextInt();
		Factimp f = new Factimp();
		f.fact(a);
		int fact=f.fact(a,a);
		System.out.println("Factorial of "+fact);
	}

}
