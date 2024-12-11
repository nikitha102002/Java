class Square
{
	void area(int a)
	{
		int res=a*a;
		System.out.println("Area of square:"+res);
	}
	public static void main(String[] args)
	{
		new Square().area(3);
	}
}