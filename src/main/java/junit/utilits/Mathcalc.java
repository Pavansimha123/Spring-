package junit.utilits;

public class Mathcalc {
	
	public int add(int a, int b) 
	{
		return a+b;
	}
	
	public double Divide(int a, int b)
	{
		return a/b;
	}

	public double computercircleradius(double r) 
	{
	 return Math.PI*r*r	;
	}
	
	public int multiply(int a,int b) {
		return a*b;
	}
	public int fact(int a) {
		int fact=1;
		for (int i = 1; i <= a; i++) 
		{
			fact=fact*i;
		}
		return fact;
	}
}
