/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.rachman.uas.if1.rachmanaldiansyah.no8;

/**
 *
 * @author ASUS
 */
public class PersegiPanjang implements BangunDatar {
    
    private int luas;
    private final int panjang;
    private final int lebar;

    public PersegiPanjang(int panjang, int lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }
    
    @Override
    public void hitungLuas() {
        return (panjang * lebar);
    }
}