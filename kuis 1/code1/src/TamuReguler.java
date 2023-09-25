public class TamuReguler extends Tamu {

    public TamuReguler(String nama, String alamat, String nomor_hp, String komentar) {
        super(nama, alamat, nomor_hp, komentar);
    }

    public TamuReguler() {

    }

    @Override
    public String toString() {
        return  "===============================\n" +
                super.toString()
        ;
    }
}
