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
 */
public class kubus {
    private int massa=250;
    private int sisi=5;
     /**
     * @return int return the massa
     */
    public int getMassa() {
        return massa;
    }

    /**
     * @param massa the massa to set
     */
    public void setMassa(int massa) {
        this.massa = massa;
    }

    /**
     * @return int return the sisi
     */
    public int getSisi() {
        return sisi;
    }

    /**
     * @param sisi the sisi to set
     */
    public void setSisi(int sisi) {
        this.sisi = sisi;
    }

    public int hitungVolume(int parSisi) {

        int volume = sisi*sisi*sisi;

        return volume;
    }
    public int hitungMassaJenis(int parMassa, int volume) {

        int massaJ = massa/volume;

        return massaJ;
    }
    
}
