package PeminjamanBuku;

import java.util.ArrayList;
import java.util.List;

public class Mahasiswa {
    private String nim;
    private String nama;
    private List<Buku> pinjaman;

    public Mahasiswa(String nim, String nama) {
        this.nim = nim;
        this.nama = nama;
        this.pinjaman = new ArrayList<>();
    }
    public void pinjam(Buku b) {
        pinjaman.add(b);
    }
    public String getNim() {
        return nim;
    }
    public String getNama() {
        return nama;
    }
    public List<Buku> getPinjaman() {
        return pinjaman;
    }
}
