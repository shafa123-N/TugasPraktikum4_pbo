/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas.pertemuan.pkg4.pbo;

/**
 *
 * @author akriz
 */
public class hasilPerhitungan {
    public static void  main(String[] args){
        
        kubus kbs = new kubus(5);
        System.out.println("Volume kubus: " + kbs.hitungVolume());
        System.out.println("Luas permukaan kubus: " + kbs.hitungLuasPermukaan());
        
        
        balok blk = new balok(2,3,4);
        System.out.println("Volume balok: " + blk.hitungVolume());
        System.out.println("Luas permukaan balok: " + blk.hitungLuasPermukaan());
    }
}
