package PeminjamanBuku;

import java.util.Scanner;

public class PeminjamanBuku {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("======================================================");
        System.out.print("Nim    : ");
        String nim = sc.nextLine().trim();
        System.out.print("Nama   : ");
        String nama = sc.nextLine().trim();

        Mahasiswa m = new Mahasiswa(nim, nama);

        while(true) {
            System.out.println();
            System.out.print("Masukkan No ISBN (atau ketik ENTER utk selesai) : ");
            String isbn = sc.nextLine().trim();
            if (isbn.isEmpty()) break;
            System.out.print("Judul buku : ");
            String judul = sc.nextLine().trim();

            Buku b = new Buku(isbn, judul);
            m.pinjam(b);
            System.out.println("Buku ditambahkan.");
        }
        System.out.println();
        System.out.println("==========================================================");
        System.out.println("Nim   : " + m.getNim());
        System.out.println("Nama  : " + m.getNama());
        System.out.println("----------------------------------------------------------");
        System.out.printf("| %-3s | %-15s | %-30s |%n", "No", "Isbn", "Judul");
        System.out.println("----------------------------------------------------------");

        int no = 1;
        for (Buku bx : m.getPinjaman()) {
            String judulOut = bx.getJudul();
            if (judulOut.length() > 30) judulOut = judulOut.substring(0, 27) + "...";
            System.out.printf("| %-3d | %-15s | %-30s |%n", no, bx.getIsbn(), judulOut);
            no++;
        }
        System.out.println("----------------------------------------------------------");
        sc.close();
    }
}
