class Ellipse
{
	double area()
	{
		int a=4;
		int b=5;
		double res=3.142*a*b;
		return res;
	}
	public static void main(String[] args)
	{
		double y=new Ellipse().area();
		System.out.println("Area of ellipse:"+y);
	}
}