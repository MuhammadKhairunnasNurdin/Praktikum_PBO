# **Laporan Praktikum**
# **Jobsheet 2 Class dan Object**

## **Data Mahasiswa**
><p>Nama: Muhammad Khairunnas Nurdin</p>
><p>Kelas: 2E</p>
><p>NIM:2241720133</p>
><p>Jurusan:Teknologi Informasi</p>
><p>Politeknik Negeri Malang</p>
<br>

## **1.Kompetensi**
 Mahasiswa dapat memahami deskripsi dari class dan object <br>
 Mahasiswa memahami implementasi dari class<br>
 Mahasiswa dapat memahami implementasi dari attribute<br>
 Mahasiswa dapat memahami implementasi dari method<br>
 Mahasiswa dapat memahami implementasi dari proses instansiasi<br>
 Mahasiswa dapat memahami implementasi dari try-catch<br>
 Mahasiswa dapat memahami proses pemodelan class diagram menggunakan UML

<br>

## **2.Percobaan 1**
Membuat Class Diagram <br><br>
Studi Kasus 1:
    Dalam suatu perusahaan salah satu data yang diolah adalah data karyawan. 
Setiap karyawan memiliki id, nama, jenis kelamin, jabatan, jabatan, dan gaji. 
Setiap mahasiswa juga bisa menampilkan data diri pribadi dan melihat gajinya.
<br>

## **Pertanyaan**
1. Gambarkan desain class diagram dari studi kasus 1!
    >**Jawab:** 
    <img src="image/uml%20Studi%20Kasus%201.png">

2. Sebutkan Class apa saja yang bisa dibuat dari studi kasus 1!
    >**Jawab:**
    kelas yang dibutuhkan hanya karyawan saja, karna kita hanya mengolah data karyawan untuk menampilkan data dan melihat gaji, hal ini tanpa melibatkan objek lain

3. Sebutkan atribut beserta tipe datanya yang dapat diidentifikasi dari masing-masing class dari studi kasus 1!
    >**Jawab:**
    pada class Karyawan terdapat 6 attribute, yaitu:<br>
    1.id bertipe String<br>
    2.nama bertipe String<br>
    3.alamat bertipe String<br>
    4.gender bertipe Character<br>
    5.jabatan bertipe String<br>
    6.gaji bertipe integer

4. Sebutkan method-method yang sudah anda buat dari masing-masing class pada studi kasus 1!
    >**Jawab:**
    pada class Karyawan hanya dibutuhkan 2 method berdasar studi kasus:<br>
    1.showBiodata() bertipe void<br>
    2.getWages() bertipe void

<br>

## **3.Percobaan 2**
Studi Kasus 2:<br>
Perhatikan class diagram dibawah ini. Buatlah program berdasarkan class diagram tersebut!<br>

<img src="image/uml%20Mahasiswa.png">

<br>

    A.code Mahasiswa:
```java
package praktikum;

public class Mahasiswa {
    public int nim;
    public String nama;
    public String alamat;
    public String kelas;

    public void tampilBiodata() {
        System.out.println("Nim     : " + nim);
        System.out.println("Nama    : " + nama);
        System.out.println("Alamat  : " + alamat);
        System.out.println("Kelas   : " + kelas);
    }
}
```
<br>

    B.code TestMahasiswa:
```java
package praktikum;

public class TestMahasiswa {
    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa();
        mhs1.nim = 101;
        mhs1.nama = "Lestari";
        mhs1.alamat = "Jl. Vinolia No 1A";
        mhs1.kelas = "1A";
        mhs1.tampilBiodata();
    }
}
```
>Hasil Run:<br>
><img src="image/hasil%20percobaan%202.png">
<br>

## **Pertanyaan**
1. Jelaskan pada bagian mana proses pendeklarasian atribut pada program diatas!
    >**Jawab:**
    Deklarasi attribute adalah proses penentuan tipe data beserta nama attribute tersebut, kita bisa melihat pada bagian seperti gambar dibawah ini:<br>
    <img src="image/soal%201%20percobaan%202.png">
   
2. Jelaskan pada bagian mana proses pendeklarasian method pada program diatas!
    >**Jawab:**
    Deklarasi method adalah proses deklarasi tipe method seperti void apa return beserta nama method tersebut, kita bisa melihat pada bagian seperti gambar dibawah ini:<br>
    <img src="image/soal%202%20percobaan%202.png">

3. Berapa banyak objek yang di instansiasi pada program diatas!
    >**Jawab:**
    Hanya terdapat 1 kali instansiasi objek dari Class Mahasiswa yang mempunyai nama "mhs1", kita bisa melihat pada bagian seperti gambar dibawah ini:<br>
    <img src="image/soal%203%20percobaan%202.png">

4. Apakah yang sebenarnya dilakukan pada sintaks program “mhs1.nim=101” ?
    >**Jawab:**
    pada sintaks "mhs1.nim=101" adalah proses setter data atau memasukan data pada attribute, pada kasus ini kita memasukan data "101" pada attribute "nim" di class Mahasiswa
    
