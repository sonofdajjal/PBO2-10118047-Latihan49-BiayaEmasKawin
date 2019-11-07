/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118047.latihan49.biayaemaskawin;

/**
 *
 * @author 
 *
 * Nama : Abdullah Margani
 * Nim : 10118047
 * Kelas: IF-2
 */
public class Emas {
    private float beratEmas;
    private int hargaEmas;

    public float getBeratEmas() {
        return beratEmas;
    }

    public void setBeratEmas(float beratEmas) {
        this.beratEmas = beratEmas;
    }

    public int getHargaEmas() {
        return hargaEmas;
    }

    public void setHargaEmas(int hargaEmas) {
        this.hargaEmas = hargaEmas;
    }
    
    public int totalHarga(){
        return (int) (hargaEmas*beratEmas);
    }
}
