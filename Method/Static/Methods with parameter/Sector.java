class Sector
{
	static void sector(int r,double t)
	{
		double area=0.5*r*r*t;
		System.out.println("Area of sector:"+area);
	}
	public static void main(String[] args)
	{
		sector(4,30.5);
	}
}