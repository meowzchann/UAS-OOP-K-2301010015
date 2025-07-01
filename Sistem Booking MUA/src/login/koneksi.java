/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Ni Putu Ayu Sri Ratnasari (2301010015)
 */
public class koneksi {
    public static Connection getConnection(){
        Connection conn = null; 
        String url = "jdbc:mysql://localhost:3306/akni_book";
        String user = "root";
        String password = "";
        try {
            conn = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            System.out.println(e);
        }
        return conn;}
    
    public static void main(String[] args) {
        try {
            Connection c = koneksi.getConnection();
            System.out.println(String.format("Koneksi ke database"
                    + "%s" + "Berhasil", c.getCatalog()));
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}
    


