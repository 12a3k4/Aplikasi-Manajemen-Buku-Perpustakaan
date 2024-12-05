/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.ujian.ujian_rpl.view;

import com.ujian.ujian_rpl.controller.UjianController;
import com.ujian.ujian_rpl.model.ModelTabelUjian;
import com.ujian.ujian_rpl.model.ModelUjian;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.TableModel;

/**
 *
 * @author 2060
 */
public class UjianView extends javax.swing.JFrame {

    /**
     * Creates new form UjianView
     */
    private UjianController controller;
    private List<ModelUjian> listUjian;
    public UjianView(UjianController controller) {
        this.controller = controller;
        initComponents();
        loadUjianTable();
    }
    
    public void loadUjianTable(){
        List<ModelUjian> listUjian = controller.getAllUjian();
        ModelTabelUjian ModelTabelUjiantableModel = new ModelTabelUjian(listUjian);
        dataTabel.setModel(ModelTabelUjiantableModel);
    }
    
    private UjianView() {
        throw new UnsupportedOperationException("Not supported yet");
    }
    

 
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        kd_bukuField = new javax.swing.JTextField();
        judulField = new javax.swing.JTextField();
        penulisField = new javax.swing.JTextField();
        tahun_terbitField = new javax.swing.JTextField();
        simpanButton = new javax.swing.JButton();
        hapusButton = new javax.swing.JButton();
        perbaruiButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        dataTabel = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        editButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("KD_Buku");

        jLabel2.setText("Judul");

        jLabel3.setText("Penulis");

        jLabel4.setText("Tahun Terbit");

