/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if2.pkg10119074.latihan60.akatsuki;

/**
 *
 * @author Acer
 * Nama     : HANDRIAN RIVALDI
 * Kelas    : PBOIF2
 * NIM      : 10119074
 * Deskrifsi :
 */
public class IF210119074Latihan60Akatsuki {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Anggota pain = new Anggota("Pain (Yahiko)", "Amegakure","Jempol Kanan","Konan","Pemimpin aktif (leader)","Rambut lancip,Memiliki tindik di hidung dan di bagian tubuh,Rambut berwarna orange","零 - れい, Rei - Nol/Tidak ada");
        pain.siapaSaya();

        Anggota deidara = new Anggota("Deidara", "Iwagakure","Telunjuk Kanan","Dulu Tobi, Sebelum ada Sasori","Anggota(Almarhum)","Jutsu Spesialis ledakan menggunakan tanah liat, memanipulasi tanah liat menggunakan mulut di telapaktangan dan dada,meneropong dengan mata kiri, mata kiri yang terlatih untuk menggagalkan genjutsu Sharinggan","青龍 - せいりゅう, Seiryū - Naga Biru/Hijau - Dewa Timur dan Musim Semi");
        deidara.siapaSaya();

        Anggota konan = new Anggota("Konan", "Amegakure","Jari Tengah, Tangan Kanan","Pain","Anggota(Almarhum)","Memiiki aksesoris seperti bungan di kepala, Jutsu memanipulasi kertas bermacam bentuk origami","白虎 - びゃっこ, Byakko - Harimau Putih - Dewa Barat dan Musim Gugur");
        konan.siapaSaya();

        Anggota itachi = new Anggota("Itachi Uchiha", "Konohagakure","Jari manis, Tangan kanan","Kisame Hoshigaki","Anggota(Almarhum)","keturunan Uciha, Ahli dalam genjutsu, memakai sharinggan dan mangekyo sharinggan","朱雀 - すざく, Suzaku - Merah darah - Dewa Selatan dan Musim Panas");
        itachi.siapaSaya();

        Anggota zetsu = new Anggota("Zetsu", "Kusagakure","Kelingking kanan","Tidak ada","Anggota(Aktif)","Mempunyai dua kepribadian bentuk tubuh menyerupai tumbuhan, kanibal","玄武 - げんぶ, Genbu - Kura-Kura - Dewa Utara dan Musim Dingin");
        zetsu.siapaSaya();

        Anggota orochimaru = new Anggota("Orochimaru", "Konohagakure","Jari kelingking, Tangan kiri","Sasori","Penghianat","Penampilan seperti ular, dapat memperpanjang hidup dengan memindahkan jiwanya ke tubuh yang baru","空陳 - くうちん, Sora - Langit");
        orochimaru.siapaSaya();

        Anggota kisame = new Anggota("Kisame Hoshigaki", "Kirigakure","Jari manis, Tangan kiri","Itachi Uchiha","Anggota(Almarhum)","Penampakan seperti ikan hiu, memiliki pedang besar(Samehada) dijuluki biju tanpa ekor","南斗 - なんじゅ, Nanju - Bintang Selatan");
        kisame.siapaSaya();

        Anggota kakuzu = new Anggota("Kakuzu", "Takigakure","Jari tengah kiri","Hidan","Anggota(Almarhum)","Dapat memperpanjangn hidup dengan mengambil jantung manusia, dapat memiliki lima jantung manusia secara bersamaan , memiliki 5 elemen cakra, tubuhnya terdiri dari jaringan serat","北斗 - ほくと, Hokuto - Bintang Utara");
        kakuzu.siapaSaya();

        Anggota sasori = new Anggota("Sasori", "Sunagakure","Dulunya Orocimaru, Di ganti Deidara","Anggota(Almarhum)","Ahli boneka, tubuh boneka, spesialis racun","玉女 - ぎょくにょ, Gyokunyo - Virgo","Jempol kiri");
        sasori.siapaSaya();

        Anggota nagato = new Anggota("Nagato", "Amegakure", "Tidak Memakai Cincin","-","Konan","Pemimpin (Setelah yahiko mati)","Memiliki rinegan dan mempunyai warna rambut merah, bersal dari clan uzumaki");
        nagato.siapaSaya();

        Anggota obito = new Anggota("Obito Uchiha (Tobi)", "Konohagakure","Jempol kiri","Deidara","Anggota(Almarhum)","Memakai topeng jingga dengan satu lubang mata dengan pola pusaran yang terpusat pada mata kanan, Memiliki sharinggan dan Mangekyou Sharinggan","玉女 - ぎょくにょ, Gyokunyo - Virgo");
        obito.siapaSaya();
        
        Anggota hidan = new Anggota("Hidan", "Yugakure","Telunjuk kiri","Kakuzu","Anggota(Terkubur)","Tak bisa mati, membawa sabit besar bermata tiga, Rambut cepak berwarna pucat","三台 - さんたい, Santai - Tiga Tingkatan");
        hidan.siapaSaya();
    }
}
