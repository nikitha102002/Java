class Sector
{
	static double sector()
	{
		int r=4;
		double t=30.5;
		double area=0.5*r*r*t;
		return area;
	}
	public static void main(String[] args)
	{
		double d=sector();
		System.out.println("Area of sector:"+d);
	}
}