        kd_bukuField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kd_bukuFieldActionPerformed(evt);
            }
        });

        judulField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                judulFieldActionPerformed(evt);
            }
        });

        penulisField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                penulisFieldActionPerformed(evt);
            }
        });

        tahun_terbitField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tahun_terbitFieldActionPerformed(evt);
            }
        });

        simpanButton.setText("Simpan");
        simpanButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpanButtonActionPerformed(evt);
            }
        });

        hapusButton.setText("Hapus");
        hapusButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusButtonActionPerformed(evt);
            }
        });

        perbaruiButton.setText("Perbarui");
        perbaruiButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                perbaruiButtonActionPerformed(evt);
            }
        });

        dataTabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(dataTabel);

        jLabel5.setText("Pengelolaan Buku Perpustakaan");

        editButton.setText("Edit");
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(simpanButton)
                                    .addComponent(jLabel1))
                                .addGap(43, 43, 43)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(hapusButton)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(perbaruiButton))
                                    .addComponent(tahun_terbitField)
                                    .addComponent(penulisField)
                                    .addComponent(judulField)
                                    .addComponent(kd_bukuField, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(36, 36, 36)
                        .addComponent(editButton, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(39, 39, 39))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(kd_bukuField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(judulField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(penulisField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tahun_terbitField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(simpanButton)
                    .addComponent(hapusButton)
                    .addComponent(perbaruiButton)
                    .addComponent(editButton))
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void simpanButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpanButtonActionPerformed
     
         String kd_buku = kd_bukuField.getText(); // Access directly
    String judul = judulField.getText(); // Access directly
    String penulis = penulisField.getText(); // Access directly
    int tahun_terbit = Integer.parseInt(tahun_terbitField.getText()); // Access directly

    // Create ModelUjian object with the data
    ModelUjian ujian = new ModelUjian(0, kd_buku, judul, penulis, tahun_terbit);

    // Print the details
    System.out.println(ujian.getkd_buku());
    System.out.println(ujian.getjudul());
    System.out.println(ujian.getpenulis());
    System.out.println(ujian.gettahun_terbit());

    // Add the new ujian and refresh the table
    controller.addUjian(ujian);
    loadUjianTable();
    }//GEN-LAST:event_simpanButtonActionPerformed

    private void hapusButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusButtonActionPerformed
        // TODO add your handling code here:
        JTextField idField = new JTextField(10);

        // Membuat panel untuk menampung JTextField
        JPanel panel = new JPanel();
        panel.add(new JLabel("Masukkan ID yang ingin dihapus:"));
        panel.add(idField);

        // Menampilkan dialog box dengan JTextField, tombol OK, dan Cancel
        int result = JOptionPane.showConfirmDialog(null, panel, 
            "Hapus Mahasiswa", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);

        // Jika tombol OK ditekan
        if (result == JOptionPane.OK_OPTION) {
            try {
                // Mengambil input ID dan memanggil metode deleteMhs
                int id = Integer.parseInt(idField.getText());
                controller.deleteUjian(id);
                JOptionPane.showMessageDialog(null, "Data berhasil dihapus.", "Sukses", JOptionPane.INFORMATION_MESSAGE);
                loadUjianTable();
            } catch (NumberFormatException e) {
                // Menangani error jika ID yang dimasukkan bukan angka
                JOptionPane.showMessageDialog(null, "ID harus berupa angka.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_hapusButtonActionPerformed

    private void kd_bukuFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kd_bukuFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kd_bukuFieldActionPerformed

    private void penulisFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_penulisFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_penulisFieldActionPerformed

    private void tahun_terbitFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tahun_terbitFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tahun_terbitFieldActionPerformed

    private void judulFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_judulFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_judulFieldActionPerformed

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
            int selectedRow = dataTabel.getSelectedRow(); // Mendapatkan baris yang dipilih
    
    if (selectedRow != -1) { // Pastikan ada baris yang dipilih
        TableModel model = dataTabel.getModel(); // Mendapatkan model tabel
        
        // Mengisi field input dengan data dari baris yang dipilih
        kd_bukuField.setText(model.getValueAt(selectedRow, 1).toString());
        judulField.setText(model.getValueAt(selectedRow, 2).toString());
        penulisField.setText(model.getValueAt(selectedRow, 3).toString());
        tahun_terbitField.setText(model.getValueAt(selectedRow, 4).toString());
        
        // Memperbarui data jika tombol perbarui diklik
        perbaruiButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                String kd_buku = kd_bukuField.getText();
                String judul = judulField.getText();
                String penulis = penulisField.getText();
                int tahun_terbit = Integer.parseInt(tahun_terbitField.getText());
                
                // Memperbarui model ujian dengan data baru
                ModelUjian ujian = controller.getAllUjian().get(selectedRow);
                ujian.setkd_buku(kd_buku);
                ujian.setjudul(judul);
                ujian.setpenulis(penulis);
                ujian.settahun_terbit(tahun_terbit);
                
                // Update data di model dan tabel
                controller.updateUjian(ujian);
                loadUjianTable();
                
                JOptionPane.showMessageDialog(null, "Data berhasil diperbarui!");
            }
        });
    } else {
        JOptionPane.showMessageDialog(null, "Pilih baris data yang ingin diedit!", "Peringatan", JOptionPane.WARNING_MESSAGE);
    }

        
    }//GEN-LAST:event_editButtonActionPerformed

    private void perbaruiButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_perbaruiButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_perbaruiButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UjianView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UjianView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UjianView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UjianView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UjianView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable dataTabel;
    private javax.swing.JButton editButton;
    private javax.swing.JButton hapusButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField judulField;
    private javax.swing.JTextField kd_bukuField;
    private javax.swing.JTextField penulisField;
    private javax.swing.JButton perbaruiButton;
    private javax.swing.JButton simpanButton;
    private javax.swing.JTextField tahun_terbitField;
    // End of variables declaration//GEN-END:variables

    public void setDataTabel(JTable dataTabel) {
        this.dataTabel = dataTabel;
    }

    public void setHapusButton(JButton hapusButton) {
        this.hapusButton = hapusButton;
    }

    public void setjLabel1(JLabel jLabel1) {
        this.jLabel1 = jLabel1;
    }

    public void setjLabel2(JLabel jLabel2) {
        this.jLabel2 = jLabel2;
    }

    public void setjLabel3(JLabel jLabel3) {
        this.jLabel3 = jLabel3;
    }

    public void setjLabel4(JLabel jLabel4) {
        this.jLabel4 = jLabel4;
    }

    public void setjLabel5(JLabel jLabel5) {
        this.jLabel5 = jLabel5;
    }

    public void setjScrollPane1(JScrollPane jScrollPane1) {
        this.jScrollPane1 = jScrollPane1;
    }

    public void setJudulField(JTextField judulField) {
        this.judulField = judulField;
    }

    public void setKd_bukuField(JTextField kd_bukuField) {
        this.kd_bukuField = kd_bukuField;
    }

    public void setPenulisField(JTextField penulisField) {
        this.penulisField = penulisField;
    }

    public void setPerbaruiButton(JButton perbaruiButton) {
        this.perbaruiButton = perbaruiButton;
    }

    public void setSimpanButton(JButton simpanButton) {
        this.simpanButton = simpanButton;
    }

    public void setTahun_terbitField(JTextField tahun_terbitField) {
        this.tahun_terbitField = tahun_terbitField;
    }

    private Object getkd_bukuField() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public JButton getEditButton() {
        return editButton;
    }

    public void setEditButton(JButton editButton) {
        this.editButton = editButton;
    }
}