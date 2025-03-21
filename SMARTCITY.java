package simp;
import java.util.Scanner;

public class SMARTCITY 
	
	
 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        while (true) {
	            System.out.println("\nWelcome to the Smart City Information System");
	            System.out.println("1. Hotels");
	            System.out.println("2. Transportation");
	            System.out.println("3. Air Ticket Booking");
	            System.out.println("4. Shopping");
	            System.out.println("5. City News");
	            System.out.println("6. Exit");
	            System.out.print("Select an option: ");
	            
	            int choice = scanner.nextInt();
	            scanner.nextLine(); 
	            
	            switch (choice) {
	                case 1:
	                    System.out.println("\nTop Hotels in the City:");
	                    System.out.println("1. Hotel Grand Palace\n2. City View Inn\n3. Royal Stay Resort");
	                    break;
	                case 2:
	                    System.out.println("\nTransportation Options:");
	                    System.out.println("1. Metro Rail\n2. City Bus\n3. Taxi Services");
	                    break;
	                case 3:
	                    System.out.println("\nAir Ticket Booking:");
	                    System.out.println("Visit www.smartcityair.com to book your tickets.");
	                    break;
	                case 4:
	                    System.out.println("\nPopular Shopping Areas:");
	                    System.out.println("1. Downtown Mall\n2. Street Market\n3. Fashion Plaza");
	                    break;
	                case 5:
	                    System.out.println("\nLatest City News:");
	                    System.out.println("1. New metro line to be inaugurated next month!\n2. Annual Food Festival starts next week!");
	                    break;
	                case 6:
	                    System.out.println("\nThank you for using the Smart City Information System. Goodbye!");
	                    scanner.close();
	                    return;
	                default:
	                    System.out.println("Invalid option. Please select again.");
	            }
	        }
	    }
	}



