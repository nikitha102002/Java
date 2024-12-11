class Trapezoid
{
	static double trapezoid()
	{
		int a=3;
		int b=4;
		int h=5;
		double area=0.5*(a+b)*h;
		return area;
	}
	public static void main(String[] args)
	{
		double r=trapezoid();
		System.out.println("Area of trapezoid:"+r);
	}
}