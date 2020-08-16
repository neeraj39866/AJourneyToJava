import java.util.Scanner;

public class Task4Ola {
	public static void discount(int amountToPay) {
		Scanner s = new Scanner(System.in);
		if(amountToPay >= 120) {
			System.out.println("You are elibile for applying Promo Code");
			System.out.println("1. KOTAK200 for orders above Rs.120. 20% Off Upto 100");
			System.out.println("2. ICICTREATS for orders above Rs.150. Flat 20%");
			
			int a=s.nextInt();
			
			//Kotak
			double discount1=0.0;
			discount1=amountToPay*0.2;
			if(discount1>100)
			{
				discount1=100;
			}
			//System.out.println( discount1);
			if(amountToPay>=150)
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
	
	public static void main(String[] args) {
		
		// MODEL
		int baseFare = 50;
		int kmCharge = 10;
		//int a;
		int distanceTravlled = 7;
		
		int olaMicro = 1;
		int olaMini = 2;
		int olaSedan = 3;
		int olaBike = 4;
		int olaShared = 5;

		int amountToPay = 0;
		
		// VIEW
		System.out.println("=========================");
		System.out.println("Select the Type of Cab:");
		System.out.println("1. OLA MICRO");
		System.out.println("2. OLA MINI");
		System.out.println("3. OLA SEDAN");
		System.out.println("4. OLA BIKE");
		System.out.println("5. OLA SHARED");
		System.out.println("=========================");
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Your Choice:");
		int choice = s.nextInt();
		//s.close();
		
		switch(choice) {
		
			case 1:
				baseFare += 10;
				amountToPay = baseFare + (kmCharge*distanceTravlled);
				System.out.println("OLA MICRO BOOKED. PLEASE PAY: \u20b9"+amountToPay);
				discount(amountToPay);
				break;
				
			case 2:
				baseFare += 20;
				amountToPay = baseFare + (kmCharge*distanceTravlled);
				System.out.println("OLA MINI BOOKED. PLEASE PAY: \u20b9"+amountToPay);
				discount(amountToPay);
				break;
			
			case 3:
				baseFare += 50;
				amountToPay = baseFare + (kmCharge*distanceTravlled);
				System.out.println("OLA SEDAN BOOKED. PLEASE PAY: \u20b9"+amountToPay);
				discount(amountToPay);
				break;
				
			case 4:
				baseFare += 5;
				amountToPay = baseFare + (kmCharge*distanceTravlled);
				System.out.println("OLA BIKE BOOKED. PLEASE PAY: \u20b9"+amountToPay);
				discount(amountToPay);
				break;
				
			case 5:
				baseFare += 8;
				amountToPay = baseFare + (kmCharge*distanceTravlled);
				System.out.println("OLA SHARED BOOKED. PLEASE PAY: \u20b9"+amountToPay);
				discount(amountToPay);
				break;
				
			default:
				System.out.println("Please Select Cab to Porceed");
				break;
				
		}
		
	}

	// Assignment: Integrate PromoCoode Coupon Snippet in this program w.r.t. OLA Ride Booking Program :)
	
}
