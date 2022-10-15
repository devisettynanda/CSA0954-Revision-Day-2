import java.util.*;
public class pattern
{
	public static void main(String[] args)
	{
		try
		{
			int i,j,n,k,num,ch;
			char a;
			Scanner sc=new Scanner(System.in);
			Scanner s=new Scanner(System.in);
			System.out.println("1.Right triangle \n2.Hollow Square \n3.reverse pyramid");
			System.out.print("Enter choice: ");
			ch=s.nextInt();
			switch(ch)
			{
				case 1:
					System.out.print("Enter no. of rows: ");
					n=sc.nextInt();
					System.out.print("Enter charecter: ");
					a=s.next().charAt(0);
					for(i=1;i<=n;i++)
					{
						for(j=1;j<=i;j++)
						{
							System.out.print(a+" ");
						}
						System.out.println();
					}
					break;
				case 2:
					System.out.print("Enter no. of rows: ");
					n=sc.nextInt();
					System.out.print("Enter charecter: ");
					a=s.next().charAt(0);
					for(i=1;i<=n;i++)
					{
						for(j=1;j<=n;j++)
						{
							if(i==1||i==n||j==1||j==n)
							{
								System.out.print(a+" ");
							}
							else
							{
								System.out.print("  ");
							}
						}
						System.out.println();
					}
					break;
				case 3:
					System.out.print("Enter no. of rows: ");
					n=sc.nextInt();
					System.out.print("Enter charecter: ");
					a=s.next().charAt(0);		
					for (i=0;i<=n-1;i++)  
					{  	
						for (j=0;j<=i;j++)  
						{  
							System.out.print(" ");  
						}  
						for (k=0;k<=n-1-i;k++)  
						{  
							System.out.print(a+" ");  
						}  	
						System.out.println();  
					}  
					break;
				default:
					break;
			}
		}
		catch(Exception e)
		{
			System.out.print("Invalid Input");
			return;
		}	
	}
}