class Trapezoid
{
	static void trapezoid(int a,int b,int h)
	{
		double area=0.5*(a+b)*h;
		System.out.println("Area of trapezoid:"+area);
	}
	public static void main(String[] args)
	{
		trapezoid(5,7,9);
	}
}