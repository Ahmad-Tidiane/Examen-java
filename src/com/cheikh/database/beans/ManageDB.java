/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cheikh.database.beans;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author tidia
 */
public class ManageDB {
    private static Connection conn = null;
    
    public Connection ConnectionDB() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ProjetDakarDistribution", "root","");
            
        } catch (Exception ex) {
            Logger.getLogger(ManageDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conn;
    }
}
