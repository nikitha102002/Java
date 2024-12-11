class Ellipse
{
	static double ellipse()
	{
		int a=4;
		int b=5;
		double area=3.142*a*b;
		return area;
	}
	public static void main(String[] args)
	{
		double y=ellipse();
		System.out.println("Area of ellipse:"+y);
	}
}