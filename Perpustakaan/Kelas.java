package Perpustakaan;

class Kelas {
    String[][] teknologi = {{"Rekayasa Perangkat Lunak Berbasis Web", "Dwi Ningsih & Heriyanto", "380", "2018", "Andi Offset"}, 
                            {"Pemrograman Python untuk Ilmuwan Data", "Ahmad Syarif Hidayatullah", "350", "2020", "Penerbit Informatika"}, 
                            {"Pengantar Sistem Informasi", "Oktavianus Irkham Wicaksono", "300", "2019", "Penerbit Andi"}, 
                            {"Jaringan Komputer", "Achmad Slamet Riyadi", "400", "2017", "Informatika"}, 
                            {"Desain Antarmuka Pengguna", "Arif Wibisono", "280", "2021", "Penerbit Andi"}};

    String[][] filsafat = {{"Pengantar Filsafat Ilmu", "M. Nasir & Nur Hasan", "350", "2016", "Penerbit Erlangga"}, 
                            {"Pandangan Hidup Plato", "Djoko Suryo", "320", "2015", "Penerbit Kanisius"}, 
                            {"Filsafat Politik", "M. S. Hidayat", "280", "2019", "Penerbit Kompas"}, 
                            {"Etika dalam Filsafat", "Edy Dianto", "400", "2018", "PT Gramedia Pustaka Utama"}, 
                            {"Logika dan Pemikiran Kritis", "Didin Solihin", "360", "2020", "Penerbit Kencana"}};

    String [][] sejarah = {{"Sejarah Nasional Indonesia", "Mochtar Buchori", "600", "2017", "Balai Pustaka"}, 
                            {"Runtuhnya Kerajaan Majapahit", "Slamet Muljana", "350", "2016", "Gramedia Pustaka Utama"}, 
                            {"Sejarah Islam di Indonesia", "Husin Umar", "400", "2019", "Kepustakaan Populer Gramedia"}, 
                            {"Perang Padri di Minangkabau", "Ahmad Sarji", "320", "2018", "Pustaka Al-Kautsar"}, 
                            {"Sejarah Revolusi Indonesia", "Roeslan Abdulgani", "380", "2015", "Penerbit Universitas Indonesia"}};

    String [][] agama = {{"Al-Qur'an dan Terjemahannya", "Lembaga Pengkajian dan Pengembangan Islam", "Varatif", "2021", "Penerbit Pustaka Imam Syafi'i"}, 
                        {"Ensiklopedia Hadits", "Yusuf al-Qardhawi", "800", "2019", "Darul Falah"}, 
                        {"Tafsir Al-Mishbah", "M. Quraish Shihab", "1200", "2018", "Lentera Hati"}, 
                        {"Ensiklopedia Sejarah dan Kebudayaan Islam", "Tim Penulis", "900", "2017", "PT Ichtiar Baru Van Hoeve"}, 
                        {"Ensiklopedi Agama", "Departemen Agama RI", "1000", "2020", "Penerbit Erlangga"}};

    String [][] psikologi = {{"Psikologi Kepribadian", "Alwisol", "400", "2016", "PT Remaja Rosdakarya"}, 
                            {"Psikologi Sosial", "Sarlito Wirawan Sarwono", "450", "2018", "PT Eresco"}, 
                            {"Psikologi Anak", "Hurlock Elizabeth B.", "350", "2020", "Penerbit Erlangga"}, 
                            {"Psikologi Perkembangan", "Robert S. Feldman", "550", "2019", "Penerbit Salemba Humanika"}, 
                            {"Psikologi Industri dan Organisasi", "Aamodt Michael G.", "400", "2017", "Penerbit Salemba Empat"}};

    String [][] politik = {{"Politik Hukum di Indonesia", "Jimly Asshiddiqie", "320", "2018", "Penerbit Kompas"}, 
                            {"Demokrasi di Indonesia", "Miriam Budiardjo", "350", "2017", "Gramedia Pustaka Utama"}, 
                            {"Sistem Pemerintahan Indonesia", "Ramlan Surbakti", "380", "2019", "Rajawali Press"}, 
                            {"Politik Internasional", "Soekirno", "400", "2016", "PT Eresco"}, 
                            {"Partai Politik di Indonesia", "Maswadi Rauf", "300", "2018", "Ghalia Indonesia"}};

    String [][] fiksi = {{"Laskar Pelangi", "Andrea Hirata", "368", "2005", "Penerbit Bentang"}, 
                        {"Tentang Kamu", "Tere Liye", "320", "2019", "Gramedia Pustaka Utama"}, 
                        {"Bumi Manusia", "Pramoedya Ananta Toer", "498", "1980", "Hasta Mitra"}, 
                        {"Perahu Kertas", "Dee Lestari", "360", "2008", "Bentang Pustaka"}, 
                        {"Pulang", "Tere Liye", "328", "2018", "Gramedia Pustaka Utama"}};
                        

    public void ListBuku(String[][] kategori) {
        System.out.println("Buku dalam kategori ini:");
        for (int i = 0; i < kategori.length; i++) {
            System.out.println((i + 1) + ". Judul: " + kategori[i][0]);
            System.out.println("   Penulis: " + kategori[i][1]);
            System.out.println("   Jumlah Halaman: " + kategori[i][2]);
            System.out.println("   Tahun Terbit: " + kategori[i][3]);
            System.out.println("   Penerbit: " + kategori[i][4]);
            System.out.println();
        }
    }

    public void tampilkanTotalBuku() {
        int total = teknologi.length + filsafat.length + sejarah.length + agama.length + psikologi.length + politik.length + fiksi.length;
        System.out.println("Total buku yang tersedia: " + total);
    }
}
