class Circle
{
	static void circle(int r)
	{	
		final double pi=3.142;
		double area=r*r*pi;
		System.out.println("Area of circle:"+area);
	}
	public static void main(String[] args)
	{
		circle(6);
	}
}