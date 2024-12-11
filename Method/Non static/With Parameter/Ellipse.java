class Ellipse
{
	void area(int a,int b)
	{
		double res=3.142*a*b;
		System.out.println("Area of ellipse:"+res);
	}
	public static void main(String[] args)
	{
		new Ellipse().area(6,7);
	}
}