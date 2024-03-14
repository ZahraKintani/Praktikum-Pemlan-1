package PerpustakaanConstructor;

public class MainPerpustakaan {
    public static void main(String[] args) {

        String[][] teknologi = {{"Rekayasa Perangkat Lunak Berbasis Web", "Dwi Ningsih & Heriyanto", "380", "2018", "Andi Offset", "Lorem ipsum dolor sit amet consectetur adipiscing elit sed do"}, 
                                {"Pemrograman Python untuk Ilmuwan Data", "Ahmad Syarif Hidayatullah", "350", "2020", "Penerbit Informatika", "Lorem ipsum dolor sit amet consectetur adipiscing elit sed do eiusmod"}, 
                                {"Pengantar Sistem Informasi", "Oktavianus Irkham Wicaksono", "300", "2019", "Penerbit Andi", "Lorem ipsum dolor sit amet, consectetur adipiscing elit sed do eiusmod tempor"}, 
                                {"Jaringan Komputer", "Achmad Slamet Riyadi", "400", "2017", "Informatika", "Lorem ipsum dolor sit amet consectetur adipiscing elit sed do eiusmod tempor incididunt"}, 
                                {"Desain Antarmuka Pengguna", "Arif Wibisono", "280", "2021", "Penerbit Andi", "Lorem ipsum dolor sit amet consectetur adipiscing elit sed do eiusmod tempor incididunt ut labore"}};
        
        String[][] filsafat = {{"Pengantar Filsafat Ilmu", "M. Nasir & Nur Hasan", "350", "2016", "Penerbit Erlangga", "Lorem ipsum dolor sit amet consectetur adipiscing elit sed do"}, 
                                {"Pandangan Hidup Plato", "Djoko Suryo", "320", "2015", "Penerbit Kanisius", "Lorem ipsum dolor sit amet consectetur adipiscing elit sed do eiusmod"}, 
                                {"Filsafat Politik", "M. S. Hidayat", "280", "2019", "Penerbit Kompas", "Lorem ipsum dolor sit amet consectetur adipiscing elit sed do eiusmod tempor"}, 
                                {"Etika dalam Filsafat", "Edy Dianto", "400", "2018", "PT Gramedia Pustaka Utama", "Lorem ipsum dolor sit amet consectetur adipiscing elit sed do eiusmod tempor incididunt"}, 
                                {"Logika dan Pemikiran Kritis", "Didin Solihin", "360", "2020", "Penerbit Kencana", "Lorem ipsum dolor sit amet consectetur adipiscing elit sed do eiusmod tempor incididunt ut labore"}};

        String [][] sejarah = {{"Sejarah Nasional Indonesia", "Mochtar Buchori", "600", "2017", "Balai Pustaka", "Lorem ipsum dolor sit amet consectetur adipiscing elit sed do"}, 
                                {"Runtuhnya Kerajaan Majapahit", "Slamet Muljana", "350", "2016", "Gramedia Pustaka Utama", "Lorem ipsum dolor sit amet consectetur adipiscing elit sed do eiusmod"}, 
                                {"Sejarah Islam di Indonesia", "Husin Umar", "400", "2019", "Kepustakaan Populer Gramedia", "Lorem ipsum dolor sit amet consectetur adipiscing elit sed do eiusmod tempor"}, 
                                {"Perang Padri di Minangkabau", "Ahmad Sarji", "320", "2018", "Pustaka Al-Kautsar", "Lorem ipsum dolor sit amet consectetur adipiscing elit sed do eiusmod tempor incididunt"}, 
                                {"Sejarah Revolusi Indonesia", "Roeslan Abdulgani", "380", "2015", "Penerbit Universitas Indonesia", "Lorem ipsum dolor sit amet consectetur adipiscing elit sed do eiusmod tempor incididunt ut labore"}};

        String [][] agama = {{"Al-Qur'an dan Terjemahannya", "Lembaga Pengkajian dan Pengembangan Islam", "Varatif", "2021", "Penerbit Pustaka Imam Syafi'i", "Lorem ipsum dolor sit amet consectetur adipiscing elit sed do"}, 
                            {"Ensiklopedia Hadits", "Yusuf al-Qardhawi", "800", "2019", "Darul Falah", "Lorem ipsum dolor sit amet consectetur adipiscing elit sed do eiusmod"}, 
                            {"Tafsir Al-Mishbah", "M. Quraish Shihab", "1200", "2018", "Lentera Hati", "Lorem ipsum dolor sit amet consectetur adipiscing elit sed do eiusmod tempor"}, 
                            {"Ensiklopedia Sejarah dan Kebudayaan Islam", "Tim Penulis", "900", "2017", "PT Ichtiar Baru Van Hoeve", "Lorem ipsum dolor sit amet consectetur adipiscing elit sed do eiusmod tempor incididunt"}, 
                            {"Ensiklopedi Agama", "Departemen Agama RI", "1000", "2020", "Penerbit Erlangga", "Lorem ipsum dolor sit amet consectetur adipiscing elit sed do eiusmod tempor incididunt ut labore"}};
    
        String [][] psikologi = {{"Psikologi Kepribadian", "Alwisol", "400", "2016", "PT Remaja Rosdakarya", "Lorem ipsum dolor sit amet consectetur adipiscing elit sed do"}, 
                                {"Psikologi Sosial", "Sarlito Wirawan Sarwono", "450", "2018", "PT Eresco", "Lorem ipsum dolor sit amet consectetur adipiscing elit sed do eiusmod"}, 
                                {"Psikologi Anak", "Hurlock Elizabeth B.", "350", "2020", "Penerbit Erlangga", "Lorem ipsum dolor sit amet consectetur adipiscing elit sed do eiusmod tempor"}, 
                                {"Psikologi Perkembangan", "Robert S. Feldman", "550", "2019", "Penerbit Salemba Humanika", "Lorem ipsum dolor sit amet consectetur adipiscing elit sed do eiusmod tempor incididunt"}, 
                                {"Psikologi Industri dan Organisasi", "Aamodt Michael G.", "400", "2017", "Penerbit Salemba Empat", "Lorem ipsum dolor sit amet consectetur adipiscing elit sed do eiusmod tempor incididunt ut labore"}};
        
        String [][] politik = {{"Politik Hukum di Indonesia", "Jimly Asshiddiqie", "320", "2018", "Penerbit Kompas", "Lorem ipsum dolor sit amet consectetur adipiscing elit sed do"}, 
                                {"Demokrasi di Indonesia", "Miriam Budiardjo", "350", "2017", "Gramedia Pustaka Utama", "Lorem ipsum dolor sit amet consectetur adipiscing elit sed do eiusmod"}, 
                                {"Sistem Pemerintahan Indonesia", "Ramlan Surbakti", "380", "2019", "Rajawali Press", "Lorem ipsum dolor sit amet consectetur adipiscing elit sed do eiusmod tempor"}, 
                                {"Politik Internasional", "Soekirno", "400", "2016", "PT Eresco", "Lorem ipsum dolor sit amet consectetur adipiscing elit sed do eiusmod tempor incididunt"}, 
                                {"Partai Politik di Indonesia", "Maswadi Rauf", "300", "2018", "Ghalia Indonesia", "Lorem ipsum dolor sit amet consectetur adipiscing elit sed do eiusmod tempor incididunt ut labore"}};
    
        String [][] fiksi = {{"Laskar Pelangi", "Andrea Hirata", "368", "2005", "Penerbit Bentang", "Lorem ipsum dolor sit amet consectetur adipiscing elit sed do"}, 
                            {"Tentang Kamu", "Tere Liye", "320", "2019", "Gramedia Pustaka Utama", "Lorem ipsum dolor sit amet consectetur adipiscing elit sed do eiusmod"}, 
                            {"Bumi Manusia", "Pramoedya Ananta Toer", "498", "1980", "Hasta Mitra", "Lorem ipsum dolor sit amet consectetur adipiscing elit sed do eiusmod tempor"}, 
                            {"Perahu Kertas", "Dee Lestari", "360", "2008", "Bentang Pustaka", "Lorem ipsum dolor sit amet consectetur adipiscing elit sed do eiusmod tempor incididunt"}, 
                            {"Pulang", "Tere Liye", "328", "2018", "Gramedia Pustaka Utama", "Lorem ipsum dolor sit amet consectetur adipiscing elit sed do eiusmod tempor incididunt ut labore"}};

        ClassPerpus perpus = new ClassPerpus(teknologi, filsafat, sejarah, agama, psikologi, politik, fiksi);
        perpus.pilihBuku(0);
    }
    
}