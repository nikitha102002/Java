class Sector
{
	void area(int r,double t)
	{
		double res=0.5*r*r*t;
		System.out.println("Area of sector:"+res);
	}
	public static void main(String[] args)
	{
		new Sector().area(5,30.5);
	}
}