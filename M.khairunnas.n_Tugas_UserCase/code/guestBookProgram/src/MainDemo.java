import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainDemo {
    static void menu() {
        String boundary = "====================================";
        System.out.println(boundary + "\n\t\tGuest Book MENU\t\t\n" + boundary);
        System.out.println("1.User login\n2.System.out");
        System.out.print(boundary + "\nChoose: ");
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Owner owner = new Owner();
        List<Guest> guests = new ArrayList<>();
        GuestBook guestBook = new GuestBook(guests);
        int counterOwner = 0;
        do {
            menu();
            switch (input.nextLine()) {
                case "1" -> {
                    String name, noHp, address;
                    System.out.print("Input you role (Guest or Owner): ");
                    String choice = input.nextLine();
                    if (choice.equalsIgnoreCase("guest")) {
                        System.out.println("Input your data");
                        System.out.print("Name: ");
                        name = input.nextLine();
                        System.out.print("No Hp: ");
                        noHp = input.nextLine();
                        System.out.print("Address: ");
                        address = input.nextLine();
                        System.out.print("Comment: ");
                        String comment = input.nextLine();
                        Guest guest = new Guest(name, noHp, address, comment);
                        guests.add(guest);
                    } else if (choice.equalsIgnoreCase("owner")) {
                        if (counterOwner == 0) {
                            System.out.println("Because your data is empty");
                            System.out.println("Input Owner data");
                            System.out.print("Name: ");
                            name = input.nextLine();
                            System.out.print("No Hp: ");
                            noHp = input.nextLine();
                            System.out.print("Address: ");
                            address = input.nextLine();
                            System.out.print("Business Name: ");
                            String businessName = input.nextLine();
                            owner.setOwner(name, noHp, address, businessName);
                            counterOwner++;
                        }
                        owner.getGuestBook(guestBook);
                    }
                }
                case "2" -> {
                    System.exit(0);
                }
            }
        } while (true);
    }
}

