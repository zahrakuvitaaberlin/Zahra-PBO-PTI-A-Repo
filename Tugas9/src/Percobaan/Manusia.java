package latihaninterface;

import java.util.Scanner;

public class Manusia implements MakhlukHidup, Identitas { 
 
    private String nama; 
    private int umur; 

    // no 6
    public Manusia(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }
     
    @Override 
    public void makan() { 
        System.out.println("Makan pakai sendok garpu");} 
 
    @Override 
    public void berjalan() { 
        System.out.println("Jalan pakai dua kaki");} 
 
    @Override 
    public void bersuara() { 
        System.out.println("Suaranya merdu");} 
 
    @Override 
    public void tampilkanNama() { 
        System.out.println("Nama saya: " + this.nama);} 
 
    @Override 
    public void tampilkanUmur() { 
        System.out.println("Umur saya: " + this.umur);} 

    // no 7
    public void inputData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nama: ");
        this.nama = scanner.nextLine();
        System.out.print("Masukkan umur: ");
        this.umur = scanner.nextInt();
    }
     
} 
