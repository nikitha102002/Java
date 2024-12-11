class Parellelogram
{
	int area()
	{
		int b=4;
		int h=5;
		int res=b*h;
		return res;
	}
	public static void main(String[] args)
	{
		int s=new Parellelogram().area();
		System.out.println("Area of parellelogram:"+s);
	}
}