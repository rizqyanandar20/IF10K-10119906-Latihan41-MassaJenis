/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if10k.pkg10119906.latihan41.massajenis;

/**
 *
 * @author senenngahenen
 * Nama     : Rizqy Ananda Rusmana
 * NIM      : 10119906
 * Kelas    : IF-10K
 * Program  : Massa Jenis
 */
public class IF10K10119906Latihan41MassaJenis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int volume,parMassa;
        kubus jenis = new kubus();
        System.out.println("======Massa Jenis Kubus======");
        System.out.println("Sisi\t = " + jenis.getSisi());
        System.out.println("Massa\t = " + jenis.getMassa());

        System.out.println("======Hasil Perhitungan======");
        parMassa = jenis.getMassa();
        volume = jenis.hitungVolume(jenis.getSisi());
        System.out.println("Volume\t = " + jenis.hitungVolume(jenis.getSisi()));
        System.out.println("Massa\t = " + jenis.hitungMassaJenis(parMassa, volume));
        

    }
}
