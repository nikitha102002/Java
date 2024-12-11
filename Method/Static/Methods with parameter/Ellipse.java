class Ellipse
{
	static void ellipse(int a,int b)
	{
		final double pi=3.142;
		double area=pi*a*b;
		System.out.println("Area of ellipse:"+area);
	}
	public static void main(String[] args)
	{
		ellipse(5,6);
	}
}