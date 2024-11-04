/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package main;

import Koneksi.koneksi;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import login.Login;

public class AdminPage extends javax.swing.JFrame {
    
    
    /**
     * Creates new form menuutama
     */
    public AdminPage() {
        initComponents();
        viewData();
        viewDataProduk();
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        layoutkiri = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        line = new javax.swing.JPanel();
        bt_profile = new javax.swing.JButton();
        bt_logout = new javax.swing.JButton();
        layoutkanan = new javax.swing.JPanel();
        pn_dasar = new javax.swing.JPanel();
        pn_utama = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        bt_simpandu = new javax.swing.JButton();
        bt_hapusdu = new javax.swing.JButton();
        bt_bataldu = new javax.swing.JButton();
        txt_caridu = new javax.swing.JTextField();
        bt_caridu = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel_us = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabel_dp = new javax.swing.JTable();
        bt_simpandp = new javax.swing.JButton();
        bt_hapusdp = new javax.swing.JButton();
        bt_bataldp = new javax.swing.JButton();
        txt_caridp = new javax.swing.JTextField();
        bt_caridp = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        layoutkiri.setBackground(new java.awt.Color(255, 204, 255));
        layoutkiri.setForeground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_logo_kasir.png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(121, 121, 121));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Kasir");

        line.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout lineLayout = new javax.swing.GroupLayout(line);
        line.setLayout(lineLayout);
        lineLayout.setHorizontalGroup(
            lineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 302, Short.MAX_VALUE)
        );
        lineLayout.setVerticalGroup(
            lineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        bt_profile.setBackground(new java.awt.Color(255, 255, 255));
        bt_profile.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        bt_profile.setForeground(new java.awt.Color(0, 0, 0));
        bt_profile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/profile_user_account_icon.png"))); // NOI18N
        bt_profile.setText("PROFILE");
        bt_profile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_profileActionPerformed(evt);
            }
        });

        bt_logout.setBackground(new java.awt.Color(255, 255, 255));
        bt_logout.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        bt_logout.setForeground(new java.awt.Color(0, 0, 0));
        bt_logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logout_icon.png"))); // NOI18N
        bt_logout.setText("LOGOUT");
        bt_logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_logoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layoutkiriLayout = new javax.swing.GroupLayout(layoutkiri);
        layoutkiri.setLayout(layoutkiriLayout);
        layoutkiriLayout.setHorizontalGroup(
            layoutkiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layoutkiriLayout.createSequentialGroup()
                .addGap(0, 101, Short.MAX_VALUE)
                .addGroup(layoutkiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(bt_logout, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_profile, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(96, 96, 96))
            .addGroup(layoutkiriLayout.createSequentialGroup()
                .addGroup(layoutkiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layoutkiriLayout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3))
                    .addGroup(layoutkiriLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(line, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layoutkiriLayout.setVerticalGroup(
            layoutkiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layoutkiriLayout.createSequentialGroup()
                .addGroup(layoutkiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layoutkiriLayout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jLabel1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layoutkiriLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3)
                        .addGap(30, 30, 30)))
                .addComponent(line, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80)
                .addComponent(bt_profile, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(bt_logout)
                .addContainerGap(388, Short.MAX_VALUE))
        );

        getContentPane().add(layoutkiri, java.awt.BorderLayout.LINE_START);

        layoutkanan.setBackground(new java.awt.Color(255, 255, 255));
        layoutkanan.setLayout(new java.awt.BorderLayout());

        pn_dasar.setBackground(new java.awt.Color(255, 255, 255));

        pn_utama.setBackground(new java.awt.Color(255, 204, 255));
        pn_utama.setLayout(new java.awt.BorderLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 153));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1473, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        pn_utama.add(jPanel2, java.awt.BorderLayout.PAGE_START);

        jTabbedPane1.setForeground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 153));

        bt_simpandu.setText("TAMBAH");
        bt_simpandu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_simpanduActionPerformed(evt);
            }
        });

        bt_hapusdu.setText("HAPUS");
        bt_hapusdu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_hapusduActionPerformed(evt);
            }
        });

        bt_bataldu.setText("BATAL");
        bt_bataldu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_batalduActionPerformed(evt);
            }
        });

        bt_caridu.setText("CARI");
        bt_caridu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_cariduActionPerformed(evt);
            }
        });

        tabel_us.setBackground(new java.awt.Color(255, 255, 255));
        tabel_us.setForeground(new java.awt.Color(0, 0, 0));
        tabel_us.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "FULLNAME", "USERNAME", "PASSWORD", "LEVEL"
            }
        ));
        tabel_us.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabel_usMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabel_us);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(bt_simpandu)
                        .addGap(18, 18, 18)
                        .addComponent(bt_hapusdu)
                        .addGap(18, 18, 18)
                        .addComponent(bt_bataldu)
                        .addGap(489, 489, 489)
                        .addComponent(bt_caridu)
                        .addGap(18, 18, 18)
                        .addComponent(txt_caridu, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(43, 43, 43))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_simpandu)
                    .addComponent(bt_hapusdu)
                    .addComponent(bt_bataldu)
                    .addComponent(txt_caridu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_caridu))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
        );

        jTabbedPane1.addTab("Data User", jPanel1);

        jPanel3.setBackground(new java.awt.Color(255, 255, 153));

        tabel_dp.setBackground(new java.awt.Color(255, 255, 255));
        tabel_dp.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "KODE PRODUK", "NAMA PRODUK", "GAMBAR PRODUK", "KATEGORI PRODUK", "SUPPLIER", "HARGA JUAL", "HARGA BELI", "STOK PRODUK"
            }
        ));
        jScrollPane2.setViewportView(tabel_dp);

        bt_simpandp.setText("TAMBAH");
        bt_simpandp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_simpandpActionPerformed(evt);
            }
        });

        bt_hapusdp.setText("HAPUS");
        bt_hapusdp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_hapusdpActionPerformed(evt);
            }
        });

        bt_bataldp.setText("BATAL");
        bt_bataldp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_bataldpActionPerformed(evt);
            }
        });

        txt_caridp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_caridpActionPerformed(evt);
            }
        });

        bt_caridp.setText("CARI");
        bt_caridp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_caridpActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(bt_simpandp)
                        .addGap(18, 18, 18)
                        .addComponent(bt_hapusdp)
                        .addGap(18, 18, 18)
                        .addComponent(bt_bataldp)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bt_caridp)
                        .addGap(18, 18, 18)
                        .addComponent(txt_caridp, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1030, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(423, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_simpandp)
                    .addComponent(bt_hapusdp)
                    .addComponent(bt_bataldp)
                    .addComponent(txt_caridp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_caridp))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 55, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Data Produk", jPanel3);

        jPanel4.setBackground(new java.awt.Color(255, 255, 153));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1473, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 652, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Riwayat Transaksi", jPanel4);

        pn_utama.add(jTabbedPane1, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout pn_dasarLayout = new javax.swing.GroupLayout(pn_dasar);
        pn_dasar.setLayout(pn_dasarLayout);
        pn_dasarLayout.setHorizontalGroup(
            pn_dasarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_dasarLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(pn_utama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pn_dasarLayout.setVerticalGroup(
            pn_dasarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_dasarLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(pn_utama, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        layoutkanan.add(pn_dasar, java.awt.BorderLayout.CENTER);

        getContentPane().add(layoutkanan, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_logoutActionPerformed
        this.dispose();
        
        Login loginFrame = new Login();
        loginFrame.setVisible(true);
    }//GEN-LAST:event_bt_logoutActionPerformed

    private void bt_profileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_profileActionPerformed
        // TODO add your handling code here:
        Profile profile = new Profile(); // Buat instance baru dari Profile
        profile.setUsername(CurrentUser.username); // Gunakan CurrentUser untuk mendapatkan username yang sedang login
        profile.setVisible(true); // Tampilkan profil
        this.dispose(); // Tutup halaman saat ini jika perlu
    }//GEN-LAST:event_bt_profileActionPerformed

    private void tabel_usMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabel_usMouseClicked
        // TODO add your handling code here:
        // TODO add your handling code here:
        int row = tabel_us.getSelectedRow();
        int col = tabel_us.getSelectedColumn();

        if (row != -1 && col != -1) {
            String id = tabel_us.getValueAt(row, 0).toString();
            String fieldName = tabel_us.getColumnName(col);
            String oldValue = tabel_us.getValueAt(row, col).toString();

            String newValue = JOptionPane.showInputDialog(null, "Update " + fieldName, oldValue);

            if (newValue != null && !newValue.trim().isEmpty()) {
                updateData(id, fieldName, newValue);
                viewData(); // Refresh tabel setelah update
            }
        }
    }//GEN-LAST:event_tabel_usMouseClicked

    private void bt_cariduActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_cariduActionPerformed
        // TODO add your handling code here:
        pencarian();
    }//GEN-LAST:event_bt_cariduActionPerformed

    private void bt_batalduActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_batalduActionPerformed
        // TODO add your handling code here:
        viewData();
    }//GEN-LAST:event_bt_batalduActionPerformed

    private void bt_hapusduActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_hapusduActionPerformed
        // TODO add your handling code here:
        hapusData();
    }//GEN-LAST:event_bt_hapusduActionPerformed

    private void bt_simpanduActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_simpanduActionPerformed
        // TODO add your handling code here:
        TambahData tambahDataDialog = new TambahData(AdminPage.this); // Mengoper 'this' sebagai referensi ke DataUser
        tambahDataDialog.setVisible(true); // Menampilkan dialog
    }//GEN-LAST:event_bt_simpanduActionPerformed

    private void txt_caridpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_caridpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_caridpActionPerformed

    private void bt_simpandpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_simpandpActionPerformed
        // TODO add your handling code here:
        TambahProduk tp = new TambahProduk(this, true);
        tp.setVisible(true); 
    }//GEN-LAST:event_bt_simpandpActionPerformed

    private void bt_hapusdpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_hapusdpActionPerformed
        // TODO add your handling code here:
        hapusDataProduk();
    }//GEN-LAST:event_bt_hapusdpActionPerformed

    private void bt_bataldpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_bataldpActionPerformed
        // TODO add your handling code here:
         viewDataProduk();
    }//GEN-LAST:event_bt_bataldpActionPerformed

    private void bt_caridpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_caridpActionPerformed
        // TODO add your handling code here:
        pencarianDataProduk();
    }//GEN-LAST:event_bt_caridpActionPerformed

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
            java.util.logging.Logger.getLogger(AdminPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_bataldp;
    private javax.swing.JButton bt_bataldu;
    private javax.swing.JButton bt_caridp;
    private javax.swing.JButton bt_caridu;
    private javax.swing.JButton bt_hapusdp;
    private javax.swing.JButton bt_hapusdu;
    private javax.swing.JButton bt_logout;
    private javax.swing.JButton bt_profile;
    private javax.swing.JButton bt_simpandp;
    private javax.swing.JButton bt_simpandu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel layoutkanan;
    private javax.swing.JPanel layoutkiri;
    private javax.swing.JPanel line;
    private javax.swing.JPanel pn_dasar;
    private javax.swing.JPanel pn_utama;
    private javax.swing.JTable tabel_dp;
    private javax.swing.JTable tabel_us;
    private javax.swing.JTextField txt_caridp;
    private javax.swing.JTextField txt_caridu;
    // End of variables declaration//GEN-END:variables
        
    //UNTUK DATA USER

    // Metode untuk menampilkan data
    private void viewData() {
        try (Connection k = koneksi.konek(); Statement s = k.createStatement(); ResultSet r = s.executeQuery("SELECT * FROM user")) {

            DefaultTableModel m = (DefaultTableModel) tabel_us.getModel();

            // Menghapus data lama dari tabel
            System.out.println("Menghapus data lama dari tabel");
            m.setRowCount(0);

            // Mengambil data dari database
            System.out.println("Mengambil data dari database...");
            while (r.next()) {
                String e = r.getString("id");
                String a = r.getString("fullname");
                String b = r.getString("username");
                String c = r.getString("password");
                String d = r.getString("level");

                Object[] data = {e, a, b, c, d};
                m.addRow(data);
            }

            m.fireTableDataChanged(); // Memberitahukan perubahan pada tabel
            System.out.println("Data berhasil dimuat ke tabel.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Metode untuk menghapus data
    private void hapusData() {
        int selectedRow = tabel_us.getSelectedRow();
        if (selectedRow != -1) {
            int confirm = JOptionPane.showConfirmDialog(this, "Apakah Anda yakin ingin menghapus data ini?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
            if (confirm == JOptionPane.YES_OPTION) {
                String id_pen = tabel_us.getModel().getValueAt(selectedRow, 0).toString();
                String query = "DELETE FROM user WHERE id = '" + id_pen + "'";

                try (Connection c = koneksi.konek(); Statement s = c.createStatement()) {
                    int result = s.executeUpdate(query);

                    if (result > 0) {
                        JOptionPane.showMessageDialog(this, "Data berhasil dihapus", "Sukses", JOptionPane.INFORMATION_MESSAGE);
                        viewData(); // Refresh tabel
                    } else {
                        JOptionPane.showMessageDialog(this, "Gagal menghapus data", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    JOptionPane.showMessageDialog(this, "Terjadi kesalahan", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Pilih data yang akan dihapus", "Peringatan", JOptionPane.WARNING_MESSAGE);
        }
    }
    
    // Metode untuk mengupdate data di database
    private void updateData(String id, String fieldName, String newValue) {
        String query = "UPDATE user SET " + fieldName + " = ? WHERE id = ?";

        try (Connection k = koneksi.konek(); PreparedStatement ps = k.prepareStatement(query)) {
            ps.setString(1, newValue);
            ps.setString(2, id);

            int result = ps.executeUpdate();

            if (result > 0) {
                JOptionPane.showMessageDialog(this, "Data berhasil diperbarui", "Sukses", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Gagal memperbarui data", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Terjadi kesalahan saat memperbarui data", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    // Metode untuk pencarian data
    private void pencarian() {
        String kataKunci = txt_caridu.getText().trim();

        if (!kataKunci.isEmpty()) {
            try (Connection k = koneksi.konek(); Statement s = k.createStatement()) {
                DefaultTableModel model = (DefaultTableModel) tabel_us.getModel();
                model.setRowCount(0); // Membersihkan tabel

                String q = "SELECT * FROM user WHERE username LIKE '%" + kataKunci + "%'";
                try (ResultSet r = s.executeQuery(q)) {
                    while (r.next()) {
                        String e = r.getString("id");
                        String a = r.getString("fullname");
                        String b = r.getString("username");
                        String c = r.getString("password");
                        String d = r.getString("level");

                        Object[] data = {e, a, b, c, d};
                        model.addRow(data);
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "Terjadi kesalahan saat melakukan pencarian", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            viewData(); // Tampilkan semua data jika kata kunci kosong
        }
    }

    // Implementasi `refreshData()` untuk memuat ulang data
    void refreshData() {
        viewData();
        viewDataProduk();
    }
    
    
    
    //UNTUK DATA PRODUK
    private void viewDataProduk() {
        Connection k = null;
        Statement s = null;
        ResultSet r = null;
        try {
            DefaultTableModel m = (DefaultTableModel) tabel_dp.getModel();
            String q = "SELECT * FROM produk";

            k = koneksi.konek();
            System.out.println("Koneksi berhasil."); // Debugging untuk memastikan koneksi berhasil
            s = k.createStatement();
            r = s.executeQuery(q);

            System.out.println("Menghapus data lama dari tabel");
            m.getDataVector().removeAllElements(); // Menghapus data lama dari tabel
            m.fireTableDataChanged(); // Mengupdate tabel setelah data lama dihapus

            System.out.println("Mengambil data dari database...");
            int rowCount = 0; // Variabel untuk menghitung jumlah baris yang diambil
            while (r.next()) {
                String a = r.getString("kode_produk");
                System.out.println("Kode Produk: " + a); // Debugging di dalam loop
                String b = r.getString("nama_produk");
                String c = r.getString("gambar_produk");
                String d = r.getString("kategori_produk");
                String e = r.getString("supplier");
                String f = r.getString("harga_jual");
                String g = r.getString("harga_beli");
                String h = r.getString("stok_produk");
                Object[] data = {a, b, c, d, e, f, g, h};
                m.addRow(data);
                rowCount++; // Menghitung jumlah baris yang ditambahkan
            }

            // Tampilkan jumlah baris yang berhasil diambil
            System.out.println("Jumlah baris yang diambil: " + rowCount);

            m.fireTableDataChanged(); // Memberitahukan perubahan pada tabel setelah data ditambahkan
            System.out.println("Data berhasil dimuat ke tabel.");
        } catch (Exception e) {
            e.printStackTrace(); // Untuk debugging jika ada error
        } finally {
            try {
                if (r != null) {
                    r.close();
                }
                if (s != null) {
                    s.close();
                }
                if (k != null) {
                    k.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }

        private void hapusDataProduk() {
        int selectedRow = tabel_dp.getSelectedRow();

        if (selectedRow != -1) {
            int confirm = JOptionPane.showConfirmDialog(this, "Apakah Anda yakin ingin menghapus data ini?", "Konfirmasi", JOptionPane.YES_NO_OPTION);

            if (confirm == JOptionPane.YES_OPTION) {
                // Mengambil kode produk (bukan id) dari tabel
                String kodeProduk = tabel_dp.getModel().getValueAt(selectedRow, 0).toString();
                String query = "DELETE FROM produk WHERE kode_produk = '" + kodeProduk + "'"; // Menggunakan kode_produk

                Connection c = koneksi.konek();

                try {
                    Statement s = c.createStatement();
                    int result = s.executeUpdate(query);

                    if (result > 0) {
                        // Jika hapus berhasil
                        JOptionPane.showMessageDialog(this, "Data berhasil dihapus", "Sukses", JOptionPane.INFORMATION_MESSAGE);

                        // Refresh tabel
                        viewData();
                    } else {
                        // Jika hapus gagal
                        JOptionPane.showMessageDialog(this, "Gagal menghapus data", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    JOptionPane.showMessageDialog(this, "Terjadi kesalahan", "Error", JOptionPane.ERROR_MESSAGE);
                } finally {
                    try {
                        if (c != null) {
                            c.close();
                        }
                    } catch (SQLException ex) {
                        ex.printStackTrace();
                    }
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Pilih data yang akan dihapus", "Peringatan", JOptionPane.WARNING_MESSAGE);
        }
    }


        private void pencarianDataProduk() {
        String kataKunci = txt_caridp.getText().trim();

        if (!kataKunci.isEmpty()) {
            try {
                DefaultTableModel model = (DefaultTableModel) tabel_dp.getModel();
                Connection k = koneksi.konek();
                Statement s = k.createStatement();

                model.setRowCount(0);

                // Pastikan tabel yang benar digunakan (produk), bukan user
                String q = "SELECT * FROM produk WHERE nama_produk LIKE '%" + kataKunci + "%'";
                ResultSet r = s.executeQuery(q);

                while (r.next()) {
                    String a = r.getString("kode_produk");
                    String b = r.getString("nama_produk");
                    String c = r.getString("gambar_produk");
                    String d = r.getString("kategori_produk");
                    String e = r.getString("supplier");
                    String f = r.getString("harga_jual");
                    String g = r.getString("harga_beli");
                    String h = r.getString("stok_produk");
                    Object[] data = {a, b, c, d, e, f, g, h};
                    model.addRow(data);
                }

                model.fireTableDataChanged();
                r.close();
                s.close();
                k.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            viewData();
        }
    }
}
