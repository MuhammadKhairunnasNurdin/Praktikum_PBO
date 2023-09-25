public class TamuVip extends Tamu {

    private String hubunganKeluarga;

    public TamuVip(String nama, String alamat, String nomor_hp, String komentar, String hubunganKeluarga) {
        super(nama, alamat, nomor_hp, komentar);
        this.hubunganKeluarga = hubunganKeluarga;
    }

    public TamuVip() {

    }

    @Override
    public String toString() {
        return  "*******************************\n" +
                super.toString() +
                "\nHubungan Keluarga\t: " + this.hubunganKeluarga
        ;
    }
}
