/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas.pertemuan.pkg4.pbo;

/**
 *
 * @author akriz
 */
public class kubus {
    double sisi;
    
    public kubus(double sisi){
        this.sisi = sisi;
    }
    
    public double hitungVolume(){
        return sisi*sisi*sisi;
    }
    
    public double hitungLuasPermukaan(){
        return 6*sisi*sisi;
    }
}
