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
public class Anggota extends Akatsuki {
    private String cincin;

    public Anggota(String nama, String desa, String posisi, String pasangan, String status, String ciri, String cincin) {
        super(nama, desa, posisi, pasangan, status, ciri);
        this.cincin = cincin;
    }

    public String getCincin() {
        return cincin;
    }

    @Override
    public void siapaSaya() {
        super.siapaSaya();
        System.out.println("Cincin : ".concat(cincin).concat("\n"));
    }
}
