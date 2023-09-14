import java.util.Objects;

public record Matkul(String nama) {
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Matkul matkul)) return false;
        return Objects.equals(nama, matkul.nama);
    }
}


