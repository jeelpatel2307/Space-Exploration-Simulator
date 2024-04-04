import java.util.Scanner;

public class SpaceExplorationSimulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Space Exploration Simulator!");
        System.out.println("Choose your destination:");
        System.out.println("1. Moon");
        System.out.println("2. Mars");
        System.out.println("3. Europa");
        System.out.println("4. Titan");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();
        
        switch(choice) {
            case 1:
                exploreMoon();
                break;
            case 2:
                exploreMars();
                break;
            case 3:
                exploreEuropa();
                break;
            case 4:
                exploreTitan();
                break;
            default:
                System.out.println("Invalid choice!");
        }
    }
    
    public static void exploreMoon() {
        System.out.println("You are exploring the Moon!");
        // Add moon exploration logic here
    }
    
    public static void exploreMars() {
        System.out.println("You are exploring Mars!");
        // Add Mars exploration logic here
    }
    
    public static void exploreEuropa() {
        System.out.println("You are exploring Europa!");
        // Add Europa exploration logic here
    }
    
    public static void exploreTitan() {
        System.out.println("You are exploring Titan!");
        // Add Titan exploration logic here
    }
}
