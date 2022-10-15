import java.util.*;
public class conversions_num
{
	public static void main(String args[])
    	{
		try
		{
			int num,ch;
			String hexa,octal,binary,decimal;
			Scanner sc = new Scanner(System.in);
			Scanner s = new Scanner(System.in);
			System.out.println("1.Decimal to HexaDecimal,Octal and Binary");
			System.out.println("2.Binary to HexaDecimal,Octal and Decimal");
			System.out.println("3.Hexadecimal to Decimal,Octal and Binary");
			System.out.print("Enter the choice: ");
          		ch=s.nextInt();
			switch(ch)
			{
				case 1:
          				System.out.println("Decimal to HexaDecimal,Octal and Binary");
          				System.out.print("\nEnter the decimal number :");
          				num = Integer.parseInt(sc.nextLine());
           				hexa = Integer.toHexString(num);
         				System.out.println("HexaDecimal Value is : " + hexa);
    	      			octal = Integer.toOctalString(num);
      				System.out.println("Octal Value is : " + octal);
         				binary = Integer.toBinaryString(num);
         				System.out.println("Binary Value is : " + binary);
					break;
				case 2:
					System.out.println("Binary to HexaDecimal,Octal and Decimal");
          				System.out.print("\nEnter the Binary number :");
    					num=Integer.parseInt(sc.nextLine(),2);
       				hexa = Integer.toHexString(num);
           				System.out.println("HexaDecimal Value is : " + hexa);
   	      			octal = Integer.toOctalString(num);
      				System.out.println("Octal Value is : " + octal);
					decimal=Integer.toString(num);
           				System.out.println("Decimal Value is : " + decimal);
					break;
				case 3:
          				System.out.println("Hexadecimal to Decimal,Octal and Binary");
          				System.out.print("\nEnter the Hexadecimal number :");
          				num = Integer.parseInt(sc.nextLine(),16);
           				decimal = Integer.toString(num);
           				System.out.println("HexaDecimal Value is : " + decimal);
    	      			octal = Integer.toOctalString(num);
      				System.out.println("Octal Value is : " + octal);
           				binary = Integer.toBinaryString(num);
           				System.out.println("Binary Value is : " + binary);
					break;
				default:
					break;
			}
		}
		catch(Exception e)
		{
			System.out.print("Invalid Input\n"+e);
			return;
		}
    	}
}