/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ujian.ujian_rpl.model;
import jakarta.persistence.*;

/**
 *
 * @author 2060
 */
@Entity
@Table (name = "Ujian")
public class ModelUjian {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id")
    private int id;
    
    @Column (name = "kd_buku", nullable = false, length = 8)
    private String kd_buku;
    
    @Column (name = "judul", nullable = false, length = 50)
    private String judul;
    
    @Column (name = "penulis")
    private String penulis;
    
    @Column (name = "tahun_terbit")
    private int tahun_terbit;

    public ModelUjian(int id, String kd_buku, String judul, String penulis, int tahun_terbit) {
        this.id = id;
        this.kd_buku = kd_buku;
        this.judul = judul;
        this.penulis = penulis;
        this.tahun_terbit = tahun_terbit;
    }

    public ModelUjian() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getkd_buku() {
        return kd_buku;
    }

    public void setkd_buku(String kd_buku) {
        this.kd_buku = kd_buku;
    }

    public String getjudul() {
        return judul;
    }

    public void setjudul(String judul) {
        this.judul = judul;
    }

    public String getpenulis() {
        return penulis;
    }

    public void setpenulis(String penulis) {
        this.penulis = penulis;
    }

    public int gettahun_terbit() {
        return tahun_terbit;
    }

    public int settahun_terbit(int tahun_terbit) {
        this.tahun_terbit = tahun_terbit;
        return 0;
    }
    
}
