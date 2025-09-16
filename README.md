# Posttest2 - Aplikasi CRUD Koleksi Tanaman (Java Console)

Program ini adalah aplikasi sederhana berbasis console untuk mengelola koleksi tanaman.  
Program menggunakan *Java* dengan **ArrayList** untuk menyimpan data, serta menyediakan fitur *CRUD* (Create, Read, Update, Delete) dan *Search*.  
Tema yang dipilih adalah *koleksi tanaman*, sehingga pengguna dapat menambah, melihat, mengubah, menghapus, serta mencari daftar tanaman yang mereka miliki.

##  Fitur

- **Tambah Tanaman (Create):** Menambah data tanaman baru (nama, jenis, umur).  
- **Lihat Tanaman (Read):** Menampilkan daftar koleksi tanaman.  
- **Ubah Tanaman (Update):** Mengubah data tanaman tertentu.  
- **Hapus Tanaman (Delete):** Menghapus tanaman dari daftar.  
- **Cari Tanaman (Search):** Mencari tanaman berdasarkan nama.  
- **Keluar:** Menutup aplikasi.  

##  Struktur Packages (MVC)

Aplikasi ini menerapkan pola **MVC sederhana** dengan pembagian package:

<img width="470" height="221" alt="image" src="https://github.com/user-attachments/assets/320b6896-e7e7-4318-95a3-b957bf2ea385" />


- **Packages main** → Menyimpan kode menu utama untuk interaksi dengan user.  
- **Packages model** → Menyimpan struktur data (`nama`, `jenis`, `umur`) serta constructor & accessor.  
- **Packages service** → Menyimpan logika bisnis (CRUD, validasi, search).  

##  Implementasi Konsep OOP
- **Minimal 3 class** → `Tanaman`, `TanamanModel`, `TanamanService`.  
- **Minimal 3 properties** → `nama`, `jenis`, `umur`.  
- **Constructor** → Digunakan pada `TanamanModel`.  
- **Access modifier** → Properti bersifat *private*, diakses melalui *getter & setter*.  
- **Packages** → Dipisahkan sesuai fungsi (main, service, model).  
- **Nilai tambah:**  
  - Penerapan **MVC sederhana**.  
  - **Validasi input** (umur harus angka).  
  - Fitur **Search** berdasarkan nama tanaman.  

##  Alur Program
1. Program menampilkan **menu utama** berisi pilihan fitur.  
2. Pengguna memilih menu dengan memasukkan angka (1–6).  
3. Program menjalankan aksi sesuai menu:
   - **1 → Tambah Tanaman**
   - **2 → Lihat Tanaman**
   - **3 → Ubah Tanaman**
   - **4 → Hapus Tanaman**
   - **5 → Cari Tanaman**
   - **6 → Keluar**
4. Setelah setiap aksi, program kembali ke menu utama, kecuali jika pengguna memilih keluar.  

## Fitur & Contoh Input/Output

- **Tampilan Menu Utama**  
  User diberikan 6 pilihan menu: Tambah Tanaman, Lihat Tanaman, Ubah Tanaman, Hapus Tanaman, Cari Tanaman, atau Keluar.  

<img width="422" height="234" alt="image" src="https://github.com/user-attachments/assets/be8d6b48-79d9-4527-9253-b08ee2b0818c" />

---

- **Tambah Tanaman (Create)**  
  Input: Nama, Jenis, dan Umur tanaman.  
  Kemudian data otomatis disimpan dalam `ArrayList<TanamanModel>`.  Jika telah memnuhi syarat validasi 

<img width="483" height="302" alt="image" src="https://github.com/user-attachments/assets/ef7af6a5-495b-4331-9800-fd7789a794d7" />

jika user gagal untuk memenuhi syarat validasi yaitu memasukan int kedalam input bulan maka user akan mengalami loop hinga user menginput inputan yang benar

<img width="463" height="348" alt="image" src="https://github.com/user-attachments/assets/23412597-4e81-49cb-885e-c6fc777b0970" />

  
---

- **Lihat Tanaman (Read)**  
  - Jika daftar kosong → tampil pesan *"Belum ada tanaman"*.  

    <img width="381" height="226" alt="image" src="https://github.com/user-attachments/assets/82a9a84b-8e19-4c9e-9a92-93801adfc47e" />


  - Jika ada → tampil semua tanaman dengan format:  

    <img width="414" height="486" alt="image" src="https://github.com/user-attachments/assets/f5c0840e-3818-44fe-86a6-75ff4b22cbb1" />


---

- **Ubah Tanaman (Update)**  
  - Cari tanaman berdasarkan nomor urut.  
  - Jika ketemu → user bisa mengganti data tanaman di koleksi.
  - User bisa mengupdate data dari suatu tanaman yang sudah dimasuki dengan cara memasuki menginput Nama, Jenis, Umur baru untuk tanaman tersebut  

    <img width="646" height="507" alt="image" src="https://github.com/user-attachments/assets/fa8dc994-d369-4f60-966d-c1f71c5d4584" />


  - Jika tidak ditemukan → tampil pesan *"Nomor tidak valid"*.  

    <img width="486" height="414" alt="image" src="https://github.com/user-attachments/assets/82027496-ac40-42dc-93ca-b8114303c311" />


---

- **Hapus Tanaman (Delete)**  
  - Cari tanaman berdasarkan nomor urut.  
  - Jika ketemu → tanaman dapat dihapus dari daftar.
  - Dengan user memasukan nomor tanaman yang ingin di hapus

    <img width="463" height="420" alt="image" src="https://github.com/user-attachments/assets/6f0e39e6-c90a-4090-afb3-03c7c6983cd2" />


  - Jika tidak ditemukan → tampil pesan *"Nomor tidak valid"*.  

    <img width="484" height="417" alt="image" src="https://github.com/user-attachments/assets/4cdf2c95-83ba-43f1-833c-befaba89f1e4" />


---

- **Cari Tanaman (Search)**  
  - User memasukkan keyword nama.  
  - Jika ada → tampil data tanaman yang sesuai.
 
    <img width="449" height="361" alt="image" src="https://github.com/user-attachments/assets/f3367330-7908-4e9a-ab58-21bb66413dbf" />

  - Jika tidak → tampil pesan *"Tanaman tidak ditemukan"*.
 
    <img width="466" height="297" alt="image" src="https://github.com/user-attachments/assets/81f7deb6-54cb-44eb-8f0a-4a16c3d25c03" />
 

---

- **Keluar Program**  
  Program berhenti saat user memilih menu `6`.  

  <img width="774" height="376" alt="image" src="https://github.com/user-attachments/assets/53b26e03-f8e8-4ddf-aca3-0d2e62ca6fab" />



