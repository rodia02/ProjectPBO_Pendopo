/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package posproject1;


import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.TimeZone;
import javax.swing.JOptionPane;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

/**
 *
 * @author jo
 */
public class POSFrame extends javax.swing.JFrame {
    
    ArrayList<Barang> daftarBarang;
    
    TableModel daftarModel;
    
    int jumlahBelanja = 0;
    
    
     /**
     * Creates new form POSFrame
     */
    public POSFrame() { 
        
        DBConnector.initDBConnection();
        
        Barang.loadBarangFromDB();
        System.out.println(Barang.daftarBarang.size());// menampilkan jumlah barang yang ada didatabse
        
        daftarBarang = Barang.daftarBarang;
        
        initComponents();
        
        daftarModel = daftarTable.getModel();
        daftarModel.addTableModelListener(new TableModelListener() {
            @Override
            public void tableChanged(TableModelEvent tme) {
                if (tme.getColumn() == 4)
                {
                    int baris = tme.getFirstRow();
                    int kolom = tme.getColumn();
                    
                    float harga =  (float)daftarModel.getValueAt(baris, 3);
                    int jumlah = (int)daftarModel.getValueAt(baris,4);
                    
                    try {
                        Integer.valueOf(jumlah);
                    } catch (NumberFormatException e) {
                      JOptionPane.showMessageDialog(null, "Anda salah memasukkan input angka pada jumlah barang");
                      return;
                    }

                    
                    float total = harga*jumlah;
                    daftarModel.setValueAt(total, baris, 5);
                    
                float totalBelanja = 0.0f;
                total = 0.0f;
                
                //WARNING jumlahBelanja ini belum update ketika listener ini dipanggil
                for (int i=0; i<jumlahBelanja;i++){
                    total =  (float)daftarModel.getValueAt(i, 5);
                    totalBelanja =  totalBelanja + total;
                    //Transaksi transaksi = new Transaksi(i+1 , new Date(),jumlah, totalBelanja);
                    //daftarTransaksi.add(transaksi);
                }
                int totalBelanjaInt =(int)totalBelanja;
                totalBelanjaTextField.setText(String.format("%,d",totalBelanjaInt));
                
                }   
            }
            
        });
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu4 = new javax.swing.JPopupMenu();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        kodeTextField = new javax.swing.JTextField();
        hargaTextField = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        daftarTable = new javax.swing.JTable();
        namaTextField = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        totalBelanjaTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        dibayarTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        kembalianTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Code");

        jLabel2.setText("Nama");

        jLabel3.setText("Harga");

        kodeTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kodeTextFieldActionPerformed(evt);
            }
        });

        hargaTextField.setEditable(false);

        daftarTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "No", "Kode", "Nama", "Harga Satuan", "Jumlah", "Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Float.class, java.lang.Integer.class, java.lang.Float.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(daftarTable);
        if (daftarTable.getColumnModel().getColumnCount() > 0) {
            daftarTable.getColumnModel().getColumn(0).setResizable(false);
            daftarTable.getColumnModel().getColumn(0).setPreferredWidth(5);
            daftarTable.getColumnModel().getColumn(1).setResizable(false);
            daftarTable.getColumnModel().getColumn(1).setPreferredWidth(40);
            daftarTable.getColumnModel().getColumn(2).setResizable(false);
            daftarTable.getColumnModel().getColumn(2).setPreferredWidth(100);
            daftarTable.getColumnModel().getColumn(3).setResizable(false);
            daftarTable.getColumnModel().getColumn(3).setPreferredWidth(70);
            daftarTable.getColumnModel().getColumn(4).setResizable(false);
            daftarTable.getColumnModel().getColumn(4).setPreferredWidth(20);
            daftarTable.getColumnModel().getColumn(5).setResizable(false);
            daftarTable.getColumnModel().getColumn(5).setPreferredWidth(70);
        }

        namaTextField.setEditable(false);

        totalBelanjaTextField.setEditable(false);

        jLabel4.setText("Jumlah yang Dibayar");

        dibayarTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dibayarTextFieldActionPerformed(evt);
            }
        });
        dibayarTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                dibayarTextFieldKeyReleased(evt);
            }
        });

        jLabel5.setText("Total Belanja");

        kembalianTextField.setEditable(false);

        jLabel6.setText("Kembalian");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2)
                    .addComponent(jSeparator1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(namaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(hargaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(kodeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jSeparator3)
                                .addGap(87, 87, 87)
                                .addComponent(jLabel5))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(kembalianTextField, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(dibayarTextField, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(totalBelanjaTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(kodeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(hargaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(namaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(totalBelanjaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dibayarTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kembalianTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void kodeTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kodeTextFieldActionPerformed
        // TODO add your handling code here:
        String kodeInput = kodeTextField.getText(); 
        
        //JPane
        
        try {
            Integer.valueOf(kodeInput);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Kode barang harus berupa angka");
        }
        if(kodeInput.isEmpty()){
            JOptionPane.showMessageDialog(null, "Kode barang kosong");
            
        } else{
        Barang tempBarang;
        for (int i = 0; i < daftarBarang.size(); i++)
        {
            tempBarang = daftarBarang.get(i);
            
            //WARNING: tempIndex digunakan untuk index baris 
            //dimulai dari index 0 
            int tempIndex = 0;
            
            if (tempBarang.kode.equals(kodeInput))
            {
                tempIndex = jumlahBelanja;
                jumlahBelanja++;
                
                System.out.println("Barang Ditemukan");
                i = daftarBarang.size();
                namaTextField.setText(tempBarang.nama);
                hargaTextField.setText(Float.toString(tempBarang.harga));
                
                daftarModel.setValueAt(jumlahBelanja, tempIndex, 0);
                daftarModel.setValueAt(kodeInput, tempIndex, 1);
                daftarModel.setValueAt(tempBarang.nama, tempIndex, 2);
                daftarModel.setValueAt(tempBarang.harga, tempIndex, 3);
                daftarModel.setValueAt(1, tempIndex, 4);
                daftarModel.setValueAt(tempBarang.harga, tempIndex, 5);
                
            }
            else{
            JOptionPane.showMessageDialog(null, "Kode barang tidak ada");
            break;
            }

        }
            
        }
       
    }//GEN-LAST:event_kodeTextFieldActionPerformed

    private void dibayarTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dibayarTextFieldActionPerformed
        // TODO add your handling code here:
        
        String totalBelanjaString = totalBelanjaTextField.getText();
        totalBelanjaString = totalBelanjaString.replace(",","");
        int totalBelanjaInt = Integer.valueOf(totalBelanjaString);
        
        String dibayarString = dibayarTextField.getText();
        dibayarString = dibayarString.replace(",","");
        int dibayarInt = Integer.valueOf(dibayarString);
        
        if(dibayarInt<totalBelanjaInt){
            JOptionPane.showMessageDialog(null, "Jumlah yang dibayar kurang dari total harga");
        }else{
            
        int kembalianInt = dibayarInt - totalBelanjaInt;
        
        kembalianTextField.setText(String.format("%,d",kembalianInt));
                   
        //TRANSAKSI
        ArrayList<Transaksi> transaksi = new ArrayList();
        Transaksi transsaksi = new Transaksi();
        transsaksi.totalTransaksi = Integer.valueOf(totalBelanjaString);
        transsaksi.bayarTransaksi = Integer.valueOf(dibayarString);
        transsaksi.kembalianTransaksi = kembalianInt;
        //TIME
        Date date = new Date();
        SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        s.setTimeZone(TimeZone.getTimeZone("GMT+7"));      
        transsaksi.waktuTransaksi = s.format(date);
        //
        String deskripsi = "";//input dari nama dan jumlah
        String kodeTransaksi = "";
        String barangTransaksi = "";
        int jumlahTransaksi =0;
        for (int i = 0; i < jumlahBelanja; i++) {
            kodeTransaksi = (String) daftarModel.getValueAt(i, 1);//kode
            barangTransaksi = (String) daftarModel.getValueAt(i, 2);//nama
            jumlahTransaksi = (int) daftarModel.getValueAt(i, 4);//total
            transsaksi.informasiBarang(barangTransaksi, jumlahTransaksi);
                       
            deskripsi = deskripsi + barangTransaksi + " x" + Integer.toString(jumlahTransaksi);
            if (i != jumlahBelanja-1) {
                deskripsi += ", ";
            }
        }
        transsaksi.deskripsiBarang = transsaksi.deskripsiBarang + deskripsi;
        //Database
            try {
            Statement stmt = DBConnector.connection.createStatement();
            String sql = "INSERT INTO transaksi values (null,"+kodeTransaksi+",'"+transsaksi.deskripsiBarang
                    +"',"+transsaksi.totalTransaksi+","+transsaksi.bayarTransaksi+","+transsaksi.kembalianTransaksi+",'"
                    +transsaksi.waktuTransaksi+"')";
            stmt.executeUpdate(sql);
            System.out.println("Data berhasil di Input");
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        transaksi.add(transsaksi);
        
        //
            System.out.println("=============================");
            System.out.println("         TRANSAKSI           ");
            System.out.println("     Tanggal Transaksi       ");
            System.out.println(transsaksi.waktuTransaksi);
            System.out.println("        Daftar Barang        ");
            System.out.println(transsaksi.deskripsiBarang);
            System.out.println("Jumlah Transaksi : Rp." + totalBelanjaInt);
            System.out.println("Dibayar          : Rp." + dibayarInt);
            System.out.println("Kembalian        : Rp." + (dibayarInt-totalBelanjaInt));
            System.out.println("=============================");
           
    }//GEN-LAST:event_dibayarTextFieldActionPerformed
 }
    private void dibayarTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dibayarTextFieldKeyReleased
        // TODO add your handling code here:
        
        String dibayarString = dibayarTextField.getText();
        dibayarString =dibayarString.replace(",","");
        int dibayarInput = Integer.valueOf(dibayarString);
        dibayarTextField.setText(String.format("%,d",dibayarInput));
        
    }//GEN-LAST:event_dibayarTextFieldKeyReleased

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
            java.util.logging.Logger.getLogger(POSFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(POSFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(POSFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(POSFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new POSFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable daftarTable;
    private javax.swing.JTextField dibayarTextField;
    private javax.swing.JTextField hargaTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField kembalianTextField;
    private javax.swing.JTextField kodeTextField;
    private javax.swing.JTextField namaTextField;
    private javax.swing.JTextField totalBelanjaTextField;
    // End of variables declaration//GEN-END:variables
}
