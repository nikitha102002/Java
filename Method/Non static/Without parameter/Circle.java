class Circle
{
	void area()
	{
		int r=6;
		double res=r*r*3.142;
		System.out.println("Area of circle:"+res);
	}
	public static void main(String[] args)
	{
		new Circle().area();
	}
}