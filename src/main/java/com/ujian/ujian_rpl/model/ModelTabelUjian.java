/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ujian.ujian_rpl.model;

import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author 2060
 */
public class ModelTabelUjian extends AbstractTableModel{

    private List<ModelUjian> ujianList;
    private String[] columnNames = {"ID", "Kode Buku", "Judul", "Penulis", "Tahun Terbit"};
    public ModelTabelUjian(List<ModelUjian> ujianList) {
        this.ujianList = ujianList;
    }

    @Override
    public int getRowCount() {
        return ujianList.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        ModelUjian ujian = ujianList.get(rowIndex);
        return switch (columnIndex) {
            case 0 -> ujian.getId();
            case 1 -> ujian.getkd_buku();
            case 2 -> ujian.getjudul();
            case 3 -> ujian.getpenulis();
            case 4 -> ujian.gettahun_terbit();
            default -> null;
        };
    }
    
    @Override
    public String getColumnName(int column) {
        return columnNames[column]; //Mengatur Nama Kolom
    }
    
    @Override
    public boolean isCellEditable(int rowindex, int columnindex) {
        return false; //Semua sel tidak dapat diedit
    }
    
    public void setUjianList(List<ModelUjian> ujianList) {
        this.ujianList = ujianList;
        fireTableDataChanged(); //Memberitahu JTable bahwa data telah berubah
    }
    
}