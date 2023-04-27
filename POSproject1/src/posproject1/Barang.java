/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posproject1;

import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jo
 */
class Barang {
    String kode;
    String nama;
    float harga;
    
    static ArrayList<Barang> daftarBarang;
    public static void loadBarangFromDB()
    {
        daftarBarang = new ArrayList<Barang>(); 
        Barang barang;
        try {
            Statement stmt = DBConnector.connection.createStatement();
            
            String sql = "SELECT *FROM barang";
            
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next())
            {
                barang =  new Barang();
                barang.kode = Integer.toString( rs.getInt("kode"));
                barang.nama = rs.getString("nama");
                barang.harga = rs.getFloat("harga");
                
                daftarBarang.add(barang);
            }
        } 
    
        catch (Exception ex) {
            System.out.println(ex);
        }
    }
    
   
}
