/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas.pertemuan.pkg4.pbo;

/**
 *
 * @author akriz
 */
public class balok {
    double panjang, lebar, tinggi;
 
    public balok(double panjang, double lebar, double tinggi){
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }
    
    public double hitungVolume(){
        return panjang*lebar*tinggi;
    }
    
    public double hitungLuasPermukaan(){
        return 2*(panjang*lebar + panjang*tinggi + lebar*tinggi);
    }
}
