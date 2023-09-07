# **Laporan Tugas**
# **Tugas User Case Guest Book**

## **Data Mahasiswa**
><p>Nama: Muhammad Khairunnas Nurdin</p>
><p>Kelas: 2E</p>
><p>NIM:2241720133</p>
><p>Jurusan:Teknologi Informasi</p>
><p>Politeknik Negeri Malang</p>
<br>

## **1.User Requirement**
Saya sebagai yang punya warung, pengen dibuatkan aplikasi pencatatan siapa aja pengunjung yang datang.Sehingga saya bisa mengecek daftar pengunjung hari itu dengan data nama, alamat, dan nomor hp

<br>

## **2.UML Diagram**
Berikut UML Diagram dari User Requirement diatas:

<img src="image/uml%20diagram.png">

<br>

## **3.Code Program**

A.class User:
```java
public class User {
    public String name, noHp, address, role;
}
```
<br>

B.class Guest:
```java
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
```
<br>

C.class Owner:
```java
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
```
<br>

D.Record GuestBook:
```java
import java.util.List;

public record GuestBook(List<Guest> guestList) {
}
```
<br>

E.class MainDemo:
```java
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
```
<br>

F.Hasil Run:

<img src="image/hasil%20bagian%20a.png">
<br>
<img src="image/hasil%20bagian%20b.png">
<br>
<img src="image/hasil%20bagian%20c.png">
<br>
<img src="image/hasil%20bagian%20d.png">
<br>
<img src="image/hasil%20bagian%20e.png">






