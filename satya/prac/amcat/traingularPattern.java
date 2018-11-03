package satya.prac.amcat;

public class traingularPattern {
	static int n=8;
	public static void main(String[] args)
	{
		int i,j,a=1;
		for(i=1;i<=n;i++)
		{
			for(j=1;j<i;j++)
				{
				System.out.print((a++)+"*");
				}
			System.out.println(a++);
		}
		
		int b=a;
		for(i=n;i>=1;i--)
		{
			b=b-i;
			for(j=1;j<i;j++)
				{
				System.out.print((b+++"*"));
				}
			System.out.println(b++);
			b=b-i;
		}
	}
}
