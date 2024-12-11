class Rectangle
{
	int area()
	{
		int w=5;
		int h=6;
		int res=w*h;
		return res;
	}
	public static void main(String[] args)
	{
		int n=new Rectangle().area();
		System.out.println("Area of rectangle:"+n);
	}
}