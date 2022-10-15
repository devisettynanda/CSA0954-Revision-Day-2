import java.util.*;
import java.io.IOException;
public class string_op
{
	public static void main(String[] args) 
	{
		try
		{
			String str,str1,str2;
			int ch,len,i,c=0,v=0;
			char a;
			Scanner sc=new Scanner(System.in);
			Scanner s=new Scanner(System.in);
			System.out.println("1.String length \n2.Lower case to upper case \n3.Last word of the string ");
			System.out.println("4.Vowels & Consonents in string\n5.Two strings are Anagrams or not");
			System.out.print("Enter choice: ");
			ch=s.nextInt();
			switch(ch)
			{
				case 1:
    					System.out.print("Enter the string: ");
					str=sc.nextLine();
					len= str.length();
					for (i=0;i<len;i++)
        				{
            				a = str.charAt(i);
            				if (!(a >= 'A' && a <= 'Z') && !(a >= 'a' && a <= 'z') && !(a==' ')) 
            				{
                					System.out.println("Invalid String");
							return;
            				}
        				}
					System.out.println("Length of given string = "+len);
					break;
				case 2:
    					System.out.print("Enter the string: ");
					str=sc.nextLine();
					len= str.length();
					for (i=0;i<len;i++)
        				{
            				a = str.charAt(i);
            				if (!(a >= 'A' && a <= 'Z') && !(a >= 'a' && a <= 'z') && !(a==' ')) 
            				{
                					System.out.println("Invalid String");
							return;
            				}
        				}
					System.out.println("After conversion: \n"+str.toUpperCase());
					break;
				case 3:
    					System.out.print("Enter the string: ");
					str=sc.nextLine();
					str=str.trim();
					len= str.length();
					for (i=0;i<len;i++)
        				{
            				a = str.charAt(i);
            				if (!(a >= 'A' && a <= 'Z') && !(a >= 'a' && a <= 'z') && !(a==' ')) 
            				{
                					System.out.println("Invalid String");
							return;
            				}
        				}
					System.out.println("Last word of the sentence is : "+ str.substring(str.lastIndexOf (' '),len));
					break;
				case 4:
    					System.out.print("Enter the string: ");
					str=sc.nextLine();
					len= str.length();
					for (i=0;i<len;i++)
        				{
            				a = str.charAt(i);
            				if (!(a >= 'A' && a <= 'Z') && !(a >= 'a' && a <= 'z') && !(a==' ')) 
            				{
                					System.out.println("Invalid String");
							return;
            				}
        				}
					System.out.println("Vowels= ");
					for(i=0;i<len;i++)
					{
						a=str.charAt(i);
						if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u'||a=='A'||a=='E'||a=='I'||a=='O'||a=='U')
						{
							v++;
							System.out.print(a+" ");
						}
					}
					System.out.println("\nNumber of vowels= "+v);
					System.out.println("Consonances= ");
					for(i=0;i<len;i++)
					{
						a=str.charAt(i);
						if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u'||a=='A'||a=='E'||a=='I'||a=='O'||a=='U')
						{
							v++;
						}
						else if(a!=' ')
						{
							c++;
							System.out.print(a+" ");
						}
					}
					System.out.println("\nNumber of Consonances= "+c);
					break;
				case 5:
    					System.out.print("Enter the string1: ");
					str1=sc.nextLine();
					System.out.print("Enter the string2: ");
					str2=sc.nextLine();
					str1 = str1.toLowerCase();
    					str2 = str2.toLowerCase();
					str1=str1.trim();
					str2=str2.trim();
					if(str1.length() == str2.length()) 
					{
     	 					char[] charArray1 = str1.toCharArray();
      					char[] charArray2 = str2.toCharArray();
      					Arrays.sort(charArray1);
      					Arrays.sort(charArray2);
      					boolean result = Arrays.equals(charArray1, charArray2);
      					if(result) 
						{
        						System.out.println(str1 + " and " + str2 + " are anagram.");
      					}
      					else 
						{
        						System.out.println(str1 + " and " + str2 + " are not anagram.");
      					}
    					}
    					else 
					{
      					System.out.println(str1 + " and " + str2 + " are not anagram.");
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