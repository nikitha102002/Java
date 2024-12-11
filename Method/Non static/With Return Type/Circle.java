class Circle
{
	double area()
	{
		int r=6;
		double res=r*r*3.142;
		return res;
	}
	public static void main(String[] args)
	{
		double y=new Circle().area();
		System.out.println("Area of circle:"+y);
	}
}