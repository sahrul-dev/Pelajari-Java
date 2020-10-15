/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
// package handphone;

/**
 *
 * @author Mohammad Sahrullah
 */
//Parent class

public class Handphone {
    private String merk;
    private String tipe;
    private int harga;

    
    public void Hp(String merk, String tipe, int harga) {
        this.merk = merk;
        this.tipe = tipe;
        this.harga = harga;
    }
    
    public String getMerk() {
        return merk;
    }

    public String getTipe() {
        return tipe;
    }

    public int getHarga() {
        return harga;
    }

    
    
   
}
