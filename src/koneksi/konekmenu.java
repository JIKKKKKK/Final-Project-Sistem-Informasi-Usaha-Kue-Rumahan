package koneksi;
import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class konekmenu {
    Connection con = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    
    private String sql;
   
    public String jumlahnastar;
      public String jumlahbakpia;
        public String jumlahbolu;
    public String jumlahbluder;
    public String jumlahbakpao;
    public String jumlahbrownies;
    public String totalharga;
    public String bayar;
    public String kembali;
    
    public void simpan ( ) throws SQLException{
        con = konek.GetConnection();
        String sql = "INSERT INTO menu(jumlahnastar, jumlahbakpia, jumlahbolu, jumlahbluder, jumlahbakpao, jumlahbrownies, totalharga, bayar, kembalian)VALUES (?,?,?,?,?,?,?,?,?)";
        pst = con.prepareStatement(sql);
        
        pst.setString(1, jumlahnastar);
        pst.setString(2, jumlahbakpia);
        pst.setString(3, jumlahbolu);
        pst.setString(4, jumlahbluder);
        pst.setString(5, jumlahbakpao);
        pst.setString(6, jumlahbrownies);
        pst.setString(7, totalharga); 
         pst.setString(8, bayar); 
          pst.setString(9, kembali); 
        pst.execute();
        pst.close();
    }
    
    public ResultSet UpdateJTable()throws SQLException{
        con = konek.GetConnection();
        sql= "select*from menumakanan";
        pst = con.prepareStatement(sql);
        rs = pst.executeQuery();
        return rs;
    }
      
}



