package exercise12aug19;

public class Factimp implements Factorial{

	public int  fact(int fact,int a) {
			fact=1;
		for(int i=1;i<=a;i++)
		{
			fact=fact * i;
		}
		return fact;
		
	}


	public void fact(int n) {
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			fact=fact * i;
		}
		System.out.println("Factorial of "+fact);
	}
	

}
