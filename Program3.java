package TandamLoop;

public class Program3 {
	public static void main(String[] args)
	{
		int x=6;
		if(x%2==0)
		{
			x--;
			int a=1;
			for(int i=1;i<=x;i++)
			{
				System.out.println(a);
				a=a+2;
			}
		}
	}
}
