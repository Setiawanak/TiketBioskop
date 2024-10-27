import java.sql.*;
import javax.swing.JOptionPane;

public class Koneksi {
    
    Connection conn;
    Statement st;
    ResultSet rs;

    //untuk koneksi ke database di xampp
    public Connection setKoneksi() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/penyimpanan", "root", "");
            st = conn.createStatement();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Koneksi Gagal : " + e);
        }
        return conn;
    }
    
}
