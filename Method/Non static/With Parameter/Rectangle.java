class Rectangle
{
	void area (int w,int h)
	{
		int res=w*h;
		System.out.println("Area of rectangle:"+res);
	}
	public static void main(String[] args)
	{
		new Rectangle().area(4,6);
	}
}