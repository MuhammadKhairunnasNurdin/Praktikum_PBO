import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SistemNilai {
    private final List<Dosen> dosenList;
    private final List<Mahasiswa> mahasiswaList;
    private final List<Nilai> nilaiList;

    public SistemNilai() {
        this.dosenList = new ArrayList<>();
        this.mahasiswaList = new ArrayList<>();
        this.nilaiList = new ArrayList<>();
    }

    public void addDosen(Dosen... obj) {
        dosenList.addAll(Arrays.asList(obj));
    }

    public void addMahasiswa(Mahasiswa... obj) {
        mahasiswaList.addAll(Arrays.asList(obj));
    }

    public void addNilai(Nilai objNilai) {
        nilaiList.add(objNilai);
    }

    public boolean isMahasiswaNonValid(Mahasiswa mahasiswa) {
        return mahasiswaList.stream().noneMatch(mahasiswa1 -> mahasiswa1.equals(mahasiswa));
    }

    public Dosen searchDosen(Dosen dosen) {
        return dosenList.stream().filter(dosen1 -> dosen1.equals(dosen)).findFirst().orElse(null);
    }

    public Mahasiswa searchMahsiswa(Mahasiswa mahasiswa) {
        return mahasiswaList.stream().filter(mahasiswa1 -> mahasiswa1.equals(mahasiswa)).findFirst().orElse(null);
    }

    private List<Nilai> searchListNilai(Mahasiswa mahasiswa) {
        return nilaiList.stream().filter(nilai -> nilai.mahasiswa().equals(mahasiswa)).collect(Collectors.toList());
    }

    public void printEvaluation(Mahasiswa mahasiswa) {
        List<Nilai> listNilaiMahasiswa = searchListNilai(mahasiswa);

        if (listNilaiMahasiswa.isEmpty()) {
            System.out.println("Nilai is undefined");
            return;
        }
        listNilaiMahasiswa.forEach(System.out::println);
    }
}