5. Apakah yang sebenarnya dilakukan pada sintaks program “mhs1.tampilBiodata()” ? 
    >**Jawab:**
    pada sintaks "mhs1.tampilBiodata()" adalah proses pemanggilan atau invoking method.Dengan memanggil method "mhs1.tampilBiodata()" kita akan menjalankan method "tampilBiodata()" sesuai dengan objek "mhs1"

6. Instansiasi 2 objek lagi pada program diatas!
    >**Jawab:**
    berikut penambahan instansiasi objek:<br>
    ```java
    package praktikum;
    
    public class TestMahasiswa {
        public static void main(String[] args) {
            Mahasiswa mhs1 = new Mahasiswa();
            mhs1.nim = 101;
            mhs1.nama = "Lestari";
            mhs1.alamat = "Jl. Vinolia No 1A";
            mhs1.kelas = "1A";
            mhs1.tampilBiodata();
    
            System.out.println("================================");
    
            Mahasiswa mhs2 = new Mahasiswa();
            mhs2.nim = 102;
            mhs2.nama = "Anas";
            mhs2.alamat = "Jl. Wlingi No 4";
            mhs2.kelas = "2E";
            mhs2.tampilBiodata();
    
            System.out.println("================================");
    
            Mahasiswa mhs3 = new Mahasiswa();
            mhs3.nim = 103;
            mhs3.nama = "Tono";
            mhs3.alamat = "Jl. Blitar No 2C";
            mhs3.kelas = "1F";
            mhs3.tampilBiodata();
        }
    }
    ```
    >Hasil Run:<br>
    <img src="image/soal%206%20percobaan%202.png">
<br>

<br>

## **4.Percobaan 3**
Menulis method yang memiliki argument/parameter dan memiliki
return<br>
Langkah kerja:
1. Bukalah text editor atau IDE, misalnya Notepad ++ / netbeans.
2. Ketikkan kode program berikut ini

<br>

    A.code Barang:
```java
package praktikum;

public class Barang {
    public String namaBrg;
    public String jenisBrg;
    public int stok;

    public void tampilBarang() {
        System.out.println("Nama praktikum.Barang     : " + namaBrg);
        System.out.println("Jenis praktikum.Barang    : " + jenisBrg);
        System.out.println("Stok            : " + stok );
    }

    //method dengan argumen dan nilai balik (return)
    public int tambahStok(int brgMasuk) {
        int stokBaru = brgMasuk + stok;
        return stokBaru;
    }
}
```
<br>

    B.code TestBarang:
```java
package praktikum;

public class TestBarang {
    public static void main(String[] args) {
        Barang brg1 = new Barang();
        brg1.namaBrg = "Pensil";
        brg1.jenisBrg = "ATK";
        brg1.stok = 10;
        brg1.tampilBarang();
        //menampilkan dan mengisi argumen untuk menambahkn stok barang
        System.out.println("Stok Baru adalah " + brg1.tambahStok(20));
    }
}
```

>Hasil Run:<br>
<img src="image/hasil%20percobaan%203.png">
<br>

## **Pertanyaan**
1. Apakah fungsi argumen dalam suatu method?
    >**Jawab:**
    fungsi dari argumen adalah untuk memasukan nilai actual pada parameter ketika method dipanggil, yang digunakano di dalam fungsi tersebut.Contohnya seperti untuk method perhitungan luas persegi, ketika kita memanggil method, kita harus memberikan argumen(nilai aktual yang diteruskan pada saat fungsi dipanggil, tempat untuk nilai aktual tersebut disebut parameter) untuk panjang dan lebar untuk perhitungan luasnya

2. Ambil kesimpulan tentang kegunaan dari kata kunci return , dan kapan suatu method harus memiliki return!
    >**Jawab:**
    return method berguna untuk mengeluarkan data output dari suatu fungsi, sehingga dapat diolah pada proses selanjutnya. Kapan kita membutuhkan nilai return adalah ketika kita menginginkan data output atau kembalian nilai dari argumen yang dimasukan ke fungsi.Note: untuk menggunakan fungsi bertipe return, kita tidak boleh menulis "void" setelah access modifier pada saat deklarasi method 

<br>

## **5.Tugas Praktikum**
1. Suatu toko persewaan video game salah satu yang diolah adalah peminjaman, dimana data yang dicatat ketika ada orang yang melakukan peminjaman adalah id,nama member, nama game, dan harga yang harus dibayar. Setiap peminjaman bisa menampilkan data hasil peminjaman dan harga yang harus dibayar. Buatlah class
   diagram pada studi kasus diatas!
<br><br>
   Penjelasan:<br>
 Harga yang harus dibayar diperoleh dari lama sewa x harga.<br>
 Diasumsikan 1x transaksi peminjaman game yang dipinjam hanya 1 game saja.
    >**Jawab:**
    <img src="image/uml%20tugas%201.png">

