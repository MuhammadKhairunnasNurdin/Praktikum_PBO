public class Guest extends User {
    public String comment;

    public Guest(String name, String noHp, String address, String comment) {
        this.name = name;
        this.noHp = noHp;
        this.address = address;
        this.role = "guest";
        this.comment = comment;
    }
}

