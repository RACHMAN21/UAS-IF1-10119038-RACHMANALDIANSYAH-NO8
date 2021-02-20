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
public class Persegi implements BangunDatar {
    
    private int luas;
    private final int sisi;

    public Persegi(int sisi) {
        this.sisi = sisi;
    }
    
    @Override
    public void hitungLuas() {
        return sisi * sisi;
    }
}