class Sector
{
	double area()
	{
		int r=4;
		double t=30.5;
		double res=0.5*r*r*t;
		return res;
	}
	public static void main(String[] args)
	{
		double d=new Sector().area();
		System.out.println("Area of sector:"+d);
	}
}