2. Buatlah program dari class diagram yang sudah anda buat di no 1!
   >**Jawab:**<br>
   A.class SewaGame:
    ```java
    package tugas;
    
    public class SewaGame {
        //semua attribute dibuat private agar data aman dengan konsep enskapsulasi, dan
        // dibuat final agar hanya terjadi 1 kali inisialisasi data pada attribute(satu kali isi data)
        private final String id, namaMember, namaGame;
        private final int hargaBayar;
    
        public SewaGame(String id, String namaMember, String namaGame, int lamaSewa, int harga) {
            this.id = id;
            this.namaMember = namaMember;
            this.namaGame = namaGame;
            this.hargaBayar = getRentalPrice(lamaSewa, harga);
        }
    
        public void printBorrower() {
            System.out.println("=============================================");
            System.out.println("Id\t\t\t: " + id + "\nNama Member\t: " + namaMember + "\nNama Game\t: " + namaGame +
                    "\nHarga Rental: " + hargaBayar);
        }
    
        private int getRentalPrice(int lamaSewa, int harga) {
            return lamaSewa * harga;
        }
    }
    ```

    >B.class DemoSewaGame:
    ```java
    package tugas;
    
    import java.util.ArrayList;
    import java.util.List;
    
    public class DemoSewaGame {
        public static void main(String[] args) {
            List<SewaGame> sewaGameList = new ArrayList<>();
    
            sewaGameList.add(new SewaGame("001", "Anas", "God of War", 2, 10000));
            sewaGameList.add(new SewaGame("002", "Anas", "GTA 5", 8, 12000));
            sewaGameList.add(new SewaGame("003", "Tono", "Mutant Gladiator", 3, 5000));
    
            System.out.println("Berikut data Rental Game");
            sewaGameList.forEach(SewaGame::printBorrower);
        }
    }
    ```
    >Hasil Run:<br>
    <img src="image/hasil%20tugas%201.png">
   
3. Buatlah program sesuai dengan class diagram berikut ini:<br>
<img src="image/uml%20lingkaran.png">
    >**Jawab:**<br>
    A.class Lingkaran:
    ```java
    package tugas;
    
    public class Lingkaran {
    public double phi, r;
    
        public double hitungLuas() {
            return phi * (r*r);
        }
    
        public double hitungKeliling() {
            return phi * 2 * r;
        }
    }
    ```
   
    >B.class DemoLingkaran:
    ```java
    package tugas;
    
    import java.util.Scanner;
    
    public class DemoLingkaran {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            Lingkaran circle = new Lingkaran();
            circle.phi = 3.14;
            String boundary = "===========================================";
            System.out.println("Menghitung Luas dan Keliling Lingkaran\n" + boundary);
            circle.r = 10;
            System.out.println("Luas lingkaran dengan jari-jari = 10 adalah: " + circle.hitungLuas());
            circle.r = 20;
            System.out.println("Keliling lingkaran dengan jari-jari = 20 adalah: " + circle.hitungKeliling());
        }
    }
    ```
    >Hasil Run:<br>
    <img src="image/hasil%20tugas%202.png">

4. Buatlah program sesuai dengan class diagram berikut ini:<br>
<img src="image/uml%20barang.png">
<br><br>
   Deskripsi / Penjelasan :<br>
    Nilai atribut hargaDasar dalam Rupiah dan atribut diskon dalam %<br>
    Method hitungHargaJual() digunakan untuk menghitung harga jual dengan perhitungan berikut ini:<br>
   harga jual = harga dasar – (diskon x harga dasar)<br>
    Method tampilData() digunakan untuk menampilkan nilai dari kode, namaBarang, hargaDasar, diskon dan harga jual

    >**Jawab:**<br>
    A.class Barang:
    ```java
    package tugas;
    
    public class Barang {
        public String kode, namaBarang;
        public int hargaDasar;
        public float diskon;
    
        public int hitungHargaJual() {
            return (int) (hargaDasar - (diskon * hargaDasar));
        }
    
        public void tampilData() {
            System.out.println("Berikut Data Barang\n");
            System.out.println("Kode\t\t:" + kode + "\nNama Barang\t:" + namaBarang + "\nHarga Dasar\t:Rp " + hargaDasar + "\nDiskon\t\t:" + diskon + "%\nHarga Jual\t:Rp " + hitungHargaJual());
        }
    }
    ```
   
    >B.class DemoBarang:
    ```java
    package tugas;
    
    public class DemoBarang {
        public static void main(String[] args) {
            Barang item = new Barang();
            item.kode = "0001";
            item.namaBarang = "Kopi Torabika";
            item.hargaDasar = 40000;
            item.diskon = 0.1F;
    
            item.tampilData();
        }
    }
    ```
   
   >Hasil Run:<br>
   <img src="image/hasil%20percobaan%203.png">