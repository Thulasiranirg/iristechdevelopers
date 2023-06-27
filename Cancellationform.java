import java.util.Scanner;
class CancellationForm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for PNR number
        System.out.println("Cancellation Form");
        System.out.print("Enter your PNR number: ");
        String pnrNumber = scanner.nextLine();

        // Display ticket information based on PNR number
        System.out.println("\nTicket Details for PNR Number: " + pnrNumber);
        System.out.println("Passenger Name:R G Thulasirani ");
        System.out.println("Train Number:1234");
        System.out.println("Class Type: Secondclass");
        System.out.println("Date of Journey: 16-06-2023");
        System.out.println("Source: abs");
        System.out.println("Destination: xyz");

        // Prompt user to confirm cancellation
        System.out.print("\nAre you sure you want to cancel this ticket? (Press OK to confirm): ");
        String confirmation = scanner.nextLine();

        // Process cancellation
        if (confirmation.equalsIgnoreCase("OK")) {
            System.out.println("Ticket cancellation confirmed. Your ticket has been cancelled.");
            // Add code here to handle cancellation logic (e.g., update database, refund, etc.)
        } else {
            System.out.println("Ticket cancellation not confirmed. Your ticket remains valid.");
        }

        scanner.close();
    }
}