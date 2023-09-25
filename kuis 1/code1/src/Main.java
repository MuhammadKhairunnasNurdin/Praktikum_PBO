import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BukuPengunjung bukuPengunjung = new BukuPengunjung();
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("Menu:");
            System.out.println("1. Tambah Buku tamu");
            System.out.println("2. Lihat Buku tamu Vip");
            System.out.println("3. Lihat Buku tamu Reguler");
            System.out.println("4. Lihat Buku tamu semua");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu (1/2/3/4/5): ");

            try {
                int choice = scanner.nextInt();
                scanner.nextLine();  // Consume the newline character

                switch (choice) {
                    case 1:
                        System.out.print("Pilih Buku Tamu (Vip or Reguler): ");
                        String input = scanner.next();
                        scanner.nextLine();  // Consume the newline character
                        if (input.equalsIgnoreCase("vip")) {
                            addBukuTamu(scanner, bukuPengunjung, new TamuVip());
                        } else if (input.equalsIgnoreCase("reguler")) {
                            addBukuTamu(scanner, bukuPengunjung, new TamuReguler());
                        } else {
                            System.out.println("Pilihan tidak valid, silakan pilih vip atau reguler");
                        }
                        break;
                    case 2:
                        lihatTamuVip(bukuPengunjung);
                        break;
                    case 3:
                        lihatTamuReguler(bukuPengunjung);
                        break;
                    case 4:
                        lihatBukuTamuAll(bukuPengunjung);
                        break;
                    case 5:
                        System.out.println("Terima kasih! Program selesai.");
                        scanner.close();
                        System.exit(0);
                    default:
                        System.out.println("Pilihan tidak valid. Silakan pilih 1, 2, atau 3.");
                }
            } catch (InputMismatchException ime) {
                // this to handle Exception when you have mismatch in Scanner
                System.out.println("Your input is Mismatch At: " + ime.getStackTrace()[4]);
                System.out.println("Input Scanner with right way!!!\n");
                scanner.nextLine();// this code for stopping do-while for stackOverflow
            }
        }
    }

    private static void lihatTamuVip(BukuPengunjung bukuPengunjung) {
        bukuPengunjung.printTamuVip();
    }

    private static void lihatTamuReguler(BukuPengunjung bukuPengunjung) {
        bukuPengunjung.printTamuReguler();
    }


    private static void lihatBukuTamuAll(BukuPengunjung bukuPengunjung) {
        bukuPengunjung.printAllTamu();
    }

    private static void addBukuTamu(Scanner scanner, BukuPengunjung bukuPengunjung, Tamu tamu) {
        System.out.print("Masukkan nama Anda: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan alamat Anda: ");
        String alamat = scanner.nextLine();
        System.out.print("Masukkan nomor hp: ");
        String nomor_hp = scanner.nextLine();
        System.out.print("Masukkan komentar: ");
        String komentar = scanner.nextLine();
        if (tamu instanceof TamuVip) {
            System.out.print("Masukan hubungan keluarga: ");
            String hubunganKeluarga = scanner.nextLine();
            TamuVip tamuVip = new TamuVip(nama, alamat, nomor_hp, komentar, hubunganKeluarga);
            bukuPengunjung.addTamuVip(tamuVip);
        }
        if (tamu instanceof TamuReguler) {
            TamuReguler tamuReguler = new TamuReguler(nama, alamat, nomor_hp, komentar);
            bukuPengunjung.addTamuReguler(tamuReguler);
        }
    }
}

//todo : 1 kasi try catch biar ga error
//todo : 2 user pengen di format tampilan cetak nya
// =============================
// nama
// alamat
// nomor hp
// =============================
//todo : 3 setelah seminggu client minta ditambahkan field baru yaitu komentar.
