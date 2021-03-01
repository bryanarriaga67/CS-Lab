import java.util.Scanner;
import java.io.*;

	public class compLab{
		public static void main(String[] args) throws FileNotFoundException{

			File file = new File("product-database.txt");
			Scanner fileScnr = new Scanner(file);
			Scanner scnr = new Scanner(System.in);

			double cartTotal = 0.0;
			int numItems = 0;
			//Initialize menuSelection to 1 so loop iterates at least once
			int menuSelection = 1;
			//while loop will print out menu after each menu slection section is completed by user
			while(menuSelection >= 1 && menuSelection != 5){

			System.out.println("Welcome to Mejiazon");
			System.out.println();
			System.out.println("Choose one of the options below (1-5)");
			System.out.println("1. Add item");
			System.out.println("2. View cart");
			System.out.println("3. Clear cart");
			System.out.println("4. Check out");
			System.out.println("5. Exit");
			//Ask user for menu slection
			menuSelection = scnr.nextInt();
			scnr.nextLine();

				switch (menuSelection){
					case 1: 
						//This loop will make the menu print all at once
						while(fileScnr.hasNextLine()){
							String line = fileScnr.nextLine();
							System.out.println(line);
						}
							
							System.out.println("Type name of product to add");
							String enteredProduct = scnr.nextLine();
							//Reset File Scanner
							fileScnr = new Scanner(file);
							//For evert line in file, read product name and price
							while (fileScnr.hasNextLine()) {
							String productName = fileScnr.next();
   							double productPrice = fileScnr.nextDouble();
   							
   						
   								if (enteredProduct.equals(productName)){
			   						numItems ++;
			   						cartTotal = cartTotal + productPrice;
			   						System.out.println("Your cart total is $"+ cartTotal);
			   						System.out.println("Number of items in cart: " + numItems);	

   						} 

   					}
   					break;
   					case 2:
   						System.out.println("Items in cart: " + numItems);
   						System.out.println("Total cost: $ " + cartTotal);
   						break;

   					case 3: 
   						//Delete cart items and cart total
   						cartTotal = 0;
   						numItems = 0;
   						System.out.println("cart total: $0");
   						System.out.println("Number of items: 0");
   						break;

   					case 4:
   						System.out.println("Your total is : $ " + cartTotal);
   						System.out.println("Items in cart: " + numItems);
   						//Initialize gift card for while loop
   						Double giftCard = 0.0;
   						while(giftCard <= cartTotal){
   								System.out.println("You now have three options to check out: ");
   								System.out.println("1. 6 months of payments with 1% interest");
   								System.out.println("2. 12 months of payments with 2% interest");
   								System.out.println("3. Pay in full");
   								//Ask user for payment selection option
   								int paymentSelection = scnr.nextInt();

   										if (paymentSelection == 1){
	   										Double interest = 0.01 * cartTotal; 
							                cartTotal = cartTotal + interest;
							                Double dueToday = cartTotal / 6;
							                System.out.println("You will pay: $" + dueToday + " every month for 6 months.");
							                System.out.println("Interest was: " + interest);
							                System.out.println("Today you owe: " + dueToday);
							                System.out.println("Enter gift card amount");
							   				giftCard = scnr.nextDouble();
							   				System.out.println("Thank you for shopping with Mejiazon!");
							   				Double cardBalance = giftCard - dueToday;
							   				System.out.println("Your remaining card balnance is " + cardBalance);
						   				}

						   				if (paymentSelection == 2){
							   				Double interest = 0.02 * cartTotal; 
							                cartTotal = cartTotal + interest;
							                Double dueToday = cartTotal / 12;
							                System.out.println("You will pay: $" + dueToday + " every month for 12 months.");
							                System.out.println("Interest was: " + interest);
							                System.out.println("Today you owe: " + dueToday);
							                System.out.println("Enter gift card amount");
						   					giftCard = scnr.nextDouble();
						   					System.out.println("Thank you for shopping with Mejiazon!");
						   					Double cardBalance = giftCard - dueToday;
						   					System.out.println("Your remaining card balnance is " + cardBalance);
						   				}
						   				
						   				if (paymentSelection == 3){
						   					System.out.println("Today you owe: " + cartTotal);
						   					System.out.println("Enter gift card amount");
						   					giftCard = scnr.nextDouble();
						   					System.out.println("Thank you for shopping with Mejiazon!");
						   					Double cardBalance = giftCard - cartTotal;
						   					System.out.println("Your remaining card balnance is " + cardBalance);
						   				}
						   					break;
   								}
   											break;		
   					case 5:
   					System.out.println("Cart abandoned. Goodbye!");
   					break;


					}	


				}	

			}		
 		 }
	


	

