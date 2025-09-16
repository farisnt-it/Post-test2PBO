package com.mycompany.tanaman.service;

import com.mycompany.tanaman.model.TanamanModel;
import java.util.ArrayList;
import java.util.Scanner;

public class TanamanService {
    private Scanner input = new Scanner(System.in);

    // CREATE
    public TanamanModel tambahTanaman() {
        System.out.print("Masukkan nama tanaman: ");
        String nama = input.nextLine();
        System.out.print("Masukkan jenis tanaman: ");
        String jenis = input.nextLine();

        int umur = 0;
        boolean valid = false;

        while (!valid) {
            System.out.print("Masukkan umur tanaman (bulan): ");
            String umurInput = input.nextLine();

            switch (umurInput) {
                case "":
                    System.out.println("Umur tidak boleh kosong!");
                    break;
                default:
                    if (umurInput.matches("\\d+")) {
                        umur = Integer.parseInt(umurInput);
                        valid = true;
                    } else {
                        System.out.println("Umur harus berupa angka! Silakan coba lagi.");
                    }
                    break;
            }
        }
    
    return new TanamanModel(nama, jenis, umur);
}
    // READ
    public void lihatTanaman(ArrayList<TanamanModel> koleksi) {
        if (koleksi.isEmpty()) {
            System.out.println("Belum ada data tanaman.");
        } else {
            System.out.println("\n=== Daftar Tanaman ===");
            for (int i = 0; i < koleksi.size(); i++) {
                System.out.println((i + 1) + ".");
                koleksi.get(i).tampilkanInfo();
                System.out.println("------------------");
            }
        }
    }

    // UPDATE
    public void ubahTanaman(ArrayList<TanamanModel> koleksi) {
        lihatTanaman(koleksi);
        if (!koleksi.isEmpty()) {
            System.out.print("Pilih nomor tanaman yang ingin diubah: ");
            int index = Integer.parseInt(input.nextLine());

            if (index > 0 && index <= koleksi.size()) {
                TanamanModel t = koleksi.get(index - 1);

                System.out.print("Nama baru (" + t.getNama() + "): ");
                String nama = input.nextLine();
                if (!nama.isEmpty()) t.setNama(nama);
                
                System.out.print("Jenis baru (" + t.getJenis() + "): ");
                String jenis = input.nextLine();
                if (!jenis.isEmpty()) t.setJenis(jenis);
                
                System.out.print("Umur baru (" + t.getUmur() + "): ");
                String umurInput = input.nextLine();
                if (!umurInput.isEmpty()) {
                    try {
                        int umur = Integer.parseInt(umurInput);
                        t.setUmur(umur);
                    } catch (NumberFormatException e) {
                        System.out.println("Umur harus angka, perubahan umur dibatalkan!");
                    }
                }

                System.out.println("✅ Tanaman berhasil diubah!");
            } else {
                System.out.println("Nomor tidak valid.");
            }
        }
    }

    // DELETE
    public void hapusTanaman(ArrayList<TanamanModel> koleksi) {
        lihatTanaman(koleksi);
        if (!koleksi.isEmpty()) {
            System.out.print("Pilih nomor tanaman yang ingin dihapus: ");
            int index = Integer.parseInt(input.nextLine());

            if (index > 0 && index <= koleksi.size()) {
                koleksi.remove(index - 1);
                System.out.println("✅ Tanaman berhasil dihapus!");
            } else {
                System.out.println("Nomor tidak valid.");
            }
        }
    }

    // SEARCH
    public void cariTanaman(ArrayList<TanamanModel> koleksi) {
        System.out.print("Masukkan keyword nama tanaman: ");
        String keyword = input.nextLine().toLowerCase();

        boolean found = false;
        System.out.println("\n=== Hasil Pencarian ===");
        for (TanamanModel t : koleksi) {
            if (t.getNama().toLowerCase().contains(keyword)) {
                t.tampilkanInfo();
                System.out.println("------------------");
                found = true;
            }
        }

        if (!found) {
            System.out.println("Tanaman tidak ditemukan.");
        }
    }
}