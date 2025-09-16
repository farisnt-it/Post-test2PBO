package com.mycompany.tanaman.main;

import com.mycompany.tanaman.model.TanamanModel;
import com.mycompany.tanaman.service.TanamanService;
import java.util.ArrayList;
import java.util.Scanner;

public class Tanaman {
    public static void main(String[] args) {
        ArrayList<TanamanModel> koleksiTanaman = new ArrayList<>();
        TanamanService service = new TanamanService();
        Scanner input = new Scanner(System.in);

        int pilihan;
        do {
            System.out.println("\n===== MENU KOLEKSI TANAMAN =====");
            System.out.println("1. Tambah Tanaman");
            System.out.println("2. Lihat Tanaman");
            System.out.println("3. Ubah Tanaman");
            System.out.println("4. Hapus Tanaman");
            System.out.println("5. Cari Tanaman");
            System.out.println("6. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {
                case 1:
                    TanamanModel baru = service.tambahTanaman();
                    if (baru != null) {
                        koleksiTanaman.add(baru);
                        System.out.println("Tanaman berhasil ditambahkan!");
                    }
                    break;
                case 2:
                    service.lihatTanaman(koleksiTanaman);
                    break;
                case 3:
                    service.ubahTanaman(koleksiTanaman);
                    break;
                case 4:
                    service.hapusTanaman(koleksiTanaman);
                    break;
                case 5:
                    service.cariTanaman(koleksiTanaman);
                    break;
                case 6:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 6);
    }
}