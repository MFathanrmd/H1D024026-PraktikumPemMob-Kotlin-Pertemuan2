# H1D024026-PraktikumPemMob-Kotlin-Pertemuan3

Halo! 👋 Ini adalah repository untuk tugas **Praktikum Pemrograman Mobile - Pertemuan 3**.

## 📝 Apa aja yang dikerjain di Pertemuan 3 ini?

Di pertemuan kali ini, kita fokus belajar cara bikin **List & Grid View** yang efisien di Android pakai Jetpack Compose. Intinya sih bikin tampilan aplikasi katalog/toko online sederhana gitu, lengkap sama daftarnya.

Beberapa poin penting yang udah diimplementasikan:
1. **Data Class & Dummy Data**: 
   - Bikin struktur data `Category` dan `Product` biar rapi.
   - Bikin object singleton `DummyData` buat nampung data bohongan (kategori Makanan, Minuman, Kerajinan beserta daftar produknya).
2. **Custom Composable Components**:
   - `CategoryItem`: Bikin tombol filter kategori bentuk pil (oval) yang warnanya bisa berubah (hijau kalau aktif, abu-abu kalau nggak).
   - `ProductItemCard`: Bikin kartu produk kekinian lengkap dengan gambar (pakai logo hijau), nama produk, harga, sisa stok, dan ada *badge*/label nama kategorinya di pojok kanan atas. Kalau diklik bakal munculin notif *Toast*.
3. **LazyRow & LazyVerticalGrid**:
   - Pakai `LazyRow` buat nampilin daftar kategori yang bisa di-scroll ke samping secara horizontal. Cocok banget biar hemat memori (cuma render yang kelihatan di layar).
   - Pakai `LazyVerticalGrid` buat nampilin daftar produk ke dalam 2 kolom. Biar rapi kayak etalase toko! 🛒
4. **Theme Customization**:
   - Ngubah warna bawaan aplikasi (dari ungu jadi hijau elegan ala-ala UMKM lokal) dengan ngedit `Color.kt` dan `Theme.kt`.

## 🛠️ Teknologi yang Dipakai
- Kotlin
- Jetpack Compose (Modern UI Toolkit)
- Material Design 3 (Material3)

Semoga berkah dan dapet nilai A! Aamiin. 🚀