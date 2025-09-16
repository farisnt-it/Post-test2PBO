package com.mycompany.tanaman.model;

public class TanamanModel {
    private String nama;
    private String jenis;
    private int umur;

    public TanamanModel(String nama, String jenis, int umur) {
        this.nama = nama;
        this.jenis = jenis;
        this.umur = umur;
    }

    // Getter dan setter methods
    public String getNama() { return nama; }
    public void setNama(String nama) { this.nama = nama; }
    
    public String getJenis() { return jenis; }
    public void setJenis(String jenis) { this.jenis = jenis; }
    
    public int getUmur() { return umur; }
    public void setUmur(int umur) { this.umur = umur; }

    public void tampilkanInfo() {
        System.out.println("Nama  : " + this.nama);
        System.out.println("Jenis : " + this.jenis);
        System.out.println("Umur  : " + this.umur + " bulan");
    }
}