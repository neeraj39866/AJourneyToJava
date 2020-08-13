import java.util.Scanner;
public class Task3Discount {
	public static void main(String[] args) {
			
			Scanner scanner = new Scanner(System.in);
			Scanner s=new Scanner(System.in);
			int KOTAK200 = 1;
			int ICICTREATS = 2;
			
			System.out.println("Enter the amount to be paid");
			double amountToPay = s.nextDouble();
			if(amountToPay >= 399) {
				System.out.println("You are elibile for applying Promo Code");
				System.out.println("1. KOTAK200 for orders above Rs.399. 20% Off Upto 200");
				System.out.println("2. ICICTREATS for orders above Rs.499. Flat 20%");
				
				int a=s.nextInt();
				
				//Kotak
				double discount1=0.0;
				discount1=amountToPay*0.2;
				if(discount1>200)
				{
					discount1=200;
				}
				//System.out.println( discount1);
				if(amountToPay>=499)
				{
				double discount2=0.0;
				discount2=amountToPay*0.2;
				//System.out.println( discount2);
				if(discount1>discount2)
				{
				   if(a==1)
				   {
					System.out.println("KOTAK200 Applied...... Your Discount is "+discount1);
					System.out.println("You have to pay:"+(amountToPay-discount1));
				   }
				   else if(a==2)
				   {
					System.out.println("Wrong PromoCode Choosen........Another Promocode avalaible with more discount");
				   }
				   else
				   {
					   System.out.println("Inavlid Promocode");
				   }
				   int b=s.nextInt();
				   if(b==1)
					{
					   System.out.println("KOTAK200 Applied...... Your Discount is "+discount1);
						System.out.println("You have to pay:"+(amountToPay-discount1));
					}
				   
				}
				else
				{
					if(a==1)
					   {
						System.out.println("Wrong PromoCode Choosen........Another Promocode avalaible with more discount");
						int b=s.nextInt();
						if(b==2)
						{
							System.out.println("ICICTREATS Applied...... Your Discount is "+discount2);
							System.out.println("You have to pay:"+(amountToPay-discount2));
						}
					   }
					   else if(a==2)
					   {
						   System.out.println("ICICTREATS Applied...... Your Discount is "+discount2);
							System.out.println("You have to pay:"+(amountToPay-discount2));
					   }
					   else
					   {
						   System.out.println("Inavlid Promocode");
					   }
				}
				}
				else
				{
					System.out.println("Only KOTAK200 is applicable");
					System.out.println("You have to pay:"+(amountToPay-discount1));	
				}
		}
			else
			{
				System.out.println("Cart value is not Sufficient for applying Promocode");
				System.out.println("You have to pay:"+amountToPay);	
			}
				
	}
}
		
		// Assignment: 1. Suggest the User right promo code, if user has applied a wrong one
		//			   2. Suggest the User, promo Code which delivers highest discount
		//				     2.1 if user applied invalid promo code
		//					 2.2 if user has entered d a promo code which is giving him lesser discount as compare to other

	

	
