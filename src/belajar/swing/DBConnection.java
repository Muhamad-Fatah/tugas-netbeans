/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package belajar.swing;

import java.sql.*;

/**
 *
 * @author Fatah
 */
public class DBConnection {

    static final String DB_URL = "jdbc:mysql://localhost:3306/belajar";
    static final String DB_USER = "root";
    static final String DB_PASS = "";

    public static Connection getConnection() throws SQLException {
        Connection conn = null;

        try {
            conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
            System.out.println("Koneksi berhasil");
        } catch (SQLException se) {
            System.out.println("Gagal terhubung: " + se.getMessage());
        }

        return conn;
    }
}
