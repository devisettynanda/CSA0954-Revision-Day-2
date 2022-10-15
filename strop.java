import java.util.*;
import java.io.IOException;
public class strop
{
	static void removeDuplicate(char str[], int n)
    	{
        	HashSet<Character> s = new LinkedHashSet<>(n - 1);
        	for (char x : str)
            	s.add(x);
        	for (char x : s)
            	System.out.print(x);
    	}
  	public static void main(String[] args) 
	{
		try
		{
			String str;
			int choice;
			int strLength;
			String reverseStr = "";
			Scanner sc=new Scanner(System.in);
			Scanner s=new Scanner(System.in);
			System.out.println("OPERATIONS PERFORMED ARE:\n 1.Palindrome or not \n 2.Reverse String \n 3.Substring \n 4.Remove duplicates");
			System.out.print("Enter the no for your operation: ");
			choice=s.nextInt();
			switch(choice)
			{
				case 1:
    					System.out.print("Enter the string: ");
					str=sc.nextLine();
					if (!str.matches("[A-Za-z]+"))
					{
     	    					System.out.println ("Invalid Input");
            				System.exit(1);
        				}
					strLength = str.length();
    					for (int i = (strLength - 1); i >=0; --i) 
					{
      					reverseStr = reverseStr + str.charAt(i);
    					}
    					if(str.toLowerCase().equals(reverseStr.toLowerCase())) 
					{
      					System.out.println(str + " is a Palindrome String.");
    					}
    					else 	
					{
      					System.out.println(str + " is not a Palindrome String.");
    					}
					break;	
				case 2:
					System.out.print("Enter the string to be reverse: ");
					str=sc.nextLine();
					if (!str.matches("[A-Za-z]+"))
					{
     	    					System.out.println ("Invalid data");
            				System.exit(1);
        				}
					strLength = str.length();
    					for (int i = (strLength - 1); i >=0; --i) 
					{
      					reverseStr = reverseStr + str.charAt(i);
    					}
    					System.out.println("Reverse of given string = "+reverseStr);
					break;
				case 3:
					System.out.print("Enter the string: ");
					str=sc.nextLine();
					String[] splitString = str.split(" ");
					
					System.out.println("Sub strings are: ");  
					System.out.println(Arrays.toString(splitString));  
					break;
				case 4:
					System.out.print("Enter the string: ");
					str=sc.nextLine();
					char st[] =str.toCharArray();
        				int n = st.length;
        				removeDuplicate(st, n);
					break;
				default:
					break;
			}
		}
		catch(Exception e)
		{
			System.out.print("Invalid data");
			return;
		}
	}
}