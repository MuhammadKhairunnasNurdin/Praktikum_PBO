public class Owner extends User{
    public String businessName;

    public void setOwner(String name, String noHp, String address, String businessName) {
        this.name = name;
        this.noHp = noHp;
        this.address = address;
        this.role = "Owner";
        this.businessName = businessName;
    }

    public void getGuestBook(GuestBook guestBook) {
        String boundary = "====================================";
        System.out.println(boundary + "\nOwner " + businessName + " Data");
        System.out.println("Name: " + name + "\nNo Hand Phone: " + noHp + "\nAddress: " + address);
        System.out.println(boundary);
        System.out.println("\nThis Guest Data");
        guestBook.guestList().forEach(guest -> {
            System.out.println(boundary);
            System.out.println("Name: " + guest.name + "\nNo Hand Phone: " + guest.noHp + "\nAddress: " + guest.address + "\nComment: " + guest.comment);
        });
    }
}
