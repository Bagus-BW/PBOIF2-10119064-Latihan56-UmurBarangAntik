/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119064.latihan56.umurbarangantik;

import model.Radio;

/**
 *
 * @author Bagus_24
 * NAMA         : Bagus Budi Wibowo
 * KELAS        : PBOIF2 
 * NIM          : 10119064 
 * Deskripsi Program : Program ini merupakan program untuk menampilkan 
 * umur dari barang antik
 */
public class PBOIF210119064Latihan56UmurBarangAntik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //inisialisasi objek radio
        Radio radio = new Radio(234);
        radio.setName("Radio AM");
        System.out.println("Nama barang antik : " + radio.getName());
        radio.tampilUmur();
    }
    
}
