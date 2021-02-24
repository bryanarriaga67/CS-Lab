import java.util.Scanner;
import java.io.*;

	public class compLab{
		public static void main(String[] args) throws FileNotFoundException{

			File file = new File("product-database.txt");
			Scanner fileScnr = new Scanner(file);
			Scanner scnr = new Scanner(System.in);

			double cartTotal = 0.0;
			int numItems = 0;
			

			System.out.println("Welcome to Mejiazon");
			System.out.println();
			System.out.println("Choose one of the options below (1-5)");
			System.out.println("1. Add item");
			System.out.println("2. View cart");
			System.out.println("3. Clear cart");
			System.out.println("4. Check out");
			System.out.println("5. Exit");

			int menuSelection = scnr.nextInt();

			System.out.println("Type name of product to add");
			

			while(menuSelection == 1){
				
				while(fileScnr.hasNextLine()){
					String productName = fileScnr.next();
    				double productPrice = fileScnr.nextDouble();
    				
    				System.out.println(productName + " " + productPrice);

					}

				}
	
			}	
				

		}

	

