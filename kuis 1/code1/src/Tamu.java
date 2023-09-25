public abstract class Tamu {
    private String nama,alamat,nomor_hp, komentar;

    public Tamu(){};

    public Tamu(String nama, String alamat, String nomor_hp, String komentar){
        this.nama = nama;
        this.alamat = alamat;
        this.nomor_hp = nomor_hp;
        this.komentar = komentar;
    };

    @Override
    public String toString() {
        return "Nama\t\t\t\t:" + nama +
                "\nAlamat\t\t\t\t: " + alamat +
                "\nNo Hp\t\t\t\t: " + nomor_hp +
                "\nKomentar\t\t\t: " + komentar
        ;
    }
}
