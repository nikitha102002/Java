class Trapezoid
{
	double area()
	{
		int a=3;
		int b=4;
		int h=5;
		double res=0.5*(a+b)*h;
		return res;
	}
	public static void main(String[] args)
	{
		double r=new Trapezoid().area();
		System.out.println("Area of trapezoid:"+r);
	}
}