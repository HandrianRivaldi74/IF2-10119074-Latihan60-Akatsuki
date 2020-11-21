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
public class Akatsuki {
    protected String nama, desa, posisi, pasangan, status, ciri;

    public Akatsuki(String nama, String desa, String posisi ,String pasangan ,String status ,String ciri) {
        this.nama     = nama;
        this.desa     = desa;
        this.posisi   = posisi;
        this.pasangan = pasangan;
        this.status   = status;
        this.ciri     = ciri;
    }

    public String getNama() {
        return nama;
    }

    public String getDesa() {
        return desa;
    }
    
    public String getPosisi() {
        return posisi;
    }
    
    public String getPasangan() {
        return pasangan;
    }
    
    public String getStatus() {
        return status;
    }
    
    public String getCiri() {
        return ciri;
    }

    public void siapaSaya() {
        System.out.println("~Biodata Anggota Akatsuki~");
        System.out.println("Nama           : ".concat(nama));
        System.out.println("Desa Asal      : ".concat(desa));
        System.out.println("Posisi Cincin  : ".concat(posisi));
        System.out.println("Pasangan       : ".concat(pasangan));
        System.out.println("Status         : ".concat(status));
        System.out.println("Ciri Khas      : ".concat(ciri));
    }
    
}
