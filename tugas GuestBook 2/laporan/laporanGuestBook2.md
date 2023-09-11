# **Laporan Tugas**
# **Tugas User Case Guest Book 2**

## **Data Mahasiswa**
><p>Nama: Muhammad Khairunnas Nurdin</p>
><p>Kelas: 2E</p>
><p>NIM:2241720133</p>
><p>Jurusan:Teknologi Informasi</p>
><p>Politeknik Negeri Malang</p>
<br>

## **List TODO**
1. kasi try catch biar ga error
   >**Jawab:**

   >Modifikasi pada Class Main:
   ```java
   import java.util.InputMismatchException;
   import java.util.Scanner;
   
   public class Main {
       public static void main(String[] args) {
           BukuPengunjung bukuPengunjung = new BukuPengunjung();
           Scanner scanner = new Scanner(System.in);
   
           while (true){
               System.out.println("Menu:");
               System.out.println("1. Tambah buku tamu");
               System.out.println("2. Lihat Buku tamu");
               System.out.println("3. Keluar");
               System.out.print("Pilih menu (1/2/3): ");
   
               try {
                   int choice = scanner.nextInt();
                   scanner.nextLine();  // Consume the newline character
   
                   switch (choice) {
                       case 1:
                           Tamu.addBukuTamu(scanner, bukuPengunjung);
                           break;
                       case 2:
                           lihatBukuTamu(bukuPengunjung);
                           break;
                       case 3:
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
       private static void lihatBukuTamu(BukuPengunjung bukuPengunjung) {
           bukuPengunjung.printTamu();
       }
   
   }
   ```
   >Hasil Run:

   <img src="image/hasil%20todo%201.png">

<br>

2. User pengen di format tampilan cetaknya
=============================<br>
nama<br>
alamat<br>
nomor hp<br>
=============================<br>
   >**Jawab:**
   > hanya perlu mengubah method toString() pada class Tamu:<br>
   <img src="image/jawaban%20todo%202.png">

   > hasil Run:<br>
   <img src="image/hasil%20todo%203b.png">
   
<br>

3. setelah seminggu client minta ditambahkan field baru yaitu komentar.
   >**Jawab:**

   > Modifikasi pada class Tamu:
   ```java
   import java.util.Scanner;
   
   public class Tamu {
       private String nama,alamat,nomor_hp, komentar;
   
       public Tamu() {
       }
   
       public Tamu(String nama, String alamat, String nomor_hp, String komentar) {
           this.nama = nama;
           this.alamat = alamat;
           this.nomor_hp = nomor_hp;
           this.komentar = komentar;
       }
   
       public String getNama() {
           return nama;
       }
   
       public void setNama(String nama) {
           this.nama = nama;
       }
   
       public String getAlamat() {
           return alamat;
       }
   
       public void setAlamat(String alamat) {
           this.alamat = alamat;
       }
   
       public String getNomor_hp() {
           return nomor_hp;
       }
   
       public void setNomor_hp(String nomor_hp) {
           this.nomor_hp = nomor_hp;
       }
   
       public String getKomentar() {
           return komentar;
       }
   
       public void setKomentar(String komentar) {
           this.komentar = komentar;
       }
   
       @Override
       public String toString() {
           return "=============================================\nNama\t:" + nama
                   + "\nAlamat\t:" + alamat
                   + "\nNo Hp\t:" + nomor_hp + "\nKomentar:" + komentar
                   + "\n=============================================";
       }
   
       /*dengan memindah method addBukuTamu dari Main class, dengan pengubahan pada field class Tamu,
        *kita tinggal mengubah class Tamu saja, tanpa mengubah class yang lain.Oleh karna itu pada todo 1 dan 2
        *kita selesaikan hanya dengan modifikasi pada class Tamu saja, dengan ini penerapan konsep enskapsulasi
        * yaitu pengelompokan method-method pada class terdekatnya terlaksana
        */
   
       public static void addBukuTamu(Scanner scanner, BukuPengunjung bukuPengunjung) {
           System.out.print("Masukkan nama Anda: ");
           String nama = scanner.nextLine();
           System.out.print("Masukkan alamat Anda: ");
           String alamat = scanner.nextLine();
           System.out.print("Masukkan nomor hp: ");
           String nomor_hp = scanner.nextLine();
           System.out.print("Masukkan komentar: ");
           String komentar = scanner.nextLine();
           Tamu tamuBaru = new Tamu(nama,alamat,nomor_hp, komentar);
           bukuPengunjung.addTamu(tamuBaru);
       }
   }
   
   ```
   >Modifikasi class Main hanya mengubah bagian case saja:
   
   ><img src="image/jawban%20todo%203_modifikasi%20Tamu.png">
   
   >Hasil Run:
   
   > <img src="image/hasil%20todo%203a.png"><br>
   > <img src="image/hasil%20todo%203b.png">

   