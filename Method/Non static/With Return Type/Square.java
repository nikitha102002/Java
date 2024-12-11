class Square
{
	int area()
	{
		int a=4;
		int res=a*a;
		return res;
	}
	public static void main(String[] args)
	{
		int s=new Square().area();
		System.out.println("Area of square:"+s);
	}
}