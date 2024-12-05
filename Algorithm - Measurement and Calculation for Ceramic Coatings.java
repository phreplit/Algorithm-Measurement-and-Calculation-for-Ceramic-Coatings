
//  Author: PHNO - Technologist | Postgraduate
//  Release Date: 29/11/2024
//  Version: 0.0.0.2v
//  Replit: @PHNO, @PHREPLIT
//  E-mail: phreplit@gmail.com

// Algorithm: Measurement and Calculation for Ceramic Coatings, algorithm built in java, built for professionals in civil engineering and related areas.

import java.io.IOException;
import java.util.Scanner; // import lib

public class Main {

public static void main(String[] args) throws IOException, InterruptedException {

loop: // choice Menu
while (true) {

  System.out.println("\n");
  System.out.println("\n");
  System.out.println(" Measurement and Calculation for Ceramic Coatings ");
  System.out.println("");
  System.out.println("");
  System.out.println("1. Calculate Square Meter of a Room");
  System.out.println("2. Calculate Quantity of Ceramics per M²");
  System.out.println("3. Calculate Quantity of Ceramic Boxes per M²");
  System.out.println("4. Exit");
  System.out.println("");
  System.out.println("[8] Info");
  System.out.println("[9] About "); // about
  
  System.out.println("\nEnter your choice: ");

Scanner scanner = new Scanner(System.in);

int choice = scanner.nextInt();

try {
  
switch (choice) {
  case 1:
	System.out.println("\n");
	System.out.println("Enter the length of the room: ");
	int v1 = scanner.nextInt();
	System.out.println("\n");
	System.out.println("Enter the room width: ");
	int v2 = scanner.nextInt();
	System.out.println("\n");
	int resultado = (v1 * v2);
	System.out.println("The room has " + (resultado) + " square meters.");
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("\nPress enter to return to the menu...\n");
        String enter = scanner1.nextLine();
        clear(); 
       break;
  case 2:
	int v4 = 4;
	System.out.println("\n");
	System.out.println("Enter how many square meters the room has: ");
        int v3 = scanner.nextInt();
	System.out.println("\n");
        int result = (v3 * v4);
        System.out.println("To lay " + (v3) + " M² of a room, " + (result) + " ceramic will be required.\n");
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("\nPress enter to return to the menu...\n");
        String enter2 = scanner2.nextLine();
        clear(); 
        break;
  case 3:
	int v6 = 4; // 1 square meter
	int cx1 = 8; // 1 ceramic box
	System.out.println("\n");
	System.out.println("Enter how many square meters the room has: ");
	int v5 = scanner.nextInt();
	System.out.println("\n");
	int result1 = (v5 * v6);
	int calcqtdcaixa = (result1 / cx1);
	System.out.println("To lay " + (v5) + " m² of a room, " + (calcqtdcaixa) + " ceramic boxes will be required.\n");
	Scanner scanner3 = new Scanner(System.in);
        System.out.println("\nPress enter to return to the menu...\n");
        String enter3 = scanner3.nextLine();
        clear();
        break;
  case 4:
    System.out.println("\n Finished Algorithm! ");
  break loop;
  case 8:
  clear();
  System.out.println("\n");
  System.out.println("Info");
  System.out.println("");
  System.out.println("To Calculate the Square Meter of a Room:");
  System.out.println("We calculate the length x width, see as an example a room with (3.70 meters long x 2.70 meters wide) we have that L x W = 10M².");
  System.out.println("");
  System.out.println("To Calculate Ceramic Coatings:");
  System.out.println("Taking a 50cm x 50cm ceramic tile as an example, we have that 2 x 2 ceramic tiles = 4 ceramic tiles, which is equivalent to 1M². This will be the standard calculation: 4 ceramic tiles = 1M². Therefore, any (N) square meters x 4 = the quantity (N) of tiles per square meter.");
  System.out.println("");
  System.out.println("To Calculate Quantity of Ceramic Boxes: ");
  System.out.println("Knowing that each box has 8 ceramic tiles, then for each 1 box of ceramic tiles we have 2m², and then Any (N) square meters x 4 (one m²) = (N) quantity of ceramic tiles and this result divided by a box (8) = the (N) quantity of ceramic boxes to lay a room.");
  System.out.println("");
  System.out.println("Important information: ");
  System.out.println("");
  System.out.println("This algorithm was built with integer variables so it does not accept numbers with commas e.g.: 2.90 meters change to 3 meters.");
  System.out.println("This algorithm was built in Java and by default always requires that its syntax are always correct for its correct compilation in the console.");
  System.out.println("");
  Scanner scanner7 = new Scanner(System.in);
  System.out.println("\nPress enter to return to the menu...\n");
  String enter7 = scanner7.nextLine();
  clear();
  break;
  case 9:
  clear();
  System.out.println("\n");
  System.out.println("Algorithm: Measurement and Calculation for Ceramic Coatings");
  System.out.println("");
  System.out.println("Author: PHNO ");
  System.out.println("Release Date: 29/11/2024");
  System.out.println("Version: 0.0.0.2v");
  System.out.println("Replit: @PHNO, @PHREPLIT");
  System.out.println("E-mail: phreplit@gmail.com");  
  System.out.println("");
  Scanner scanner8 = new Scanner(System.in);
  System.out.println("\nPress enter to return to the menu...\n");
  String enter8 = scanner8.nextLine();
  clear();
  break;
  default:
    Scanner scanner9 = new Scanner(System.in);
    System.out.println("\n Error, choose again. ");
    System.out.println("\nPress enter to return to the menu...\n");
    String enter9 = scanner9.nextLine();
    clear();
}
  } catch (Exception e) {
  Scanner scanner9 = new Scanner(System.in);
  System.out.println("\nError, system failure!");
  System.out.println("\nPress enter to return to the menu...\n");
  String enter9 = scanner9.nextLine();
  clear();
  }            
}
}
public static void clear() {
     System.out.print("\033[H\033[2J"); // clear screen
     System.out.flush();
}
}