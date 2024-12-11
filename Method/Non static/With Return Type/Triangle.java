class Triangle
{
	double area()
	{
		int b=4;
		int h=5;
		double res=0.5*b*h;
		return res;
	}
	public static void main(String[] args)
	{
		double p=new Triangle().area();
		System.out.println("Area of triangle:"+p);
	}
}