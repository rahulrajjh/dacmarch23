/*import java.util.Scanner;
public class Pattern4
{
 
    public static void main(String[] args)
    {
    Scanner sc = new Scanner(System.in); // takes input
    System.out.println("Enter number of rows: ");
    int rows = sc.nextInt();
    for (int i= rows; i>= 1; i--)
    {
    for (int j=rows; j>i;j--)
    {
    System.out.print(" ");
    }
    for (int k=1;k<=i;k++)
    {
    System.out.print("*");
    }
    System.out.println("");
    }
    sc.close();
    }
    }*/
class Pattern4
{
	public static void main(String args[])
	{
		for (int i=5; i>=1; i--)
		{
			for(int j=5; j>=i; j--)
			{
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}